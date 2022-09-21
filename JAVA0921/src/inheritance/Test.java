package inheritance;

public class Test {

	public static void main(String[] args) {

		
		Account ac = new Account();
		ac.deposit(20000);
		ac.withdraw(50000);
		// ac 인스턴스
		System.out.println("===============================");
		
		Account ac2 = new Account();
		// ac2 인스턴스
		ac2.withdraw(10000);
		ac2.deposit(40000);
		
		System.out.println("===============================");
		ac2.accountNo = "111-2222-3333";
		ac2.ownerName = "박영진";
		ac2.showAccountInfo();
		
		System.out.println("===============================");

		ItwillBank it = new ItwillBank();
		it.contract("상해");
		
		
	}// main 메서드 끝

}//Test 클래스 끝
class Account{
	String accountNo;
	String ownerName;
	int money; //입출금 금액
	int balance = 0; // 잔고

	
	public void deposit(int money){ // 입금 -> money 입금할 금액을 파라미터로 설정해야 하는데 오류 발생
		
		balance += money;
		System.out.printf("%d원이 입금되었습니다.\n",money);
		System.out.println("현재 잔고 : " + balance);
	}
	public int withdraw(int money) { //출금
		
		if(balance < money ) {
			System.out.println("잔고부족으로 출금이 불가능합니다.");
			System.out.println("현재 잔고 : " + balance + "출금하실 금액 : " + money);
			money = 0;
		}else {
			balance -= money;
			System.out.println("출금할 금액 : " + money + "원");
			System.out.println("현재 잔고 : " + balance + "원");
			System.out.println(money + "원이 출금되었습니다.");
			
		}
		
		return 0;

	}
	public void showAccountInfo() {
		System.out.printf("계좌번호 : %s\n",accountNo);
		System.out.printf("예금주명 : %s\n",ownerName);
		System.out.printf("잔고 : %d\n",balance);
	}
}//Account 클래스 끝


class ItwillBank extends Account{
	String insureName; //매개변수 insureName과 contract의 insureName이 같기에 this를 사용
	
	public void contract(String insureName) {
		this.insureName = insureName;
		
		System.out.printf("%s보험 계약 완료!", insureName);
	}
}