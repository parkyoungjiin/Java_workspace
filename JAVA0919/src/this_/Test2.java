package this_;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Account acc = new Account();
		
		Account acc2 = new Account("222-2222-222");
		
		acc.showAccountInfo();
		
		System.out.println("-------------");
		
		acc2.showAccountInfo();
	}// main 클래스 끝

}// Test2 클래스 끝

class Account{//인스턴스 변수
	String accountNo;
	String name;
	int balance;

	public Account() {
		this("111-1111-111","홍길동",0);
		System.out.println("기본 생성자 호출!");
		

		
//		this.accountNo = "111-1111-111";
//		this.name = "홍길동";
//		this.balance = 0;
		
		
	}//기본 생성자

	public Account(String accountNo) {
		this(accountNo, "홍길동", 0); // 이 this는 생성자 this , 생성자 this는 중복을 제거
		
		
//		 this.accountNo = accountNo; 이 this는 레퍼런스 this
//		 name = "홍길동";
//		 balance = 0;
		 
	
	}
	
	public Account(String accountNo, String name) {
		this(accountNo, name, 0);
		
//		this.accountNo = accountNo;
//		 this.name = name;
//		 balance = 0;
	}
	
	public Account(String accountNo, String name, int balance ) {
		this.accountNo = accountNo;
		 this.name = name;
		 this.balance = balance;
	}
	
	public void showAccountInfo() { //static을 붙이면 에러발생, method area에 등록 되기 때문이다.)
		//static 키워드가 붙으면 static 변수만 사용이 가능하다. 즉, 인스턴스 변수 사용이 불가능하다.
		//static 변수가 더 빨리 사용되기에 static이붙으면 인스턴스 변수 사용이 불가능하다.
		
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + name);
		System.out.println("현재잔고 : " + balance);
	}
	
	
	
	
	
	
}//Account 클래스 끝
 
