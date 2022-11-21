package thread;

public class Ex {

	public static void main(String[] args) {
		
	NoThread nt1 = new NoThread("A작업", 1000000);
	NoThread nt2 = new NoThread("B작업", 50000);
	NoThread nt3 = new NoThread("C작업", 1000000);
	
	nt1.run(); //A 작업이 100만번 실행 끝나면
	nt2.run();// B 작업 50만번 실행이 끝나면,
	nt3.run(); // C작업이 실행된다.
	
	// 일반적인 프로그램은 싱글쓰레드이며 , 앞의 코드가 실행이 끝나야만 다음 코드가 실행된다.
	
	}

}

class NoThread{
	String name;
	int count;
	
	//파라미터 생성자
	public NoThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	public void run() {
		for(int i = 0; i<count; i++) {
			System.out.println(name + " : " + i);
		}
	}
	
}