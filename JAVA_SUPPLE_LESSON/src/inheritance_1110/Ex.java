package inheritance_1110;

import java.util.ArrayList;
import java.util.List;

public class Ex {

	public static void main(String[] args) {
		// 다운캐스팅
		// 슈퍼클래스 타입 Person 인스턴스 생성
		Person p = new Person();
		// 슈퍼클래스 Person 타입 변수로 Person 객체에 접근 가능한 메서드 : 2개
		p.jump();
		p.talk();
		
		System.out.println("------------------------");
		// 서브클래스 타입 SpiderMan 변수 선언 후 Person 인스턴스 전달
//		SpiderMan s = p; // Person -> SpiderMan 타입으로 자동 형변환 불가
		// 강제 형변환을 위해 형변환 연산자 (SpiderMan) 사용
//		SpiderMan s = (SpiderMan)p;
		// => 문법 오류는 해결됐지만 실행 시 논리적 오류(예외 발생)
		// java.lang.ClassCastException: class inheritance_1110.Person cannot be cast to class inheritance_1110.SpiderMan
//		s.fireWeb(); // 실제로는 존재하지 않으므로 호출되면 안되는 메서드!
		// => 슈퍼클래스 타입 인스턴스를 서브클래스 타입 변수로 참조할 경우
		//    참조 영역의 확대로 인해 실제 존재하지 않는 영역에 대한 참조가 발생할 우려가 있으므로
		//    자바에서는 기본적으로 다운캐스팅을 허용하지 않는다!
		
		// --------------------------------------------------------------------------
		// 자바에서 다운캐스팅이 허용되는 경우는 
		// 이전에 이미 업캐스팅 된 인스턴스를 다시 다운캐스팅 하는 경우뿐이다!
		
		// SpiderMan 인스턴스 생성 => Person 타입 변수(p2)에 업캐스팅
		Person p2 = new SpiderMan(); // 업캐스팅
		// 업캐스팅 후 Person 타입 변수로 접근 가능한 메서드 : 2개
		// (업캐스팅 후에는 참조 영역의 축소가 발생함)
		p2.jump();
		p2.talk();
//		p2.fireWeb(); // 접근 불가! Person 클래스가 알지 못하는 멤버이기 때문!
		
		System.out.println("--------");
		
		// Person 타입 변수에 저장된 인스턴스를 SpiderMan 타입 변수 s2 에 다운캐스팅
//		SpiderMan s2 = p2; // 다운캐스팅이므로 자동 형변환 불가!
		SpiderMan s2 = (SpiderMan)p2; // 강제형변환 필수!
		// 다운캐스팅 후 SpiderMan 타입 변수로 접근 가능한 메서드 : 3개
		// (다운캐스팅 후에는 참조 영역의 확대가 발생함)
		s2.jump();
		s2.talk();
		s2.fireWeb();
		// => 이전에 이미 SpiderMan -> Person 으로 업캐스팅했던 인스턴스를
		//    다시 Person -> SpiderMan 으로 다운캐스팅 하기 때문에 안전하다!
		
		System.out.println("===================================");
		// MemberDTO 객체 여러개를 하나의 묶음으로 관리하기 위한 ArrayList 객체 생성
		List memberList = new ArrayList(); // ArrayList -> List 타입으로 업캐스팅
		
		// List 객체의 add() 메서드 기본 파라미터 타입은 Object 타입이므로
		// 어떤 객체를 전달하더라도 Object 타입으로 업캐스팅이 일어남!
		memberList.add(new MemberDTO("홍길동")); // MemberDTO -> Object 업캐스팅되어 저장됨
		// 즉, Object o = new MemberDTO("홍길동"); 과 동일한 코드가 됨
		memberList.add(new MemberDTO("이순신")); // MemberDTO -> Object 업캐스팅되어 저장됨
		memberList.add(new MemberDTO("강감찬")); // MemberDTO -> Object 업캐스팅되어 저장됨
		System.out.println(memberList);
		
		// List 객체에 저장되어 있는 MemberDTO 객체를 차례대로 꺼내기
		// => 일반 for문을 사용하여 List 객체 크기만큼 반복
		for(int i = 0; i < memberList.size(); i++) {
			// List 객체의 get() 메서드를 호출하여 저장된 요소 꺼내기
			// => 파라미터로 인덱스 번호(i) 전달
			// => 리턴타입 : Object 
			Object o = memberList.get(i);
			// MemberDTO -> Object 타입으로 업캐스팅 된 상태에서는
			// 공통 메서드(상속된 메서드) 만 호출이 가능하므로 getName() 메서드 호출 불가!
//			System.out.println("이름 : " + o.getName()); // 오류 발생! 존재하지 않는 메서드!
			// 따라서, Object -> MemberDTO 타입으로 다시 다운캐스팅 후에 호출해야한다!
			MemberDTO member = (MemberDTO)o;
			// 다운캐스팅 후에는 참조 영역 확대로 인해 MemberDTO 메서드에 접근 가능하다!
			System.out.println("이름 : " + member.getName());
		}
	}

}

class MemberDTO {
	private String name;

	public MemberDTO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MemberDTO [name=" + name + "]";
	}
	
}











