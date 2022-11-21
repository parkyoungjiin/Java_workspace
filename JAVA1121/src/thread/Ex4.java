package thread;

public class Ex4 {

	public static void main(String[] args) {

		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 100000; i++) {
					System.out.println(i + " : + A작업 ");
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 100000; i++) {
					System.out.println(i + " : + B작업 ");
				}
			}
		});
		
		//start 메서드 호출하여 멀티쓰레딩 실행 
//		t.start();
//		t2.start();
		
		
		
		//-------------------------압축된 형태로 변형-------------------------------------------
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 100000; i++) {
					System.out.println(i + " : + A작업 ");
				}
			}
		}).start();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 100000; i++) {
					System.out.println(i + " : + B작업 ");
				}
			}
		}).start();;
	}//main

}
