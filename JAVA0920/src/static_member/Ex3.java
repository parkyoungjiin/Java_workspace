package static_member;

public class Ex3 { 

	
	
	int b = check("인스턴스 변수");
	
	static int a = check("static 변수 a");
	
	
	
	
	public static int check(String str) { //static 메서드는 main메서드 안에 들어갈 수 없다.
		
		System.out.println("check() 호출 : " + str);
		return 0;
	}//check 메서드 끝
	
	public static void main(String[] args) {
/*
 * static , 인스턴스 멤버 변수 메모리의 할당 순서
 * 1. static 키워드가 선언된 모든 멤버가 메모리에 로딩
 * 2. static 멤버가 메모리에 로딩될 때
 * 	static 변수 a와 , 아래 쪽에 있는 변수 c에 check 메서드 리턴 값이 전달되어야 하므로 static메서드인 check() 메서드가 호출된다.
 * 	2-1 static 변수 a 출력( 변수 a 가 로딩됨.)
 * 	2-2 static 변수 c 출력( 변수 c 가 로딩됨.)
 * 3. main() 메서드가 자동으로 호출됨. (main() 메서드 내에서 Ex3 인스턴스가 생성됨.)
 * 5. Ex3인스턴스 생성 시 인스턴스 변수 b가 메모리에 로딩되며 
 * 인스턴스 변수 b가 로딩될 때 check() 메서드가 호출됨.
 * 
 * 
 * 
 */
		
		Ex3 ex = new Ex3(); //기본 생성자를 통해 인스턴스 생성 ,
		System.out.println("Ex3 인스턴스 생성 완료");
		
	}//main 메서드 끝
	
	
	static int c = check("static 변수 c");
	
	
	
} // Ex3 클래스 끝
