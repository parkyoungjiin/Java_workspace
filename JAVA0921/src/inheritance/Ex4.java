package inheritance;

public class Ex4 {

	public static void main(String[] args) {
		/* 
		 * 상속에서의 생성자
		 * - 생성자 : 클래스명과 이름이 같고, 리턴타입이 없는 메서드의 일종이다.
		 * - 생성자는 상속되지 않는다.
		 * => 상속받을 경우, 자신의 클래스 이름과 생성자 이름이 다르기 때문에 생성자 정의 규칙을 위반한다.
		 * 
		 * - 상속관계에서 인스턴스를 생성할 때 (같을 수 없기에 따로따로 생성)
		 *   서브 클래스의 인스턴스가 생성되기 전에 슈퍼클래스의 인스턴스를 먼저 생성한 후 서브 클래스의 인스턴스를 생성함.
		 *   =>  서브클래스의 생성자가 호출되면 가장 먼저 슈퍼클래스의 생성자를 호출하여
		 *   =>  슈퍼클래스의 인스턴스를 생성하고 그 후에 서브클래스의 인스턴스가 생성되어 생성자 코드가 실행된다.
		 *   
		 * 
		 */
		
	Manager4 m = new Manager4();
	/*
	 * Manager 인스턴스를 생성하는 과정
	 * => 서브 클래스의 인스턴스를 생성하는 과정에서
	 *    서브클래스 생성자에서 인스턴스 생성 전 슈퍼클래스의 생성자 호출
	 *    즉, 슈퍼클래스의 인스턴스가 생성된 후 서브클래스의 인스턴스 생성됨.
	 *    
	 *    1)new manager4() 코드로 Manager4() 생성자로 이동
	 *    2) Manager4() 생성자에서 슈퍼클래스 Employee4()의 생성자 Employee4() 호출
	 *    = > Manager4() 생성자 내에 자동으로 만들어지는 super() 때문.
	 *    3) Employee4() 생성자에서 슈퍼클래스 Object의 생성자 Object() 호출
	 *    = > Employee4() 생성자 내에 자동으로 만들어지는 super(); 때문
	 *    4) Object 인스턴스가 생성되고, Object()생성자 내의 코드 실행됨.
	 *    5) Employee4 인스턴스가 생성되고, Employee4() 생성자 내의 코드가 실행됨.
	 *    6) Manager4 인스턴스가 생성되고 Manager4() 생성자 내의 코드 실행됨.
	 */
		
		System.out.println("--------------------------------------");
		
		//Employee4 클래스와 이름, 연봉을 전달받은 생성자는
		// Manager4 클래스에 상속되지 않으므로 호출할 수 없다.
		
// 		Manager4 m2 = new Manager4("홍길동", 400);
		
		Manager4 m2 = new Manager4("홍길동", 4000, "개발팀");
		
		
		
		
	}//main 메서드 끝

}//Ex4 클래스 끝


class Employee4{ // extends를 사용하지 않고 정의할 경우 -> class Employee4 extends Object 로 정의 (Object가 가장 상위)
	String name;
	int salary;
	
	public Employee4() { // 클래스명 동일, 리턴타입이 없기에 생성자 !
		System.out.println("Employee4() 생성자 호출됨!");
	}
	//만약, 파라미터 생성자를 정의했을 때, 기본 생성자가 없을 경우
	// 서브 클래스의 생성자에서 기본적으로 슈퍼클래스의 기본생성자를 호출하므로
	// 서브 클래스의 생성자에서 컴파일에러가 발생할 수 있다.
	// => 슈퍼클래스의 파라미터 생성자를 정의할 때 기본 생성자도 정의 필요하다

}//Employee4 클래스 끝
class Manager4 extends Employee4{

	String depart;
	
	// 서브클래스의 생성자가 호출되면
	// 내부적으로 가장 먼저 슈퍼클래스의 기본생성자를 자동으로 호출하게 된다.
	// => super();
	// => 슈퍼클래스 생성자의 작업이 종료된 후 서브 클래스 생성자의 작업 수행
	public Manager4() {
//		super(); //부모 클래스의 기본 생성자를 찾는다. 
		System.out.println("Manager4() 생성자 호출됨!");
		
	}
	public Manager4(String name, int salary, String depart) {
		System.out.println("Manager4(String name, int salary, String depart) 생성자 호출됨!"); // 이문장위에 super()가 생략되어 있음.
		
		this.name = name;
		this.salary = salary;
		this.depart = depart;
		
	}
}
	
