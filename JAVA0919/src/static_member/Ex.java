package static_member;

public class Ex {

	public static void main(String[] args) {
	
		NormalMember n1 = new NormalMember(); // n1 이라는 인스턴스 생성
		NormalMember n2 = new NormalMember(); // n2 이라는 인스턴스 생성
		
		System.out.printf("n1.a : %d, n2.a : %d \n", n1.a, n2.a);
		System.out.printf("n1.b : %d, n2.b : %d \n", n1.b, n2.b);
		
		System.out.println("=================================");
		//
		n1.a = 99;
		n2.b = 999;
		
		System.out.printf("n1.a : %d, n2.a : %d \n", n1.a, n2.a);
		System.out.printf("n1.b : %d, n2.b : %d \n", n1.b, n2.b);
		
		//즉, 인스턴스 멤버변수인 a,b는 인스턴스마다 생성되므로
		//하나의 인스턴스에서 인스턴스 멤버변수 값을 바꾸더라도
		// 다른 인스턴스 멤버변수에는 아무런 영향이 없다.
		// => 생성된 메모리 공간이 다르기 때문이다.
		System.out.println("=================================");
		
		// staticMember 클래스 인스턴스 생성 전에 static 멤버 접근
		System.out.println("StaticMember.a : " + StaticMember.a); // a 는 static 이 있기에 인스턴스를 만들지 않아도 사용이 가능하다.
		// => 인스턴스 생성되기 전이지만 이미 메모리에 로딩되어 있으므로
		// 클래스 명 만으로 static 변수에 접근할 수 있다.
		System.out.println("=================================");

		StaticMember s1 = new StaticMember();//인스턴스 생성
		StaticMember s2 = new StaticMember();//인스턴스 생성
		// 2개의 인스턴스가 생성되며 인스턴스 멤버변수도 두 개씩 생성된다.
		
		
		System.out.printf("s1.a : %d, s2.a : %d \n", s1.a, s2.a);
		System.out.printf("s1.b : %d, s2.b : %d \n", s1.b, s2.b);
		
		System.out.println("=================================");
		s1.a = 99; //static(클래스 = 정적)멤버변수 값을 변경
		// => static 변수, method area int a = 99로 저장되기에 a는 모두 99로 변경된다.
		
		
		s1.b = 999; // 인스턴스 멤버변수 값을 변경
		
		System.out.printf("s1.a : %d, s2.a : %d \n", s1.a, s2.a);
		System.out.printf("s1.b : %d, s2.b : %d \n", s1.b, s2.b);
		//s1의 b는 변경되지만 s2의 b는 변경되지 않음.
//		s1, s2 각각 힙영역 그려보면서 이해하기 method area int a = 99
		
		
		
		// 즉, static 멤버변수 값(a)를 s1 인스턴스에서 변경하게 되면, s2 인스턴스도 동일한 변수값을 공유하고 있으므로
		// 변경된 값이 두 인스턴스 모두 적용(공유)된다.
		
		// 즉, 하나의 인스턴스에서 값을 변경하면 모든 인스턴스가 영향을 받는다.
		
		
		System.out.println("=================================");
//		s2.a = 1000;
		StaticMember.a = 1000;
		//클래스명.변수명 으로 작성해야 좋다. (인스턴스.변수명 으로 작성하는 것보다)
		//static 멤버는 참조변수명 대신 클래스명만으로도 접근 가능
		
		
		
		System.out.printf("s1.a : %d, s2.a : %d \n", s1.a, s2.a);
		System.out.printf("s1.b : %d, s2.b : %d \n", s1.b, s2.b);
		
		System.out.println("=================================");

		//static 멤버변수의 대표적인 예 (인스턴스 생성 없이 사용이 가능하다.)
		// => java.lang.Math 클래스의 PI 변수
		
		System.out.println("PI 값 : " + Math.PI); // 파이값 출력
		
		
		
		
		
		
	}//main 메서드 끝

	
}//Ex 클래스 끝
class NormalMember{
	//인스턴스 멤버변수
//	new를 사용해야 만들 수 있는 변수
	int a = 10;
	int b = 20;
	
	// => 2개의 인스턴스가 생성되며 인스턴스 멤버변수도 2개씩 생성된다.
	
//	n1 -> 힙영역에 있는 int a, int b를 참조
//	n2 -> 힙영역에 있는 int a, int b를 참조
	
	
}// NormalMember 클래스 끝

class StaticMember {
	// static 존재하면 변수명은 기울어짐.
	static int a = 10; 	//static 멤버변수(클래스 멤버변수 = 정적 멤버변수) 
	int b =20; // 인스턴스 멤버변수
	
}