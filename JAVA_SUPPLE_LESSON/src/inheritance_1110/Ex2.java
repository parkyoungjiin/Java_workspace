package inheritance_1110;


public class Ex2 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		System.out.println("원의 반지름 : " + c.radius + "cm");
		System.out.println("-------------");
		
		Rectangle r = new Rectangle();
		
		r.draw();
		System.out.println("사각형의 첫번째 변의 길이 : " + r.line1 + "cm");
		System.out.println("사각형의 두번째 변의 길이 : " + r.line2 + "cm");
		
		System.out.println("==============================================");
		// 별도로 정의한 공통메서드 draw() 에 Circle, Rectangle 인스턴스 전달하여
		// 해당 메서드에서 각 인스턴스의 draw() 메서드를 호출
//		draw1(c);
//		draw2(r);
		draw(c); // Shape s = c; 와 동일(업캐스팅)
		draw(r); // Shape s = r; 와 동일(업캐스팅)
		System.out.println("==============================================");
		
		//다형성 배열 적용
		
		Circle[] cArr = {new Circle(), new Circle()};
		//Circle 타입 배열 2개에 Circle 인스턴스 각각 저장 (객체의 주소가 들어감)
		System.out.println(cArr[0].radius);// 첫 번째 Circle의 radius 메서드 호출
		
		
//		Circle[] cArr2 = {new Circle(), new Rectangle()};
		Shape[] cArr2 = {new Circle(), new Rectangle()};
		// Circle 배열에 Rectangle에 못담음 => 이 때 Shape와 Object 타입으로 설정할 경우 가능
		//공통이 누군 지 확인
		
		//꺼낼 때 다운캐스팅 해야 하는데 이 때 instanceof를 사용하여 검사하여 진행함.
		
		for(Shape s : cArr2) { // 향상된 for 문 -> 담을 객체 : 넣을 객체
			s.draw();
		}
		
		
	}
	
	// Circle 과 Rectangle 타입 객체를 모두 전달받을 수 있도록
	// 두 클래스의 공통 부모인 슈퍼클래스 타입 Shape 타입으로 매개변수를 선언하면
	// 인스턴스 전달과정에서 모두 Shape 타입으로 업캐스팅 되므로
	// 공통 메서드인 draw() 호출이 가능하다!
	public static void draw(Shape s) {
		s.draw(); // Circle 또는 Rectangle 객체의 각 draw() 메서드가 호출됨
		// 단, Shape 타입으로 업캐스팅 후에는 공통 멤버만 접근 가능하므로
		// Circle, Rectangle 각각의 멤버에는 접근이 불가능하다!
//		System.out.println("원의 반지름 : " + s.radius);
		
//		Circle c = (Circle)s;
		// 주의! Circle 뿐만 아니라 Rectangle 인스턴스도 전달되므로
		// 함부로 Circle 타입으로 다운캐스팅하면 오류 발생 가능성 있다!
		// => 따라서, 변환 전 instanceof 연산자를 통해 변환 가능 여부를 판별하여
		//    결과값이 true 일 경우에만 변환을 수행해야한다!
		// 기본 문법 : if(참조변수명 instanceof 클래스타입) {}
		if(s instanceof Circle) { // s 는 Circle 입니까?
			// 결과값이 true 일 경우 Circle 타입으로 형변환이 가능하다는 의미!
//			Circle c = s;
			Circle c = (Circle) s;
			System.out.println("원의 반지름 : " + c.radius);
		} else if(s instanceof Rectangle) { // s 는 Rectangle 입니까?
			// Rectangle 타입으로 형변환 후 멤버변수 값 출력
//			Rectangle r = s;
			Rectangle r = (Rectangle) s;
			System.out.println("사각형 각 변의 길이 : " + r.line1 + ", " + r.line2);
		}
		
	}
	

}

class Shape {
	public void draw() {
		System.out.println("도형 그리기!");
	}
}

class Circle extends Shape {
	double radius = 3.0;
}

class Rectangle extends Shape{
	double line1 = 3.0, line2 = 2.5;
}