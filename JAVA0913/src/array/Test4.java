package array;

public class Test4 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;
		
		
		for (int i = 0 ; i < array.length; i++) {
			for (int j = 0 ; j < array[i].length ; j++) {
				sum += array[i][j];
				count++;
			}//안쪽 for
		}//바깥 for
		
		System.out.println("sum = " + sum);
		
		
		System.out.println("======================================");
		

		// 학생이름 1차원 배열 학생 점수 2차원 배열 저장
		
		String [] names = {"홍길동", "이순신", "강감찬", "김태희", "전지현"};
		
		int [][] score = {
				{80, 70, 80}, //0행 0,1,2열 \n
				{90, 90, 90}, //1행 0,1,2열
				{50, 60, 77},
				{100, 100, 100},
				{80, 80, 60}
		};
		
		
		System.out.println("      < 학생 점수표 > ");
		System.out.println("        국어 영어 수학");
		
		
		for(int i = 0 ; i<score.length ; i++) {
			
			System.out.print(names[i]);
			for(int j = 0 ; j < score[i].length ; j++ ) {
				System.out.printf(" %3d ", score[i][j]);
			}
			System.out.println("");
		
		
		
		}//바깥 for문
		
//		for(int i = 0 ; i < scores.length ; i++) { 
//			System.out.print(scores[i][j]);// 이름 출력
//			
//				for(int j = 0 ; j < names[j] ; j++) {
//					System.out.print(names[j]);
//				}
//				System.out.println("");
//		
//		}
//			System.out.println(score);
		
		
		
		
		
	
		
	}//main 메서드 끝

}// Test4 클래스 끝
