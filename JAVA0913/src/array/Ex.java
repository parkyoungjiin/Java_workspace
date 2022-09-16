package array;

public class Ex {

	public static void main(String[] args) {
// <배열 선언 기본 문법>

	// 데이터타입[] 변수명;
		
//		int[] score; // 변수 선언과 비슷하지만, 데이터타입 뒤 []을 붙이면 된다. (배열 공간이 생성되지 않은 상태 => 아직 데이터 저장은 불가능)
		// => 주솟값이 들어있는 변수(참조변수)로 취급된다. (int 는 기본형, int []는 참조형)

//	<배열 생성 기본 문법 >
    
	// 변수명 = new 데이터타입 [배열크기]; => 실제 메모리 공간이 생성되었기에 데이터 저장이 가능하다.
		// 생성된 배열에는 자동으로 인덱스 부호가 부여된다. (0 ~ 배열크기-1 까지 부여된다.)
//		score = new int[5];
		
//	<배열 선언 + 생성 기본문법> ** 이것을 자주 사용 한 번에 선언, 생성을 처리 
	
	// 데이터타입 [] 배열명 = new 데이터타입[개수];
		int [] score = new int [5];
	
//	<배열접근 기본 문법>	
	// 변수명[인덱스];
		System.out.println(score); // 주솟값이 출력
		System.out.println(score[0]); //0번지에 있는 인덱스 데이터값이 출력
		System.out.println(score[1]); //1번지에 있는 인덱스 데이터값이 출력
		System.out.println(score[2]); //2번지에 있는 인덱스 데이터값이 출력
		System.out.println(score[3]); //3번지에 있는 인덱스 데이터값이 출력
		System.out.println(score[4]); //4번지에 있는 인덱스 데이터값이 출력
		
	System.out.println("=================================");
	
		score [0] = 90;
		score [1] = 600;
		score [2] = 700;
		score [3] = 90;
		score [4] = 50;
		
		for (int i = 0; i < score.length; i++) { // 배열.length 사용 시 배열크기가 변경되더라도 동적으로 대응이 가능하다.
			System.out.println(score[i]);
		} // 배열 전체 접근 기능 공식을 사용하여 배열 데이터 모두 출력
		System.out.println("배열의 크기 : " + score.length); 
		
		int arr3, arr4[];
	
	
	
	}//main 메서드 끝

}//ex 클래스 끝
