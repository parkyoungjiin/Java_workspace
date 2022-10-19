package object_class;

import java.util.Objects;

public class Ex {

	public static void main(String[] args) {
		Person p1 = new Person("박영진", "777777-777777");
		Person p2 = new Person("박영진", "777777-777777");
		
		System.out.println("p1의 객체 정보 : " + p1);
		System.out.println("p2의 객체 정보 : " + p2);
		
		if(p1 == p2) {
			System.out.println("두 객체의 주소값이 같다");
		}else {
			System.out.println("두 객체의 주소값이 다르다.");
		}
		
		if(p1.equals(p2)) {
			
			System.out.println("두 객체의 주소값이 같다");
		}else {
			System.out.println("두 객체의 주소값이 다르다.");
		}
		System.out.println("--------------------------");
	OverridePerson p10 = new OverridePerson("박영진", "000000-0000000");
	OverridePerson p11 = new OverridePerson("박영진", "000000-0000000");
	
	if(p10 == p11) {// == 는 주소값이 같을 때 같다고 표시
		System.out.println("두 객체의 주소값이 같다");
	}else {
		System.out.println("두 객체의 주소값이 다르다.");
	}
	
	
	System.out.println("-----------------------------");
	if(p10.equals(p11)) { // equals는 내용이 같을 때 같다고 표시
		System.out.println("두 객체의 내용(멤버변수 값)이 같다");

	}else {
		System.out.println("두 객체의 내용(멤버변수 값)이 다르다.");
	}
	
	}//main 메서드 끝

}

class Person{
	String name;
	String jumin;
	
	public Person(String name, String jumin) {
		this.name = name;
		this.jumin = jumin;
	}
}

class OverridePerson{ //오버라이딩 적용 된 person 클래스
	String name;
	String jumin;
	
	public OverridePerson(String name, String jumin) {
		this.name = name;
		this.jumin = jumin;
	}

	@Override
	public int hashCode() {
		return Objects.hash(jumin, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OverridePerson other = (OverridePerson) obj;
		return Objects.equals(jumin, other.jumin) && Objects.equals(name, other.name);
	}

//	@Override
//	public boolean equals(Object obj) { //Object 클래스의 equals() 메서드 오버라이딩
//		if(obj instanceof OverridePerson) {
//			OverridePerson p = (OverridePerson) obj; //다운캐스팅 자식 = (자식) 부모
//			
//			if(name.equals(p.name) && jumin.equals(p.jumin)) {
//				return true;
//			}
//		}
//		//false일 때 false 리턴
//		return false;
	
	
		
	}
//}
