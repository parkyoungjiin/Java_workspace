package thread;

public class Ex6 {

	public static void main(String[] args) {
		
		
		Account account = new Account(10000);
		
		WithdrawThread iBanking = new WithdrawThread("인터넷뱅킹", account, 3000);
		WithdrawThread mBanking = new WithdrawThread("모바일뱅킹", account, 3000);
	
		iBanking.start();
		mBanking.start();
		
	}

}

class Account {
	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	//입금
	public synchronized int deposit(int amount) {
//	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public synchronized int withdraw(int amount) {
		String threadName = Thread.currentThread().getName(); //쓰레드 명 저장
		
		if(balance >= amount) {
			balance -= amount;
		}else {
			System.out.println(threadName + "-잔액 부족으로 출금 불가!");
			amount = 0;
		}
		
		System.out.println(threadName + " - 출금된 금액 :" + amount + ", 출금후 잔액 " + balance);
		
		return amount;
	}
}//Account 끝

class WithdrawThread extends Thread{
	Account account;
	int amount;
	public WithdrawThread(String threadName, Account account, int amount) {
		super(threadName);
		this.account = account;
		this.amount = amount;
	}
	@Override
	public void run() {
		for(int i = 1; i <= 5 ; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			int money = account.withdraw(amount);
		}
	}
	
	
	
	//
}