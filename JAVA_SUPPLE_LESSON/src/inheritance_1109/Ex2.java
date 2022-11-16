package inheritance_1109;

public class Ex2 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		System.out.println("원의 반지름 :" + c.radius + "cm") ;
		
		Rectangle re = new Rectangle();
		re.draw();
		System.out.println("사각형의 첫번째 변 길이: " + re.line1);
	System.out.println("--------------------");
		draw(c);
		draw(re);
	}
//	public static void draw1(Circle circle) {
//		circle.draw();
//	}
	public static void draw(Shape s) {
		s.draw();
	}
//	public static void draw2(Rectangle r) {
//		r.draw();
//	}
}

class Shape {
	public void draw() {
		System.out.println("도형 그리기!");
	}
}
class Circle extends Shape{
	double radius = 3.0;
}

class Rectangle extends Shape{
	double line1 = 3.0, line2 = 2.5;
}