package inheritance; // 상속

public class Ex {

	public static void main(String[] args) {

	/*
	 * 상속(inheritnace)
	 * is-a 관계가 성립하는 객체간의 관계를 의미
	 * => a와 b는 같다
	 * 
	 * - 슈퍼 클래스 (부모)의 모든 멤버를 서브클래스(자식)에서 물려받아
	 *   선언 없이 사용하는 것
	 * - 슈퍼 클래스(Super Class) = 부모 클래스 = 상위, 조상 클래스
	 * - 서브 클래스(Sub Class) = 자식 클래스 = 하위, 자손 클래스
	 * 
	 * - private 접근제한자가 지정된 멤버는 상속 대상에서 제외됨.
	 * - 생성자는 상속 대상에서 제외된다.
	 *   => 생성자는 public, 이름이 같아야 하는데 상속받은 생성자는 부모의 클래스 이름이므로 규칙에 위반되기 때문이다.
	 * - 자바는 단일 상속만 지원
	 *   => 두 개 이상의 슈퍼클래스(부모)를 지정할 수 없음.
	 * 
	 * - 별도로 상속 대상을 지정하지 않을 경우(extends 생략 시 )
	 *  => java.lang.Object 클래스를 자동으로 상속받도록 함.
	 *  => java.lang.Object 클래스를 자바의 최상위 클래스라고 함.
	 * 
	 *  <상속 기본 문법>
	 *  class 서브 extends 부모 {}
	 */
		
	Child ch = new Child();
	ch.childPrn(); //서브 클래스에서 직접 정의한 메서드
	//Child 클래스는 자신의 클래스 내의 멤버뿐만 아니라
	// 슈퍼 클래스인 Parent 클래스의 멤버도 아무런 선언없이 사용 가능
	ch.num = 10; // 슈퍼클래스로부터 상속받은 멤버변수
	
	ch.parentPrn(); // 슈퍼클래스로부터 상속받은 메서드
	
	ch.showNum(); // 서브에서 직접 선언
	System.out.println("====================================");
	아버지 아버지 =new 아버지();
	
	System.out.println("아버지의 자동차는 : " + 아버지.자동차);
	
	아버지.노래하기();
	
	System.out.println("아버지의 집 : " + 아버지.집);
	
	아버지.그림그리기();
	
	나 나 = new 나();
	
	System.out.println("내폰  :" + 나.폰);

	나.프로그래밍();
	
	System.out.println("내 자동차 : " + 나.자동차);
	나.노래하기();
	
	System.out.println("내 집 : " + 나.집);
	
	}//main 메서드 끝

}// Ex 클래스 끝
class Parent { // class Parent extends Object와 동일함. (child는 object가 조상 클래스)
	int num; // 슈퍼클래스의 멤버변수
	
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn():");
	}
	
	
}

//슈퍼클래스인 Parent 클래스를 상속받는 서브클래스 child 정의

class Child extends Parent{
	public void childPrn() {
		System.out.println("서브클래스의 childPrn()");
	}
	
	
	public void showNum() {
		System.out.println("부모로부터 상속받은 멤버변수 num = " + num); //num은 상속받은 num이다.
	}
}//CHild 클래스 끝

class 할아버지 {
	String 집 = "초고층 아파트";
	String 티비 = "최신형 티비";
	
	public void 그림그리기() {
		System.out.println("그림을 잘 그린다!");
	}
	
}


class 아버지 extends 할아버지{
	String 자동차 = "스포츠카";
	public void 노래하기() {
		System.out.println("노래를 잘 한다!");
		
	}

 
}

class 나 extends 아버지{
	String 폰 = "스마트폰";
	
	public void 프로그래밍() {
		System.out.println("프로그래밍을 잘한다!");
	}
}

