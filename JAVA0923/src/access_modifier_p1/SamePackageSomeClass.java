package access_modifier_p1;

public class SamePackageSomeClass {

	public void useMember() {
		//같은 패키지 내의 다른 클래스의 멤버에 접근 => 인스턴스 생성 후 참조변수를 통해 접근해야 함.
		// => 인스턴스 생성 후 참조변수를 통해 접근해야 함. = has-a 관계
		// static을 붙이면 인스턴스 생성 없이도 사용 가능.
		
		ParentClass p = new ParentClass();
		p.publicVar = 10;
		p.protectedVar = 10;
		p.defaultVar = 30;
		// privateVar는 불가능한데, 같은 패키지라도 다른 클래스인 경우이기에 접근이 불가능하다.
		
		
	}
	
	

}
