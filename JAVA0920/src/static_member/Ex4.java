package static_member;

public class Ex4 {

	public static void main(String[] args) { 
	/*
	 * 싱글톤 디자인 패턴(Singleton Design pattern) 193P
	 * - 단, 하나의 유일한 인스턴스만을 생성하여 공유하도록 하는 기법 (ex, 회사라는 인스턴스는 유지하되, 직원이라는 인스턴스는 여러 개 필요한 경우)
	 * - 외부에서 인스턴스를 생성하지 못하도록 차단하고
	 *   클래스 내에서 직접 인스턴스를 생성 후, 외부로 리턴하는 기법
	 *   누구나 단 하나의 인스턴스만을 공유하여 사용해야 함.
	 *   => 즉, 외부에서 new 키워드를 통한 새 인스턴스 생성 불가능
	 *   
	 *   
	 *   <패턴 규칙>
	 *   1. 외부에서 인스턴스 생성이 불가능하도록 
	 *      생성자에 private 접근제한자를 선언하여 정의
	 *      
	 *   2. 자신의 클래스에서 직접 인스턴스를 생성하여 참조변수에 저장
	 *      => 외부에서 인스턴스 생성 없이도 접근 가능하도록 static 키워드 사용
	 *      => 외부에서 함부로 접근하지 못하도록 private 접근제한자 선언
	 *      
	 *   3. 생성된 인스턴스를 외부로 리턴하는 Getter 메서드 정의
	 *      => private 접근제한자로 선언된 멤버변수 instance에 접근하여
	 *      생성된 인스턴스를 리턴하는 용도로 정의
	 *      => 인스턴스 생성없이 호출해야하므로 static 키워드 사용
	 * 	
	 */
	
		
		
//	SingletonClass sc = new SingletonClass(); // 외부 메인 메서드에서 생성이 불가능
//	SingletonClass sc2 = new SingletonClass();// 싱글톤 패턴의 경우는 sc2가 만들어지면 안된다. => 해결 방안: 밑 1번부터 보면 된다.
		// => 생성자가 private 접근제한자이므로 외부에서 호출 불가능!
		// 즉, 외부에서 인스턴스 생성이 차단됨.
		
		//		 클래스 내에 있는 참조변수 주소값을 sc에 넣는 과정
		SingletonClass sc = SingletonClass.getInstance(); //클래스명.변수명 으로 사용
		
		// 클래스 내에서 인스턴스를 생성하여 멤버변수 instance에 저장했기에
		// 해당 변수를 통해 인스턴스를 가져올 수 있다.
		// => 이 때, 해당 변수는 static 변수이므로 클래스명만으로 접근 가능하다.
		
	
		
		// 주의 ! 
		// SingletonClass로부터 리턴받은 인스턴스를 통해 클래스 내의 singleton타입 변수 instance에 접근이 가능해지므로 
		// 클래스명.변수명으로 접근이 가능해짐.
		// 이에 따라, 해당 변수 값을 변경할 우려가 있다.
		// 해결방법 -> 생성자에 private를 붙여주면 된다. 변수 앞에
		
		// Ex) 2 번째 단계에서 외부에서 접근한 예시 
		
//		SingletonClass.instance = null;
//		sc.instance = null;
		
		// 외부에서 멤버변수에 함부로 접근하지 못하도록,
		// private 접근 제한자를 붙여서 외부 접근을 차단해야 한다.
		
		
		
		// SingletonClass 내에서 싱글톤 디자인 패턴으로 생성된 인스턴스를 
		// 변수 instance에 저장했으니, private 접근제한자로 인해 접근 불가하므로
		//getInstance() 메서드 호출을 통해 가져오기
		// => 이 때, getInstance() 메서드는 static 메서드이므로
			// 클래스명.메서드명() 형태로 호출 가능
		// => 즉, 인스턴스 생성 없이도 클래스 내의 메서드 호출이 가능하다.
		
		//리턴받은 인스턴스는 참조변수(sc)를 통해 접근이 가능하다.
		
		sc.str = "싱글톤 패턴으로 생성한 인스턴스의 str";
		
		System.out.println("sc.str : " + sc.str);
		
		// SingletonClass 타입 변수 sc2에 인스턴스를 리턴받아 저장
		
		SingletonClass sc2 = SingletonClass.getInstance();
		
		System.out.println("sc2.str : " + sc2.str);
		
		
		// sc2와 sc은 같은 주소를 참조하고 있기에, 같은 값이 출력된다.
		// 리턴받은 인스턴스는 참조변수(sc2)를 통해 접근 가능하다.
		
		
		if(sc==sc2) {
			System.out.println("sc,sc2는 같은 값을 참조하고 있습니다."); // 
		}else {
			System.out.println("sc,sc2는 다른 값을 참조하고 있습니다.");
		}
	
	}//main끝

}//Ex4 클래스 끝

class SingletonClass{
	
	String str; // 임시 확인용 변수


	//기본 생성자
//	public SingletonClass() {}; //기본 생성자는 기본적으로 public 접근 제한자로 설정 (1번)
	
	//1. 외부에서 생성자 호출이 불가능하도록 생성자에 private 접근제한자 선언
	
	private SingletonClass() {};
	
	
	//2. 자신의 클래스 내에서 인스턴스를 직접 생성 후에 참조변수에 저장.
	//     => 인스턴스 생성 없이 접근해야 하므로 static 키워드를 사용
	//     => 외부에서 함부로 접근하지 못하도록 private 접근제한자를 선언해야 한다.

	// Ex) 회사 = instance (유일한 하나의 인스턴스)
	
	private static SingletonClass instance = new SingletonClass(); // SingletonClass클래스 내에서 instance를 생성 (자기 자신 내 클래스에서 인스턴스 하나 생성)

//	SingletonClass instance = new SingletonClass(); 인스턴스 생성(내부에서 ) 
	

	
	//힙에 싱글톤 클래스로부터 인스턴스를 만들고
	// 인스턴스에 주소값을 지정
	// new 키워드로부터 만들어진 인스턴스에 접근할 수 있는 참조주소값이 들어있는데 그 주소값을 sc라고 하는 참조변수에 넣는 과정
	// instance 변수는 Static이 붙어있지 않으면 인스턴스가 만들어질 때만 생성되고 활용된다.
	// 클래스명.변수명으로 사용할 수 없는 변수가 된다.
	// static 이 없으면 Singleton 클래스 내에서만 사용 가능하고 다른 곳에서 사용이 불가능하다.
	// 그렇기에 외부에서 사용가능하도록 하기 위해서는 static을 통해 instance를 
	
	
	// 3. 생성된 인스턴스를 외부로 리턴하는 Getter 메서드 정의
	// => 인스턴스를 저장하는 변수 instance가 private 접근제한자 이므로
	// 	  접근이 불가능한 대신, 인스턴스를 리턴하는 목적으로 정의
	// => 인스턴스 생성없이 접근해야하므로 static 키워드 사용
	
	
	public static SingletonClass getInstance() {
		return instance;
	}// getInstance() 메서드 끝
	
	
	
	
}// SingletonClass 클래스 끝
//코드 작성 순서에 따른 싱글톤 패턴 구현 순서
class SingletonClass2 {
//	1. 자신의 인스턴스를 생성하여 자신의 클래스 타입 변수 instance에 저장
	
	private static SingletonClass2 instance = new SingletonClass2();
	
	private SingletonClass2() {}

	public static SingletonClass2 getInstance() {
		return instance;
	}
	
	
}//SingletonClass2 클래스 끝