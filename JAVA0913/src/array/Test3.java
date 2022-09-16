package array;

public class Test3 {

	public static void main(String[] args) {
	
		
		
	
	int [] numbers = {3, 2, 14, 21, 100, 4, 2, 1};
	
	int max = numbers[0];
	
	int min = numbers[0];
	
	int sum = 0;
	
	double avg = 0.0;

	for(int i = 0 ; i < numbers.length ; i++) {
		if(numbers[i] > max) {
			
			max = numbers[i];
		
		}else if(numbers[i] < min) {
		
			min = numbers[i];
		
		}
		sum += numbers[i];

		avg = (double)sum / numbers.length; // 
		
	}
	System.out.println("최대값 : " + max);
	System.out.println("최소값 : " + min);
	System.out.println("합계 : " + sum);
	System.out.println("평균 : " + avg);
	
	
	
	
	
	}//main 메서드 끝

}
