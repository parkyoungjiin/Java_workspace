package collection_framework;

import java.util.Stack;

public class Ex5 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		//push : 데이터 추가
		stack.push("1- www.itwillbs.co.kr");
		stack.push("2- www.naver.com");
		stack.push("3- www.gogle.com");
		System.out.println("모든 요소 출력: " +stack);
		// peek() : TOP에 위치한 요소 확인(제거 X)
		System.out.println("맨 위(TOP) 요소 확인 : " + stack.peek());
		System.out.println("맨 위(TOP) 요소 확인 : " + stack.peek());
		System.out.println("맨 위(TOP) 요소 확인 : " + stack.peek());
		System.out.println("---------------------");
		// pop() : TOP에 위치한 요소 확인(제거 o = 꺼내기)
		System.out.println("맨 위(TOP) 요소 확인 : " + stack.pop());
		System.out.println("맨 위(TOP) 요소 확인 : " + stack.pop());
		System.out.println("맨 위(TOP) 요소 확인 : " + stack.pop());
	}

}
