package polymorphism;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 다형성
		 * - 하나의 데이터타입(참조변수)으로 여러 인스턴스를 참조하는 특성
		 * - 어떤 인스턴스를 업캐스팅하여 슈퍼클래스타입 변수로 다루면
		 *    하나의 슈퍼클래스 타입으로 여러 서브클래스 타입 인스턴스를 다룰 수 있다.
		 *    
		 */
		
		//Circle 인스턴스(c) 생성
		
		Circle c = new Circle();
		
		c.circlePaint();
		System.out.println("--------------------");
		Rectangle r = new Rectangle();
		r.rdraw();
		
		System.out.println("--------------------");
		
		Triangle t = new Triangle();
		t.design();
		
		System.out.println("--------------------");
		c.draw();
		r.draw();
		t.draw();
		
		//슈퍼클래스의 메서드를 상속받아 오버라이딩 하는 경우
		//코드의 통일성이 향상될 수 있다.
		
		System.out.println("---------------------");
		
		//코드의 통일성을 더 향상시키기 위한 방법 : 업캐스팅 활용
		// -> Cricle, Rectangle, Triangle의 공통 슈퍼클래스인 Shape 타입(s)으로 세 인스턴스를 컨트롤 가능
		// Circle -> Shape 타입 업캐스팅
		//Circle -> Shape 타입 업캐스팅
		Shape s = new Circle();
		//Circle -> Shape 타입 업캐스팅
		s.draw(); //동적바운딩으로 인해 circle의 draw가 출력
		
		// Rectangle -> Shape 업캐스팅
		s = new Rectangle();
		s.draw(); //Rectangle의 draw가 출력
		
		s = new Triangle();
		s.draw(); //Triangle의 draw가 출력

		System.out.println("--------------------------");
		
		//다형성을 배열에 적용시키는 경우
		// -> 슈퍼클래스 타입으로 배열을 생성하여
		// 배열의 각 인덱스에 각각의 서브클래스 인스턴스를 저장 가능 
		
//		Shape[] sArr = new Shape[3]; //shape 타입 배열 3개를 생성
//		
//		sArr[0] = new Circle(); // Circle -> Shape에 저장하여 업캐스팅이 자동으로 일어남.
//		
//		//1번 인덱스
//		sArr[1] = new Rectangle(); //Rectangle -> Shape에 저장
//		sArr[2] = new Triangle(); 
		
		// 한 번에 업캐스팅이 가능하다.
		
		Shape[] sArr = {new Circle(), new Rectangle(), new Triangle()};
		
//		sArr[0].draw();
//		sArr[1].draw();
//		sArr[2].draw();
		
//		for문 사용해서 호출
		
		for(int i = 0 ; i < sArr.length ; i++) {
			sArr[i].draw();
		}
		
		System.out.println("=======================");
		
		//메서드에 다형성 활용
		//1. 이미 다형성이 적용된 배열을 메서드 파라미터로 전달
		
		
		polymorphismDraw();
		
		
		//2. 메서드 파라미터로 인스턴스를 직접 전달
		
		
		
		
	}//main 메서드 끝

	
	
	public static void polymorphismDraw() {
		 
	}
}//Ex4 클래스 끝

//여러 도형의 특징을 공통적으로 포함하는 슈퍼클래스 Shape 정의
class Shape {
	//여러 도형의 공통점인 '그리다' 기능을 수행하는 draw 메서드
	
	public void draw() {
		System.out.println("도형 그리기!");
	}
}//Shape 클래스 끝

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("원 그리기!");
	}
	
	public void circlePaint() {
		System.out.println("원 그리기!");
	}
	
}// Circle 클래스 끝

class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("사각형 그리기!");
	}
	
	public void rdraw() {
		System.out.println("사각형 그리기!");
	}
	
	
}//Rectangle 클래스 끝


class Triangle extends Shape {

	@Override
	public void draw() {
		System.out.println("삼각형 그리기!");
	}
	public void design() {
		System.out.println("삼각형 그리기!");
	}
	
}//Triangle 클래스 끝