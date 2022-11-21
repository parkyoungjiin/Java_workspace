package thread;

import javax.swing.JOptionPane;

public class Ex2_2 {

	public static void main(String[] args) {
//		String input = JOptionPane.showInputDialog("아무값이나 입력하세요 : ");
//		System.out.println("입력하신 값은 "  + input + "입니다.");
		
//		for(int i = 10 ; i >0 ; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			}catch (Exception e) {}
//		}//run
		
		MultiThread mt = new MultiThread();
//		mt.run(); // run 메서드를 사용하면 싱글쓰레드로 동작.
		mt.start(); // start 메서드를 사용하면 멀티쓰레드로 동작.
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요 : ");
		System.out.println("입력하신 값은 "  + input + "입니다.");
		
	}//main

}

class MultiThread extends Thread{

	@Override
	public void run() {
		for(int i = 10 ; i >0 ; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {}
		}
	}//run
	
}
