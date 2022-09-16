package array;

public class Ex3 {
	public static void main(String[] args) {
	
	int total = 0;
	
	int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	for(int i = 0 ; i < arr.length ; i++) {
		System.out.println(arr[i]);
	
	
		total += arr[i];
	}
	
	System.out.println("total : " + total);
	
	System.out.println("========================");
	
	//홀수의 합을 누적할 변수, 짝수의 합을 누적할 변수 선언
	
	int evenTotal = 0;//홀
	int oddTotal = 0;//짝
	
//	int [] arr2 = new int [5];
	
//	arr2[0] = 1;
//	arr2[1] = 2;
//	arr2[2] = 3;
//	arr2[3] = 4;
//	arr2[4] = 5;
	
	for(int i = 0 ; i < arr.length ; i++) {
		if (arr[i] % 2 == 1 ) {
			oddTotal += arr[i];
		}else if(arr[i] % 2 == 0){
			evenTotal += arr[i];
		}
	}
	
	System.out.println("홀수의 합 : " + oddTotal);
	System.out.println("짝수의 합 : " + evenTotal);
	
	System.out.println("===================");
	
	int maxArr = 0;
	
	int [] array =  {1, 5, 3, 8, 7};
	
	
	for (int j = 0 ; j < array.length ; j++) {
		if(array[j] > maxArr) { //배열 0일 때 max랑 비교해서 arr이 더 크면, arr배열의 값을 max에 넣고 1번지의 값이 max랑 비교해서 더 크면 max에 넣어라,
			maxArr = array[j];
			System.out.printf("%d 일 때 maxArr의 값은 %d이다.\n",j,maxArr);
		}else {
			System.out.printf("%d 일 때 maxArr의 값은 %d이다.\n",j,maxArr);
		}
		
	}//for문 끝

//	최대값 등의 비교 시 비교 대상을 변수에 직접 저장할 경우 조건에 만족하지 않는 경우가 있다.
//	따라서 배열 내의 데이터를 비교해야 하는 경우 비교 대상 값으로 배열 내의 데이터를 갖고 시작하는 것이 좋다.
	
	int [] array2 = {-9, -5, -3, -8, -7};
	
	int maxArr2 = array2[0]; // maxArr2를 0으로 지정할 경우, array2가 전체 음수이기에 0이 max값으로 도출된다.
	
	for (int i = 1; i < array2.length; i++) {
		System.out.println(array2[i] + " vs " + maxArr2);
	}
	
	
	
	
	
	}//main 메서드 끝
}// Ex3 클래스 끝
