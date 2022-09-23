package method_overriding;

public class Ex {

	public static void main(String[] args) {
		/*
		 * [메서드 오버라이딩]
		 * - 슈퍼클래스로부터 상속받은 메서드를 서브클래스에서 다시 재정의하는 것
		 * - 기본 슈퍼클래스의 메서드와 동일하게 생긴 메서들르 정의하게 되므로
		 *   서브클래스에서는 더 이상 슈퍼클래스의 메서드가 보이지 않음.
		 *   => 슈퍼클래스의 메서드를 덮어쓰기 때문에 자신의 메서드만 보이게 된다.
		 * - 슈퍼클래스의 메서드에 새로운 기능을 추가하는 등
		 *    기존에 상속된 메서드 내용을 변경하는 경우 사용
		 *    
		 *    
		 * <오버라이딩 규칙>- > 부모의 메서드를 자식 클래스에서 재정의 하는 기능
		 * 1. 상속 관계 필수
		 * 
		 * 2. 메서드 시그니처(메서드명, 리턴타입, 파리미터)가 일치해야 한다.
		 *  => 리턴타입은 부모와 같거나 서브클래스 타입으로 변경이 가능
		 *  
		 * 3. 접근제한자는 같거나 넓은 범위로만 변경이 가능하다. (좁아질 수가 없다.)
		 * 
		 * 4. 오버라이딩 단축키
		 * - Alt + Shift + S -> V
		 * => 단, 이미 오버라이딩 된 메서드는 표시되지 않는다.
		 * 
		 * 
		 */
		
		
		Child c = new Child();
		c.childPrn(); //서브클래스에서 정의한 메서드
		System.out.println("-----------------------");
		c.parentPrn(); //슈퍼클래스의 상속을 받은 메서드\
		c.parentPrn2();
		c.parentPrn3();
		
		
		System.out.println("-----------------------");
		Student s = new Student();
	
		s.sleep();
		s.sleep(1);
		
		System.out.println("-----------------------");
		Animal a = new Animal();
		
		a.cry();
		
		Dog d = new Dog();
		
		d.cry();
		
		Cat ca = new Cat();
		
		ca.cry();
		
		
		
		
	}//main 메서드 끝

}// Ex 클래스 끝
class Parent {
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn()");
	}
	public Object parentPrn2() {
		System.out.println("슈퍼클래스의 parentPrn2()");
		return null; 
		//리턴타입이 Object로 지정될 경우 모든 방식으로 리턴이 가능하다.
		
	}
	
	public String parentPrn3() {
		System.out.println("슈퍼클래스의 parentPrn3()");
		return null;
	}
	
	
}//Parent 클래스 끝
class Child extends Parent{
	public void childPrn() { //메서드 (리턴타입이 있어서 생성자가 될 수 없음)
		System.out.println("서브클래스의 childPrn()");
	}
	
	
	// 슈퍼클래스로부터 상속받은 parentPrn()메서드 오버라이딩
		// => 슈퍼클래스의 메서드 이름, 리런타입, 파라미터가 동일한 메서드 재정의
		// => 슈퍼클래스가 가진 parentPrn() 메서드는 child 인스턴스에서 더 이상 보이지 않게 된다.
		
	public void parentPrn() { //부모 타입이 void 이기에, 자식도 void로 해야한다.
		System.out.println("서브클래스에서 오버라이딩된 parentPrn()");
	} //부모의 메서드가 아니라, 자식에서 오버라이딩(재정의)한 메서드를 실행한다.
	
	
	
	
	public Object parentPrn2() {
		System.out.println("서브클래스에서 오버라이딩된 parentPrn2()");
		// **Prn2의 접근 제한자를 private로 할 경우** => Cannot reduce the visibility of the inherited method from Parent
		// 접근제한자는 작게 만들게 될 경우 오류가 발생한다. (같거나 크게 만들 떄는 가능하다.)
		// => ***중요***오버라이딩 시 슈퍼클래스의 접근제한자보다 좁아질 수 없다.
		// - 부모가 public 일 경우, 자식은 public으로만 지정 가능하다
		// - **중요** 접근제한자 순위 : public > protected > default > private
		return null;
	}


	@Override
	public String parentPrn3() {
		System.out.println("서브클래스에서 오버라이딩된 parentPrn2()");
		return null;
	}
	
	
	
	
	//오버라이딩 시 슈퍼클래스의 리턴타입보다 서브클래스의 타입을 명시할 수 있다.
	
	
	
}// Child 클래스 끝

class Person {
	public void sleep() {
		System.out.println("잠자기");
	}
	
	
}
// 주의 ! @Override 어노테이션이 붙어 있을 경우
// 오버로딩을 수행하거나, 오버라이딩 규칙 위반 시 컴파일 에러가 발생한다.
class Student extends Person {

	@Override
	public void sleep() {
		System.out.println("엎드려 잠자기!");
	}
	public void sleep(int min) {
		System.out.println(min + "분 만큼 엎드려 잠자기!");
	}
	//The method sleep(int) of type Student 
	//must override or implement a supertype method
}

class Animal{
	String name;
	int age;
	
	public void cry() {
		System.out.println("동물 울음소리");
	}
}// Animal 클래스 끝

class Dog extends Animal{
	public void cry() {
		System.out.println("멍멍!");
	}
}
class Cat extends Animal{
	public void cry() {
		System.out.println("야옹!");
	}
}

