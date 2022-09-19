package static_member;

public class Ex2 {

	public static void main(String[] args) {
	/* static 메서드
	 * - 메서드 정의 시 리턴타입 앞에 static 키워드를 붙여서 정의
	 * - 클래스가 메모리에 로딩될 때 static 변수와 함께 메모리에 로딩되므로 인스턴스 생성과 무관하다.
	 * - 클래스명만으로 접근이 가능( 클래스명.메서드명() 형태로 호출 )
	 * 
	 * 
	 * <static 메서드 만들 때 주의할 점>
	 * 1. 인스턴스 변수 사용이 불가
	 *  => 원인 : static 메서드가 로딩되는 시점은 클래스 로딩 시점이며
	 * 			   인스턴스 변수는 인스턴스 생성 시점에 로딩되므로
	 * 				static 메서드가 로딩되는 시점에는 존재하지 않는다.
	 * 
	 * 2. 레퍼런스 this , super 사용 불가능
	 *  => 원인 : static 메서드가 로딩되는 시점은 클래스 로딩 시점이며
	 *  			레퍼런스 this는 인스턴스 생성 시점에서 생성되므로
	 * 				 static 메서드가 로딩되는 시점에는 존재하지 않는다.
	 *  => 해결책 : this.XXX 또는 super.XXX 대신
	 *  			클래스명.XXX 형식으로 접근
	 *  
	 * 3. 메서드 오버라이딩이 불가능
	 * 
	 * 
	 * 
	 * 
	 */	
	StaticMethod.staticMethod();
	
//	StaticMethod.setStaticVar = 99; //private 제한자로 적용 시 접근 불가
	
//	setter 호출하여 접근이 가능하다.
	StaticMethod.setStaticVar(99);
	
	StaticMethod st = new StaticMethod();
	
//	normalMethod(), staticMethod() 호출 가능
	st.normalMethod(); 
	StaticMethod.staticMethod(); // st.staticMethod()로 작성해도 되지만, 클래스명.메서드명()으로 작성하는 것이 더 좋음.
	
	
	}//main 메서드 끝

}// Ex2 클래스 끝

class StaticMethod{
	//인스턴스 멤버변수 선언 
	private int normalVar = 10;
	
	// 정적 멤버변수 선언
	private static int staticVar = 20;
	
	//일반 메서드
	//일반 메서드는 인스턴스가 생성되는 시점에 메모리에 로딩된다.
	public void normalMethod() {
		System.out.println("일반 메서드 normalMethod()");
	
		System.out.println("일반 메서드에서 인스턴스 변수 접근 : " + normalVar);
		System.out.println("일반 메서드에서 static 변수 접근 : " + staticVar);
		
		staticMethod(); // 일반 메서드에서 static 메서드 호출 가능
	}
	
	//static 메서드 정의 - 파라미터, 리턴값 없음
	public static void staticMethod() {
		System.out.println("정적메서드 staticMethod()");
		
//		System.out.println("static 메서드에서 인스턴스 변수 접근 : " + normalVar);
		//Cannot make a static reference to the non-static field normalVar (인스턴스 멤버변수는 static 메서드에서 사용이 안된다.)
		//static 메서드는 클래스가 메모리에 로딩되는 시점에 메모리에 로딩되기에 인스턴스 멤버변수는 사용할 수 없다.
		
		System.out.println("static 메서드에서 static 변수 접근 : " + staticVar);
		
//		normalMethod();
		// static 메서드에서 일반 메서드 호출 불가능
		
	}//static  메서드 

	
	// 인스턴스 변수 normalVar에 대한 Setter 정의
	
	public void setNormalVar(int normalVar) {
		this.normalVar = normalVar;
	}
	// static 변수 staticVar에 대한 Setter 정의
	
	public static void setStaticVar(int staticVar) {
		StaticMethod.staticVar = staticVar; // 클래스명.메서드명 으로 호출
		
		// this가 없음 (static 메서드는 this가 사용 불가능하기 때문)
		// 레퍼런스 this는 인스턴스 생성 시점에 생성되지만
		// static 메서드가 로딩되는 시점에는 레퍼런스 this가 존재하지 않음.
		
		// 레퍼런스 this 대신 클래스명으로 static 변수 접근 가능
	}
	
	//static 메서드도 static 멤버변수처럼 인스턴스 생성과 무관하므로 인스턴스 생성 없이도 클래스명만으로 접근이 가능하다.
	
	
}// StaticMethod
