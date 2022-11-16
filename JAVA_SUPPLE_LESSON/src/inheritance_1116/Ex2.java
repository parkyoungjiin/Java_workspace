package inheritance_1116;

public class Ex2 {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		
		s = new Rectangle();
		s.draw();
	}

}
class Shape {
	public void draw() {
		// **** 슈퍼클래스에서 서브클래스의 상세 메서드까지 모두 구현하는 방법 ****
		// 인스턴스 판별-> 다운캐스팅-> 해당 멤버에 접근
		
		// 현재 인스턴스를 가르키는 참조변수 this를 사용하면
		// 전달받은 인스턴스에 따라 각각의 참조값이 달라진다.
		if(this instanceof Circle) {// 현재 인스턴스가 Cricle 인지 판별
			
			Circle c = (Circle)this; // 다운 캐스팅
			System.out.println("반지름 " + c.radius + "cm 원 그리기!");

		} else if(this instanceof Rectangle) {// 현재 인스턴스가 Rectangle 인지 판별
			Rectangle r  = (Rectangle)this; // 다운 캐스팅
			System.out.println("반지름 " + r.line1+ "cm 사각형 그리기!");
			
		} else if(this instanceof Shape) {// 현재 인스턴스가 Shape 인지 판별
		System.out.println("도형 그리기!");
			
		}
		
		
		// 오버라이딩 되면 실행되지 않는 코드가 된다.
		// 단 , 상속(다형성)을 위해 메서드 자체를 제거할 수는 없다.
		// 즉, 불필요한 코드가 발생한다.
		//불필요 하지 않게 만들려면 부모 클래스에 모든 메서드를 작성.
	}
}
class Circle extends Shape{
	double radius = 3.0;

//	@Override
//	public void draw() {
//		System.out.println("반지름 " + radius + "cm 원 그리기!");
//	}
	
	
	
}

class Rectangle extends Shape{
	double line1 = 3.0, line2 = 2.5;
	
//	@Override
//	public void draw() {
//		System.out.println("사각형 그리기!");
//	}
}