package this_;

public class Test {

	public static void main(String[] args) {

		
	Account acc = new Account("111-11111-1111", "홍길동", 50000);
	
	
	}//main 메서드 끝

}//Test 클래스 끝

class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account(String accountNo, String ownerName, int balance) { //Account 생성자
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
 
	public String getAccountNo() { //getter : 내부 멤버변수 값을 외부로 리턴 하는 메서드 
		return accountNo;
	}

	public void setAccountNo(String accountNo) {// setter : 외부로부터 값을 전달받아서 내부 멤버변수에 저장하는 메서드 
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
//	public String getAccountNo() {
//		return accountNo;
//	}
//	public void setAccountNo(String accountNo) {
//		this.accountNo = accountNo;
//	}
//	
//	public String getOwnerName() { //getter 내부 값을 받아 외부로 리턴 
//		return ownerName;
//	}
//	public void setOwnerName(String ownerName) { //setter 외부로부터 값을 전달받아 내부의 멤버변수에 저장
//		this.ownerName = ownerName;
//	}
//	public int getbalance() {
//		return balance;
//	}
//	public void setbalance(int balance) {
//		this.balance = balance;
//	}
}//Account 클래스 끝
