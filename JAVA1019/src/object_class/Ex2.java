package object_class;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		// 1번. 리터럴 할당을 통해 생성
		String s1 = "Hello";
		String s2 = "Hello";
		
		if(s1 == s2) {
			System.out.println("s1와 s2는 주소값이 같다");
		}else {
			System.out.println("s1과 s2는 주소값이 다르다");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1와 s2의 문자값이 같다");
		}else {
			
			System.out.println("s1와 s2의 문자값이 다르다");
		}
		System.out.println("-------------------------------");
		
		// 2번 방법. new 연산자
		String s3 = new String("Hello");
		String s4 = new String("Hello"); 
		//s3, s4는 문자열 내용은 같지만 주소값은 다르다
		
		if(s3 == s4) {
			System.out.println("s3와 s4의 주소값 같다");
		}else {
			System.out.println("s4와 s4의 주소값 다르다");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s3와 s4의 문자값이 같다");
		}else {
			
			System.out.println("s4와 s4의 문자값이 다르다");
		}
	}//main 끝

}// Ex2 끝
