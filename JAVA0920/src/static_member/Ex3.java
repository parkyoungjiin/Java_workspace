package static_member;

public class Ex3 { 

	
	
	static int a = check("static 변수 a");

	int b = check("인스턴스 변수");
	
	
	
	
	public static int check(String str) { //static 메서드는 main메서드 안에 들어갈 수 없다.
		
		System.out.println("check() 호출 : " + str);
		return 0;
	}//check 메서드 끝
	
	public static void main(String[] args) {

		
		Ex3 ex = new Ex3(); //기본 생성자를 통해 인스턴스 생성 ,
		System.out.println("Ex3 인스턴스 생성 완료");
		
	}//main 메서드 끝
	
	
	static int c = check("static 변수 c");
	
	
	
} // Ex3 클래스 끝
