package abstract_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 추상메서드
		 * 1. 메서드 바디( => {} 중괄호가 존재하지 않는 메서드 = 미완성 메서드)
		 * 2. 메서드 선언부 접근제한자 뒤에 abstract 키워드를 붙여서 선언
		 * => 바디가 없으므로 메서드 마지막을 세미콜론으로 마무리
		 * 
		 * 3. 메서드 실행코드(바디)가 없으므로 외부에서 호출되면 안되는 메서드
		 * 
		 * - 기본 문법
		 * [접근제한자] abstract 리턴타입 메서드명([매개변수]);
		 * 
		 * 
		 * 추상클래스
		 * 1. 인스턴스를 생성할 수 없는 미완성 클래스 => 내부에 추상메서드를 가지고 있을 경우
		 * 추상 메서드가 호출되면 안되므로 인스턴스 생성을 못하게 차단함 ( => 해결방법 :  class 앞에 abstract 키워드를 붙여서 정의)
		 * 
		 * 2. 추상메서드 뿐만 아니라, 일반 메서드, 멤버변수, 생성자를 가질 수 있음. => 추상메서드가 없는 클래스도 추상클래스를 정의할 수 있음.
		 * 
		 * 3. 인스턴스는 생성할 수 없지만, 상속을 통한 슈퍼클래스로 사용하거나 다형성 활용을 위한 참조변수 타입으로 사용 가능함
		 * => 추상메서드를 포함하는 추상클래스를 상속받는 서브클래스에서는 반드시 오버라이딩을 통해 추상메서드 바디{}를 구현해야 한다.
		 * => 즉, 추상메서드 오버라이딩을 강제할 수 있다. (강제함으로써 코드의 강제성 및 통일성 향상)
		 * 
		 * 4. 추상클래스 기본 문법
		 * - [접근제한자] abstract class 클래스명 {
		 *  // 멤버변수(필드)
		 *  // 생성자
		 *  // 메서드
		 *  // 추상 메서드
		 * }
		 */
//		A a = new A();
//		AbstractClass ac  = new AbstractClass(); 
		
		Subclass sc = new Subclass();
		sc.normalMethod();
		sc.abstractMethod();
		sc.subClassMethod();
		
		AbstractClass ac = new Subclass();
		ac.normalMethod();
		ac.abstractMethod();
		
		System.out.println("---------------------");
		
		//Flyer 클래스 상속 받은 SuperMan, Bird, AirPlane 인스턴스 생성
		
		Superman s = new Superman();
		s.takeoff();
		s.fly();
		s.land();
		
		Bird b = new Bird();
		b.takeoff();
		b.fly();
		b.land();
		
		Airplane a = new Airplane();
		a.takeoff();
		a.fly();
		a.land();
		
		System.out.println("--------------------다형성 활용한 업캐스팅 결과---------------------");
		
		Flyer f = s ;
		f.takeoff();
		f.fly();
		f.land();
		
		f = b;
		f.takeoff();
		f.fly();
		f.land();
		
		f = a;
		f.takeoff();
		f.fly();
		f.land();
		
		
		
		
		
	}

}// Ex 클래스 끝

abstract class AbstractClass {
	public abstract void abstractMethod(); //추상메서드 정의 시 중괄호 사용 X
	//추상메서드를 갖는 클래스는 반드시 추상클래스로 선언되어야 한다.
	// => class 키워드 앞에 abstract 키워드 필수
	
	//추상클래스가 추가로 가질 수 있는 것
	public void normalMethod() {} // 일반 메서드
	public AbstractClass() {} // 기본 생성자
	String member; // 인스턴스 변수
}

class Subclass extends AbstractClass{

	@Override
	public void abstractMethod() {
		System.out.println("서브클래스 오버라이딩(구현)된 추상메서드!");
	}
	public void subClassMethod() {
		System.out.println("서브클래스에서 정의한 일반메서드!");
	}
}

abstract class Flyer {
	public abstract void takeoff();
	public abstract void fly();
	public abstract void land();
}

class Superman extends Flyer{

	@Override
	public void takeoff() {
		System.out.println("Superman 이륙!");
	}
	@Override
	public void fly() {
		System.out.println("Superman 비행!");
	}
	@Override
	public void land() {
		System.out.println("Superman 착륙!");
	}
	
}
class Bird extends Flyer{
	
	@Override
	public void takeoff() {
		System.out.println("Bird 이륙!");
	}
	@Override
	public void fly() {
		System.out.println("Bird 비행!");
	}
	@Override
	public void land() {
		System.out.println("Bird 착륙!");
	}
	
}
class Airplane extends Flyer{
	
	@Override
	public void takeoff() {
		System.out.println("Airplane 이륙!");
	}
	@Override
	public void fly() {
		System.out.println("Airplane 비행!");
	}
	@Override
	public void land() {
		System.out.println("Airplane 착륙!");
	}
	
}

