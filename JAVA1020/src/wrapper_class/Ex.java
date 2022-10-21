package wrapper_class;

public class Ex {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스
		 * - 기본 데이터타입을 객체 형태로 관리해주는 클래스들의 모음
		 *   => java.lang 패키지에 위치
		 * - 기본 데이터타입과 1:1로 대응하는 8개의 클래스를 제공
		 *   (Byte, Short, Integer, Long, Float, Double, Character, Boolean)
		 * - Wrapper 클래스에서 제공하는 상수와 메서드 등을 활용하여
		 *   기본 데이터타입 데이터를 다양하게 처리할 수 있음
		 */
		
		System.out.println("byte 타입 메모리 크기(bit) : " + Byte.SIZE);
		System.out.println("byte 타입 메모리 크기(byte) : " + Byte.BYTES);
		System.out.println("byte 타입 최소값 : " + Byte.MIN_VALUE);
		System.out.println("byte 타입 최대값 : " + Byte.MAX_VALUE);
		
		System.out.println("short 타입 메모리 크기(bit) : " + Short.SIZE);
		System.out.println("short 타입 메모리 크기(byte) : " + Short.BYTES);
		System.out.println("short 타입 최소값 : " + Short.MIN_VALUE);
		System.out.println("short 타입 최대값 : " + Short.MAX_VALUE);
		
		System.out.println("char 타입 메모리 크기(bit) : " + Character.SIZE);
		System.out.println("char 타입 메모리 크기(byte) : " + Character.BYTES);
		System.out.println("char 타입 최소값 : " + Character.MIN_VALUE);
		System.out.println("char 타입 최대값 : " + Character.MAX_VALUE);
		

	}

}







