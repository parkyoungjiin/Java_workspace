package interface_;

public class Test5 {

	public static void main(String[] args) {
		
		Photoshop p = new Photoshop();
		
		p.draw(new Circle()); // Shape s = new Circle(); 과 동일
		p.draw(new Rectangle()); // Shape s = new Rectangle(); 과 동일 
		System.out.println("---------------------");
		Circle c = new Circle();
		c.setRadius(3.14);
		c.draw();
		
		Rectangle re = new Rectangle();
		re.setHeight(5.5);
		re.setWidth(3);
		re.draw();
		
		
	}

}
interface shape{
	public abstract void draw();
}

class Circle implements shape{
	private double radius;

	@Override
	public void draw() {
		System.out.println("원 그리기 - 반지름 : "+ radius);
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}

class Rectangle implements shape{
	private double width, Height;
	

	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public void setHeight(double height) {
		Height = height;
	}


	@Override
	public void draw() {
		System.out.println("가로 :" + width + " 세로 :" + Height  + "의 사각형 그리기!");
	}
	
}

class Photoshop {
	// draw() 메서드 정의
	// => Circle, Rectangle 인스턴스를 전달받아 해당 인스턴스의 draw() 호출
	//    두 인스턴스의 공통 타입으로 Shape 인터페이스를 파라미터 타입으로 지정
	public void draw(shape s) { // Circle & Rectangle -> Shape 업캐스팅
		// Shape 타입 변수의 draw() 메서드 호출 시 실제 인스턴스의 draw() 호출됨
		s.draw();
	}
}
