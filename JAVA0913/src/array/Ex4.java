package array;

public class Ex4 {

	public static void main(String[] args) {
		
	
		
		
	
	int [][] arr = new int [3][2];
	
	arr[0][0] = 1; arr[0][1] = 2;
	arr[1][0] = 3; arr[1][1] = 4;
	arr[2][0] = 5; arr[2][1] = 6;
	
	
	// 바깥쪽 for 문 : 행 크기만큼 반복(1차원 배열과 동일)
	for(int i = 0 ; i < arr.length ; i++) {
		// 안쪽 for문 : 각 행의 열 크기만큼 반복
		for(int j = 0 ; j < arr[i].length; j++) {
			System.out.print(arr[i][j]);
		
		}//안쪽 for문 끝
		
	}// 바깥 for 끝
	System.out.println("");
	System.out.println("==============================");
	
	int [][]arr2 = { 
			// 전체 블록 내의 중괄호(블록)개수 = 행의 개수
			// 내부 중괄호 (블록) 내의 데이터 개수 = 열의 개수 
			{1 ,2},
			{3, 4},
			{5, 6}	
			
	};
	
	// 중첩 for문을 이용하여 2차원 배열 차례대로 접근
	for(int i = 0 ; i < arr2.length ; i++) {
		for (int j = 0 ; j <arr2[i].length ; j++) {
			System.out.print(arr2[i][j]);
		}
	System.out.println("");
	}
	
	
	System.out.println("==============================");
	
	

	
	String [][] names = {
			{"홍길동", "이순신", "강감찬"},
			{"김태희", "전지현", "송혜교"},
			{"유재석", "정우성", "조인성"}			
	};
	
	for(int i = 0 ; i < names.length ; i++) {
		for (int j = 0 ; j <names[i].length ; j++) {
			System.out.print(names[i][j]);
		}
		System.out.println("");
	}

	
	System.out.println("==============================");
	
	int [][] arr3 = new int[2][];
	
	arr3[0] = new int[3]; // 정수형 배열 3개짜리 생성 후 번 행에 주소를 저장
	arr3[1] = new int[2]; // 정수형 배열 3개짜리 생성 후 0번 행에 주소를 저장
	arr3[2] = new int[4]; // 정수형 배열 3개짜리 생성 후 0번 행에 주소를 저장
	
	
	arr3[0] = new int[] {1, 2, 3};
	arr3[1] = new int[] {4, 5};
	arr3[2] = new int[] {6, 7, 8, 9};
	
	for(int i = 0 ; i < arr3.length ; i++) {
		for (int j = 0 ; j <arr3[i].length ; j++) {
			System.out.print(arr3[i][j]);
		}
		System.out.println("");
	}

	 
	
	
	
	
	
	
	
	}//main 메서드 끝

}// Ex4 클래스 끝
