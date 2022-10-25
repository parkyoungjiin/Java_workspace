package enum_type;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 상수를 사용하여 한정된 데이터를 관리하는 경우
		 * 간편한 선언을 통해 관리할 수 있다는 장점이 있으나
		 * 해당 값의 범위를 벗어나느 값을 사용할 경우 컴파일 시점에서
		 * 오류 발견이 불가능!
		 * 추가적인 작업을 통해 범위 내의 값인지 판별하는 작업이 별도로 필요함!
		 * => 이를 해결하기 위해 열거형(enum type) 필요
		 * 
		 * 열거형(Enumeration Type = Enum 타입)
		 * - 상수를 좀 더 확실한 형태로 다루기 위한 객체의 일종
		 * - 데이터타입이 일치하면 다른 데이터라도 사용 가능한 상수의 단점을 해결
		 * - enum 타입은 내부적으로 java.lang.Enum 클래스를 상속받음
		 * 
		 * < 열거타입 정의 방법 >
		 * [접근제한자] enum 열거타입명 {
		 * 		// 열거타입에서 사용할 값(상수)을 차례대로 나열
		 * 		상수1, 상수2, ... 상수 n
		 * }
		 * 
		 * - 기본적으로 클래스, 인터페이스 정의 문법과 유사함
		 *   단, 열거타입 중괄호 내에는 상수로 사용될 이름만 지정
		 * 
		 * 
		 */
		
		BadWeek badWeek = new BadWeek();
		
		// Setter를 호출하여 파라미터로 요일 전달 시 정확한 정수값을 몰라도
		// 상수 호출만으로 해당 정수 사용 및 전달이 가능
		badWeek.setMyWeek(BadWeek.WEEK_TUESDAY); // 화요일(1) 설정
		
		if(badWeek.getMyWeek() == BadWeek.WEEK_TUESDAY) {
			System.out.println("오늘은 화요일 입니다!");
		}
		
		// 요일 정보를 상수로 관리하는 경우의 문제점
		// => 상수 데이터들이 정수일 경우 해당 정수를 전달받는 메서드(Setter) 호출 시
		//    상수 범위 값이 아닌 다른 값을 전달해도 컴파일에러(문법적 오류)가 
		//    발생하지 않음
		badWeek.setMyWeek(10); // 10이라는 정수값을 갖는 요일이 없으나
		// int 타입 파라미터 이므로 컴파일 시점에서는 아무런 문제가 발생하지 않음
		// 그러나, 해당 데이터를 사용하기 위한 시점에서는 문제가 발생할 수 있다.
		// => 따라서, 별도로 해당 범위 내의 데이터인지 판별하는 추가적인 작업이 필요!
		
		System.out.println("=================================");
		
		// 열거타입 변수 today 선언 및 초기화 후 호출
		EnumWeek today = EnumWeek.FRIDAY;
		System.out.println(today);
		
		// 열거 타입을 활용하는 클래스 사용
		GoodWeek gw = new GoodWeek();
		gw.setMyWeek(today);
		System.out.println("오늘의 요일 : " + gw.getMyWeek());
		
		gw.setMyWeek(EnumWeek.FRIDAY);
		System.out.println("오늘의 요일 : " + gw.getMyWeek());
		
		// EnumWeek 타입 객체는 Enum 클래스의 서브 클래스 타입 객체인지 판별
		if(today instanceof Enum) {
			System.out.println("Enum 클래스의 서브클래스이다!");
		} else {
			System.out.println("Enum 클래스의 서브클래스가 아니다!");
		}
		

		
	}

}

// 열거타입 정의
enum EnumWeek {
	// 열거형 정의 시 중괄호 내에는 값을 갖는 상수 이름만 나열함
	// (별도의 값을 지정하지 않는다!)
	MONDAY, TUSEDAY, WEDNESDAY, THUHRSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum EnumMonth {
	JANUARY, FEBRUARY
}

// 열거타입을 사용하는 클래스 정의
class GoodWeek {
	EnumWeek myWeek;
	// => 클래스 내에서 열거타입 변수 선언 가능(로컬변수로도 가능)

	public EnumWeek getMyWeek() {
		return myWeek;
	}

	public void setMyWeek(EnumWeek myWeek) {
		this.myWeek = myWeek;
	}
	
}


// 요일 정보를 관리하는 BadClass 클래스 정의
// 열거 타입을 사용하지 않고, 상수만 사용하는 경우
// => 요일은 7가지로 정해져 있으므로 상수로 처리 가능
class BadWeek {
	// 요일 정보를 상수로 관리
	// => 외부에서 실제 데이터를 정확하게 알지 못해도 상수명(변수명) 만으로
	//    값을 사용 가능
	// => 클래스명만으로 접근이 가능하여 접근이 쉬움
	// => 또한, 값 변경이 불가능하여 안전함.
	public static final int WEEK_MONDAY = 0;
	public static final int WEEK_TUESDAY = 1;
	public static final int WEEK_WEDNESDAY = 2;
	public static final int WEEK_TUHRSDAY = 3;
	public static final int WEEK_FRIDAY = 4;
	public static final int WEEK_SATURDAY = 5;
	public static final int WEEK_SUNDAY = 6;
	
	private int myWeek;

	public int getMyWeek() {
		return myWeek;
	}

	public void setMyWeek(int myWeek) {
//		this.myWeek = myWeek;
		
		// 요일에 대한 정상 범위 판별 없이 저장작업을 수행할 경우
		// 실제 저장된 요일을 꺼내서 사용하는 시점에서는 문제가 발생할 수 있다!
		// 따라서, 조건문 등을 사용하여 전달받은 파라미터에 대한 검증이 추가적으로 필요함
		if(myWeek >= WEEK_MONDAY && myWeek <= WEEK_SUNDAY) {
			this.myWeek = myWeek;
		} else {
			System.out.println("요일 입력 에러!");
		}
	}
	
	
	
}







