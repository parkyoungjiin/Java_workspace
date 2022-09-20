package static_member;

public class Test4 {

	public static void main(String[] args) {
		
	Account acc = Account.getAccInstance(); // 리턴을 받는다.
	
	
	acc.setAccountNo("111-1111-111");
	acc.showAccountInfo();
	
	
		
		
		
	}//main 메서드 끝

}// Test4 클래스 끝


//문제  : 유일한 하나의 계좌를 생성하라.

class Account { 
	
	
	// 1. 기본 생성자 
	private Account() {}
	
	// 2. 주소를 담을 인스턴스를 직접 클래스 내에서 생성
	private static Account accInstance = new Account();

	private String accountNo;
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	// 3. getter 메서드를 통해 리턴
	public static Account getAccInstance() {
		return accInstance;
	}
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
	}
	
	
	
	
	
	
}// Account 클래스 끝
