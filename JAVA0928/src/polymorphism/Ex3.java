package polymorphism;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 동적 바인딩
		 * - 상속 관계에서 업캐스팅 후 (부모 = 자식) 메서드를 호출 할 때
		 *   컴파일(번역) 단계에서의 실행 대상과, 실제 실행 단계에서의
		 *   실행 대상이 달라진 것
		 *   
		 * - 참조 변수의 타입과 무관하게 실제 인스턴스의 메서드를 실행
		 */
		
		// 슈퍼클래스 타입 인스턴스 생성
		Parent3 p = new Parent3();
		
		p.parentPrn(); //부모의 메서드
		
		// 서브클래스 타입 인스턴스 생성
		
		Child3 c = new Child3();
		c.ChildPrn();
		c.parentPrn(); //오버라이딩 된 자식의 메서드
		
		System.out.println("-----------------------");
		
		p = c; //업캐스팅 (부모 = 자식) == Parent3 p = new Child3();
		
		p.parentPrn(); 
		//원래는 Parent3.parentPrn이지만, 실행하면 오버라이딩 된 child3.parentPrn이 나온다
		// 메서드 호출 코드를 작성하는 시점 (컴파일 시점)에서는
		// 참조변수 타입인 Parent 클래스의 parentPrn() 메서드를 호출하는 코드지만
		// 실제 실행하는 시점에서 참조변수에 저장된 인스턴스가 child 인스턴스이므로,
		// 실제 호출되는 메서드는 child 타입의 오버라이딩 된 메서드가 호출된다.
		// 즉, 컴파일 단계에서의 실행 대상과 실행단계에서의 실행대상이 다를 수 있다.
		// 이를 동적 바운딩이라 한다. (동적 바운딩을 통해 다형성을 만든다)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

class Parent3{
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn() 출력");
	}
}

class Child3 extends Parent3 {
	public void ChildPrn() {
		System.out.println("서브클래스의 childPrn()");
	}

	@Override
	public void parentPrn() {
		System.out.println("서브클래스에서 ");
	}
}
