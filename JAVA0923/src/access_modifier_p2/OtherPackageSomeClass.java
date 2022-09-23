package access_modifier_p2;

import access_modifier_p1.*;

public class OtherPackageSomeClass {
	//다른 패키지의 상속관계가 아닌, 다른 클래스에 접근
	// => 인스턴스 생성 후 참조변수를 통해 접근해야 함 = has-a 관계
	// => 다른 패키지이므로 import문이 필요하다
	public void useMember() {
		ParentClass p = new ParentClass();
		SamePackageSomeClass spsc = new SamePackageSomeClass();
		
		p.publicVar = 10;
//		p.protectedVar = 20;
//		p.default = 30;
//		p.privateVar = 40;
		// p와 같이 인스턴스를 생성할 경우, 
 	}
}
