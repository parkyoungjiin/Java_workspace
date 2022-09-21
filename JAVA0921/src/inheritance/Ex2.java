package inheritance;

public class Ex2 {

	public static void main(String[] args) {
/*
 * 상속의 장점
 * 1. 코드 재사용이 증가
 * 2. 코드의 유지보수성이 용이해짐
 * 
 */
		
	Point3D p = new Point3D();
	p.print3D();
		
	}

}//Ex2  클래스 끝

class Point2D{
	int x = 10;
	int y = 20;
	
	public void print2D() {
//		System.out.println("x좌표 :" + x + " y좌표 :" + y);
		System.out.print(x  + ", " + y);
	}
}

class Point3D extends Point2D{
	int z = 30;
	
	public void print3D() {
//		x, y좌표는 슈퍼클래스인 point3d의 클래스의
//		print2d() 메서드가 출력하므로 해당 메서드를 호출해서 출력하고
//		자신의 클래스의 멤버인 z좌표만 별도로 출력
		print2D();
		System.out.println(", " + z);
	}
	
}