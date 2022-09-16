package variable_arguments;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 가변형 인자 = 비정형 인자(Variable Arguments, VARARGS)
		 *  메서드 파라미터를 하나의 인자만 사용하여 다양하게 전달받는 기능
		 *  동일한 타입의 파라미터를 0개 ~무한대로 전달받아 배열로 관리
		 *  = > 전달받는 인자(데이터)의 개수에 따라 자동으로 배열이 생성된다.
		 * - 메서드 파라미터(매개변수)선언 시 데이터타입 뒤에 ... 기호를 표기
		 * ex) public void add(...nums){}
		 * - 가변 인자를 사용한 대표적인 메서드 : printf()  메서드
		 *  => System.out.printf(String str, Object...objs) { }
		 *  - 다른 파라미터와 가변 인자를 조합 가능
		 *  - 주의 ! 가변 인자는 마지막 파라미터로 단 한 번만 지정 가능하다. 
		 *  
		 */
		
		NormalArguments na = new NormalArguments();
		na.print("홍길동");
		na.print("홍길동","이순신");
		na.print("홍길동","이순신","강감찬");
		String [] strArr = {"홍길동","이순신","강감찬","강진석"}; //1차원 배열
		na.print(strArr);
		
		
		
		VariableArguments va= new VariableArguments();

		va.print("홍길동");
		va.print("홍길동", "이순신");
		va.print("홍길동", "이순신","강감찬");
		va.print("홍길동", "이순신","강감찬", "강진석");
		
		va.print2(2, "박영진", "이순신");
		
		
	}//main 메서드 끝

}//Ex 클래스 끝

class VariableArguments {
	//가변 인자를 사용한 메서드 오버로딩
	// => 메서드 정의 시 파라미터로 정의 시 파라미터로 사용할 변수 데이터타입 뒤에 ...기호를 붙인다.
public void print(String...names) {

	for(int i = 0 ; i < names.length ;i++) {
		System.out.println(names[i] );
	}

}

	public void print2(int num, String... names) {}
	// int 형 데이터 1개, 문자열 데이터 여러 개 전달이 가능. (조합해서 전달이 가능하다.)
	// 가변 인자는 2개 이상 쓸 수 없다. (위 문장에서 int...가 불가능)
	// 가변 인자는 0개도 전달된다.
	// 
	




}//VariableArguments 클래스 끝


class NormalArguments {
	// 가변 인자를 사용하지 않은 메서드 오버로딩
	
	public void print(String name1) {
		System.out.printf("%s", name1);
	}
	public void print(String name1, String name2) {
		System.out.printf("%s, %s", name1, name2);
	}
	public void print(String name1, String name2, String name3) {
		System.out.println(name1 + ',' + name2 + ',' + name3);
	}
	public void print(String [] names) {
		for(int i =0 ; i < names.length ; i++) {
			System.out.println(names[i] + " ");
		}
	System.out.println();
	}
	
	
	
	
	
	
}
