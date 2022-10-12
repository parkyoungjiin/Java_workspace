package interface_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 인터페이스
		 * - 클래스가 아니므로, 선언 시 class 키워드를 사용하지 않고
		 *   interface 키워드를 사용하여 정의
		 *   
		 * - 인터페이스는 상수, 추상메서드만 가질 수 있다.
		 *   => 모든 멤버변수는 public static final 이 붙은 상수로 취급된다.
		 *   (public static final은 생략 가능)
		 *   static 으로 인해 클래스명만으로 접근 가능
		 *   public 으로 인해 누구나 접근 가능
		 *   =>모든 메서드는 public abstract 가 붙은 추상메서드로 취급된다.
		 *   
		 *   추상메서드를 포함하므로 객체 생성이 불가능하다.
		 *   => 단, 참조변수 타입으로는 사용이 가능하다(=다형성을 통한 업캐스팅 가능)
		 *   
		 *   서브클래스(구현클래스)에서 인터페이스를 상속받아 구현해야 하는 경우 implements 키워드를 사용 (클래스는 확장이지만, 인터페이스는 상속받아 구현(implement)의 개념이 강하다)
		 *   
		 */
		MySubClass msc = new MySubClass();
		msc.method1();
		msc.method2();
		msc.method3();
		
		System.out.println("-------------------");
		//업캐스팅을 활용한 다형성 적용
		MyExInterface mi2 = new MySubClass();
		mi2.method1();
		mi2.method2();
		mi2.method3();
		
		System.out.println();
	}
	

}

interface MyExInterface{
	int NUM1 = 10;
	int NUM2 = 20;
	
	//인터페이스는 생성자를 가질 수 없다.
	//인터페이스 내 모든 메서드는 추상메서드
	public abstract void method1(); 
	void method2(); // public abstract  가 생략되어 있음 (일반메서드가 아닌, 추상메서드다)
	void method3();
}

class MySubClass implements MyExInterface{

	@Override
	public void method1() {
		System.out.println("서브클래스에서 구현한 추상메서드 method1()");
		
	}

	@Override
	public void method2() {
		System.out.println("서브클래스에서 구현한 추상메서드 method2()");
		
	}
	public void method3() {
		//인터페이스 내에 모든 메서드는 public 접근제한자만 사용
		System.out.println("서브클래스에서 구현한 추상메서드 method3()");
	}
	
}
abstract class MyClass{
	public static final int NUM1 = 10;
	int NUM2 = 20;
	
//추상클래스는 생성자를 가질 수 있지만, 인터페이스는 생성자를 가질 수 없다.
	public MyClass() {}
	public abstract void method1();
	// -> 추상메서드를 갖는 클래스는 반드시 추상클래스로 선언해야 한다.
	
	public void method() {}
	// => 추상클래스는 일반 메서드도 가질 수 있다.
}