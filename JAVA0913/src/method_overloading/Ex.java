package method_overloading;

public class Ex {

	public static void main(String[] args) {
/*
 * 메서드 오버로딩 문제점
 * - 동일한 작업을 수행하는 코드들의 중복이 발생 
 * = > 만약 특정 메서드의 코드를 수정해야 하는 경우 동일한 코드를 여러번 수정해야 하는 번거러움 있음. (유지보수성이 나쁘다.)
 * 
 * [해결책]
 * 오버로딩 된 메서드에서 또 다른 오버로딩 된 메서드를 호출하여 중복되는 작업을 대신 처리 하도록 해결 가능
 * => 메서드 호출 시 자신의 전달받은 파라미터를 다시 전달
 * => 클래스 내의 다른 메서드르 호출하여 사용하여 코드를 재사용한다.
 * 
 */
		
		
		
		
	PrintClass pr = new PrintClass();
	
	pr.print("박영진");
	
	System.out.println("=======================");
	
	pr.print("홍길동");
	System.out.println("=======================");
	
	pr.print("홍길동", "박영진");
	System.out.println("=======================");
	
	pr.print("홍길동", "박영진", "배하영");
	
	}//main 메서드 끝

}//Ex 메서드 끝

class PrintClass{
	/*
	 * 최대 3명까지 초대 인원에 대한 이름을 입력받아 출력하는 print() 메서드 정의
	 * 입력되지 않은 이름은 "없음"으로 처리
	 */
	
	public void print() {
		System.out.println("print()메서드 호출");
//		System.out.println("초대 멤버 : 없음 없음 없음");
		
		print("없음","없음","없음"); // main에서 호출 후 3개를 파라미터로 받는 메서드를 호출 => 즉, 메서드 안의 메서드를 호출할 수 있음을 알 수 있다.
	
	}//print 메서드 끝, 기본 생성자 메서드
	
	public void print(String name1) {
		System.out.println("print(Stirng name1)메서드 호출");
//		System.out.println("초대 멤버 : name1 없음 없음");이러한 출력문을 계속 사용하면 유지보수가 어렵다는 점이 있어, 메서드를 호출하여 유지보수성을 높인 케이스다.
		print(name1, "없음", "없음");
	}//print 메서드 끝, 메서드 오버로딩
	
	public void print(String name1, String name2) {
		System.out.println("print(Stirng name1,String name2)메서드 호출");
		print(name1, name2, "없음");
	}//print 메서드 끝, 메서드 오버로딩
	
	public void print(String name1,String name2, String name3) {
		System.out.println("print(Stirng name1)메서드 호출");
		System.out.printf("초대 멤버 : %s %s %s\n",name1,name2,name3);
		
//		print(name1, name2, name3); => 호출 하면 에러가 발생한다.
		// [주의사항]
		// 모든 파라미터를 전달 받는 마지막 메서드는 
		// 자기 자신을 호출하지 않고, 반드시 직접 작업을 수행해야 한다. (마지막 메서드는 재귀호출 시 오류 발생)
		
	}//print 메서드 끝, 메서드 오버로딩
	
	
	
}//PrintClass 클래스 끝
