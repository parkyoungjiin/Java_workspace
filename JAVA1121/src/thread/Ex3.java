package thread;

public class Ex3 {

	public static void main(String[] args) {
		YourThread nt1 = new YourThread("A작업", 100);
		YourThread nt2 = new YourThread("B작업", 50);
		YourThread nt3 = new YourThread("C작업", 100);
		
		Thread t = new Thread(nt1);
		Thread t2 = new Thread(nt2);
		Thread t3 = new Thread(nt3);
		t.start();
		t2.start();
		t3.start();
	}

}

class A {}

//이미 A 클래스를 상속받은 클래스에 멀티쓰레딩을 구현하는 경우 (Thread 클래스를 상속받지 못함, 다중상속X)
//Runnable 인터페이스를 구현해야 한다.

class YourThread extends A implements Runnable {
	//The type YourThread must implement the inherited abstract method Runnable.run()
	// => run() 메서드를 구현해야 한다.
	String name;
	int count;
	public YourThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i =0 ; i <= count; i++) {
			System.out.println(name + ":" + i);
		}
	}
	
	
	
	//run() 메서드를 오버라이딩하여 멀티쓰레딩으로 처리할 코드를 기술
	
	
}
