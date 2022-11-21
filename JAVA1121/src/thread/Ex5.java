package thread;

import java.time.LocalTime;

public class Ex5 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1 ; i<=100; i++) {
					System.out.println("*****");
					
					//출력문 실행 후 쓰레드를 0.1초동안 재우기
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		System.out.println("t1 쓰레드 우선순위 : " + t1.getPriority());
		
		t1.setPriority(Thread.MIN_PRIORITY);//우선순위 1로 변경
		t1.setPriority(Thread.MAX_PRIORITY);//우선순위 10로 변경
		
		for(int i = 1 ; i <= 10; i++) {
			LocalTime now = LocalTime.now();
			System.out.println(now);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}//main 끝

}
