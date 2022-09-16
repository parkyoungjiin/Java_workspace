package array;

public class Test {

	public static void main(String[] args) {

	int money = 2680;
	
	int [] arr = {500, 100, 50, 10};
	
	for(int i = 0; i<arr.length ; i++) {
		
		if(money / arr[i] > 0) {
			System.out.println(arr[i] + "원 : " + (money / arr[i]) + "개");//몫 출력
			money %= arr[i];
			System.out.println("남은 거스름돈 : " + money + "원");
			System.out.println("");
			
		}
		
		
		
		
		
		}//for문 끝
	}
	
}

//			else if(money / arr[i] > 0) {
//			System.out.println("100원 : " + (money / arr[i]));
//			money %= arr[i];
//		}else if(money / arr[i] > 0) {
//			System.out.println("50원 : " + (money / arr[i]));
//			money %= arr[i];	
//		}else {
//			System.out.println("10원 : " + (money / arr[i]));
//			money %= arr[i];	
//			
//		}

// 돈을 나눴을 때 0보다 크면 다시 나누기

//2680