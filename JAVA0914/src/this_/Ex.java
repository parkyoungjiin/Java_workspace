package this_;

public class Ex {

	public static void main(String[] args) {
	/*
	 * this 키워드
	 * - 자신의 인스턴스 주소값을 저장하는 참조변수
	 * - 자기자신의 주소값을 가지고 있음. (자바에서 자동으로 생성)
	 * - 모든 인스턴스 내에는 this가 존재하며, 자신의 인스턴스 주소가 저장
	 * 
	 * 1. 레퍼런스 this
	 *  - 자신의 인스턴스 내의 멤버에 접근 (멤버 변수 or 멤버 메서드) 
	 *  - 주로, 로컬변수, 인스턴스(멤버)변수의 이름이 같을 때 인스턴스 변수를 지정하는 용도로 사용한다.
	 *  
	 *  <레퍼런스 this 사용 기본 문법>
	 *  - this.인스턴스 변수 또는 this.메서드() 형태로 접근
	 *  
	 */
		
		
	Person p = new Person("박영진", 26); // 매개변수에 값을 넣지않으면 오류가 발생한다. (생성자 정의하였으므로, 자바가 기본 생성자를 만들지 않음)
	}//main 메서드 끝

}// Ex 클래스 끝

class Person{
	private String name; //멤버변수
	private int age;
	
	public Person(String name, int age) {//지역변수(로컬변수)
		this.name = name; //p.name
		this.age = age; //p.age
		
	}
	
	public String getName() { //파라미터가 없어서 this를 생략.
		return name;
		
	}
	public void setName(String name) {
		//메서드 내의 로컬변수와 클래스 내의 멤버변수의 이름이 동일할 경우
		//메서드 내에서 변수 지정 시 로컬변수가 지정된다.
		// 로컬변수가 우선순위 가장 높음.
		
		this.name = name; //로컬변수 name 값을 멤버변수 name에 저장하는 코드.
		// 외부에서 멤버변수 name에 접근 시 참조변수명.name 형태로 접근하듯.
		// 내부에서 멤버변수 name에 접근 시 this.name 형태로 접근
		
		
	}
	public int getage() {
		
		return age;
		
	}
	public void setage(int age) {
		
		this.age = age;
		
	}
	
	public void showPersonInfo() {
		System.out.printf("이름 : %s", name);
		System.out.printf("이름 : %d", age);
	}
	
	
	
	
	
}//Person 클래스 끝
