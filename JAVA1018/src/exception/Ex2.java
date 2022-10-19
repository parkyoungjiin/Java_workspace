package exception;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		try{
			String str = null;
			System.out.println(str.length());
			System.out.println("try 블록 끝");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("NullPointerException 블록 처리");
		}finally {
			System.out.println("finally - 예외 발생 여부와 관계 없이 실행됨.");
		}
		
		System.out.println("_-------------------------------");
		
		method1();
		
	}
	public static void method1() {
		System.out.println("메서드 시작!");
		
		try {
			String str = "";
			System.out.println(str.length());
			System.out.println("try블록 끝!");
			
			return; //메서드 종료 후 호출한 곳으로 돌아감
			// finally 블록 존재할 경우 호출한 곳으로 돌아가기 전에 finally블록을 실행한 후 돌아감
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("NullPointerException 예외 처리");
			
		}finally {
			System.out.println("finally -return 후에도 실행된다.");
		}
		System.out.println("메서드 종료");
	}
}
