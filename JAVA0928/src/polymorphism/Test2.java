package polymorphism;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * instanceof 연산자
		 * - 좌변의 객체(참조변수)가 우변 클래스의 타입인지 판별하는 연산자
		 * - 참조변수가 부모 객체를 참조하는 지 자식 객체를 참조하는 지 판별할 수 있음.
		 * - 판별결과가 true이면 형변환이 가능한 관계
		 * - 판별결과가 false이면 절대로 형변환 불가
		 * - 우변의 클래스타입과 같거나 우변 클래스타입 자식 타입 모두 가능
		 * - A is a B = A instanceof B
		 * - 판별결과를 boolean 타입 변수에 저장하거나
		 *   if문에 판별하는 문장을 직접 사용 가능
		 *   
		 *   
		 *   < 기본 문법 >
		 *   if(A instanceof B){ // A는 참조변수, B는 클래스명(타입)
		 *   	//형변환이 가능한 관계이므로 변환 수행
		 *   }else {
		 *   	// 형변환이 불가능한 관계이므로 변환 수행 X
		 *   } 
		 */
		
		SmartPhone sp = new SmartPhone("갤럭시 z플립4","010-1234-5678", "안드로이드");
		sp.call();
		sp.sms();
		sp.kakaoTalk();
		
		
		if(sp instanceof SmartPhone) { 
			System.out.println("sp는 SmartPhone 이다!");
			SmartPhone phone = sp;
			
		}
	
		System.out.println("--------------------------");
		
		//업캐스팅 대상 확인
		
		//sp는 HandPhone입니까?
		
		if(sp instanceof HandPhone) {
			System.out.println("sp는 HandPhone이다.");
			System.out.println("그러므로 sp 를 HandPhone으로 형변환 가능하다!");
		
			HandPhone hp = sp;
			System.out.println("sp는 HandPhone이 가진 모든 기능을 포함한다!");
			System.out.println("따라서, 업캐스팅 이후에도 HandPhone의 기능 사용 가능!");
			
			hp.call();
			hp.sms();
//			hp.kakaoTalk();
		}else {
			System.out.println("sp 는 HandPhone이 아니다.");
		}
		
		
		HandPhone hp = new HandPhone("애니콜", "011-222-2222");
		
		System.out.println("--------------------------");
		
		//다운캐스팅 가능 대상 확인(가능한 경우)
		// SmartPhone -> HandPhone 타입(hp2)로 업캐스팅
		
		HandPhone hp2 = new SmartPhone("갤럭시", "010-2222-2222", "안드로이드");
		
		//업캐스팅 후에는 참조영역 축소로 접근 범위가 줄어들게 된다.
		
		hp2.call();
		hp2.sms();
//		hp2.kakaoTalk();
		
		//hp2는 SmartPhone 입니까?
		
		if(hp2 instanceof SmartPhone) {
			
		}
	}//main 메서드 끝

}
class HandPhone {
	String modelName;
	String phoneNumber;
	
	public HandPhone(String modelName, String phoneNumber) {
		super();
		this.modelName = modelName;
		this.phoneNumber = phoneNumber;
	}
	public void call() {
		System.out.println("전화 가능");
	}
	public void sms() {
		System.out.println("문자 가능");
	}
}
	
class SmartPhone extends HandPhone{
	String osName;

//				모델명 ,전화번호, 운영체제명을 전달받아 초기화를 하는 생성자 정의
	// => 모델명과 전화번호는 슈퍼클래스의 생성자를 통해 대신 초기화 수행
	public SmartPhone(String modelName, String phoneNumber, String osName) {
		super(modelName, phoneNumber);
		this.osName = osName;
	}
	
	public void kakaoTalk() {
		System.out.println("카톡 가능!");
	}
}
