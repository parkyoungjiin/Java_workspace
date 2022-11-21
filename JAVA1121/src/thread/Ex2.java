package thread;

public class Ex2 {

	public static void main(String[] args) {
		myThread mt1 = new myThread("A작업", 1000000);
		myThread mt2 = new myThread("B작업", 50000);
		myThread mt3 = new myThread("C작업", 1000000);
	
//		Thread t = new myThread(null, 0)

	// run 메서드 사용할 경우 싱글쓰레딩으로 처리된다. -> 그렇기에 start 호출	
//	mt1.run();
//	mt2.run();
//	mt3.run();
	
	mt1.start();
	mt2.start();
	mt3.start();
	
	
	}//main 끝

}
class myThread extends Thread{
	String name;
	int count;
	
	public myThread(String name, int count) {
	
		super();
		this.name = name;
		this.count = count;
	}

	//run() 메서드를 오버라이딩하여 멀티쓰레딩으로 처리할 코드를 기술
	@Override
	public void run() {
		for(int i = 1; i<=count; i++) {
			System.out.println(name + " : " + i);
		}
		super.run();
	}
	
	
}