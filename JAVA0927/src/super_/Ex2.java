package super_;

public class Ex2 {

	public static void main(String[] args) {
	
	/*
	 * < 상속에서 생성자 >
	 * 
	 *  - 생성자는 상속되지 않음
	 *     => 생성자 이름은 자신의 클래스 이름과 동일한데
	 *         만약, 상속받을 경우 생성자 이름이 부모 클래스이므로
	 *         생성자 작성 규칙에 위반된다.
	 *  - 서브클래스의 인스턴스를 생성할 때는 자동으로 슈퍼클래스 인스턴스를 생성한 후
	 *    서브클래스의 인스턴스가 생성된다.
	 *    = > 이 때, 서브클래스 생성자에서 슈퍼클래스 기본생성자를 자동 호출
	 *    = > 만약, 슈퍼크래스에 파라미터 생성자만 존재할 경우
	 *        서브클래스 생성자에서 컴파일 에러가 발생하게된다. 
	 *  
	 *  < 생성자 super() >
	 *  - 슈퍼클래스의 생성자를 명시적으로 호출할 때 사용
	 *    => 생성자 this()와 사용 방법 및 목적은 동일함
	 *  - 기본 문법 : super();
	 *  - 목적1) 슈퍼클래스 생성자 중 특정 생성자를 명시적으로 호출할 경우
	 *          ex) 슈퍼클래스에서 기본 생성자 없이 
	 *  
	 *  
	 *  
	 *  - 목적2) 슈퍼클래스의 생성자에 멤버변수 초기화 코드가 존재할 경우
	 *          ex) 서브클래스 생성자에서 슈퍼클래스의 멤버까지 초기화하면
	 *          초기화 코드의 중복이 발생하게 된다.
	 *          이 때, 슈퍼클래스의 멤버는 슈퍼클래스의 생성자에서,
	 *          서브클래스의 멤버는 서브클래스의 생성자에서 초기화하여 
	 *          코드 중복을 제거하기 위해 사용
	 *          
	 *  - 주의사항 ! 생성자 super() 는 반드시 생성자의 첫 문장에서 실행되어야 함
	 *    => 따라서, 생성자 내에서 super(), this() 동시에 불가능
	 *  
	 *  
	 */
	Student s = new Student();
	
	
		
		
	}//main 메서드 끝

}//Ex2 클래스 끝


class Person { // =class Person extends Object
	String name;
	int age;
	
	public Person() {
		System.out.println("기본 생성자 호출!");
	} //기본생성자 끝

	public Person(String name, int age) {
		super(); //Object 클래스 호출
		this.name = name;
		this.age = age;
		System.out.println("Person(String name, int age) 생성자 호출됨.");
		
	
	} //name, age 파라미터 생성자 생성
	
	
}

class Student extends Person { 
	boolean isStudyMode;
	
	public Student() { 
		//서브클래스의 기본 생성자에서 슈퍼클래스의 Person 클래스의
		//기본 생성자를 자동으로 호출하는데
		//만약, 슈퍼클래스 생성자가 파라미터 생성자만 존재할 경우 오류 발생
//		super(); // 암묵적으로 super는 생성자 내에 포함된다.
		// => 그렇기에 Person() 생성자 없이 파라미터 생성자만 있을 경우 오류가 발생.
		
		// 따라서, 기본 생성자를 별도로 정의하거나 (1번방법)
		// 서브클래스에서 슈퍼클래스의 파라미터 생성자를 명시적으로 호출(2번방법)한다.
		
//		super("홍길동", 20);
		// => 슈퍼클래스의 Person(String, int) 생성자를 호출하여 데이터를 전달함.
//		isStudyMode = true;
		
		this("홍길동", 20, true); // this를 통해 오버로딩 된 생성자를 호출하고 메서드에 생성된 super를 통해 작동.
		// 슈퍼클래스의 생성자를 호출하지 않고 자신의 다른 생성자를 호출하여
		// 해당 생성자 내에서 다시 슈퍼클래스의 생성자를 호출해도 된다.!
		
		
		System.out.println("Student() 생성자 호출됨!");
//		super("홍길동", 20); // super는 가장 첫 자리에 위치해야 한다.
	}

	public Student(String name, int age, boolean isStudyMode) {
		// Student 클래스 생성자에서 모든 멤버변수를 직접 초기화
//		this.name = name;
//		this.age = age;
//		this.isStudyMode = isStudyMode;
		
		super(name, age); // 슈퍼클래스 생성자에 name, age 전달하여 대신 초기화
		this.isStudyMode = isStudyMode; // 자신의 멤버변수만 직접 초기화 
		
		
	}
	
}// Student 클래스 끝
