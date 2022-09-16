package array;

import java.io.StreamCorruptedException;

public class Test {

	public static void main(String[] args) {
	int [] arr = new int[5];
	
	arr[0] = 1;
	arr[1] = 5;
	arr[2] = 2;
	arr[3] = 3;
	arr[4] = 4;
	
	
	
	for (int i = 0 ; i < arr.length ; i++) {
		System.out.println(arr[i]);
	}
	
	
	System.out.println("===================================");
	
//	boolean [] arr2 = new boolean[2];
//	
//	arr2[0] = false;
//	arr2[1] = false;
//	arr2[2] = true;
//
//	for (int j = 0 ; j < arr2.length ; j++) {
//		System.out.println(arr2[j]);
//	}		

	String [] arr3 = new String[2];
	
	arr3[0] = "홍길동";
	arr3[1] = "이순신";
	arr3[2] = "";
	
	for (int k = 0 ; k < arr3.length ; k++) {
		System.out.println(arr3[k]);
	}	
	
	double [] arr4 = new double [4];
	
	arr4[0] = 1.1;
	arr4[1] = 1.1;
	arr4[2] = 1.1;
	arr4[3] = 1.1;
	
	for (int k = 0 ; k < arr4.length ; k++) {
		System.out.println(arr4[k]);
	}
	
	}//main 메서드 끝

}//Test 클래스 끝
