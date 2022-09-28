package polymorphism;

public class selfstudy {

	public static void main(String[] args) {

		int a = 10;
		long l = a; // int 타입 값이, long 타입으로 변환된다.
		
		Child c = new Child();
		c.parentPrn();
		c.childPrn();
		// c는 2개의 메서드에 접근이 가능하다.
		
		//Parent 타입 변수 p를 선언하여 Child 클래스 인스턴스를 전달
		Parent p; //슈퍼클래스(부모) 타입 참조 변수 p 선언
		p = c; // 서브클래스의 인스턴스 주소를 부모 변수에 전달
		// -> Child 타입 -> Parent 타입으로 변환된다. (업캐스팅)
		
		
		
	}

}

class Parent {
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn() 메서드!");
	}
}

class Child extends Parent {
	
	public void childPrn() {
		System.out.println("서브클래스의 parentPrn() 메서드!");
	}
	
	
}
