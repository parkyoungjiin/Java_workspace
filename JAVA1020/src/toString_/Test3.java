package toString_;

import java.util.Objects;

public class Test3 {

	public static void main(String[] args) {

		// acc, acc2 인스턴스 생성
		Account acc = new Account("111-1111-111", "홍길동", 10000);
		Account acc2 = new Account("111-1111-111", "홍길동", 10000);
		
		// if문을 통해 두 인스턴스가 같은지 비교
		if(acc.equals(acc2)) {
			System.out.println("두 계좌는 동일한 계좌입니다!");
		} else {
			System.out.println("두 계좌는 다른 계좌입니다!");
		}
		
		// 참조변수를 출력했을 때 => acc 의 계좌정보 : [계좌정보] 
		System.out.println("acc의 계좌정보 : " + acc);
		
	}

}

/*
 * Account 크래스 정의
 * - 멤버변수
 *   계좌번호(accountNo, 문자열)
 *   예금주명(ownerName, 문자열)
 *   현재잔고(balance, 정수)
 * - 생성자 - 계좌번호, 예금주명, 현재잔고를 전달받아 초기화
 * - equals() 메서드를 오버라이딩하여 계좌정보를 비교하도록 정의
 * - toString() 메서드를 오버라이딩하여 계좌정보를 문자열로 리턴하도록 정의  
 */

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountNo, other.accountNo) && balance == other.balance
				&& Objects.equals(ownerName, other.ownerName);
	}

	@Override
	public String toString() {
		return "[accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	
	
}








