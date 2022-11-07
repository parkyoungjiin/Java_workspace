package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
//		1. 향상된 for문 사용
		
		Set set = new HashSet();
		
		set.add(300);
		set.add(30);
		set.add(200);
		set.add(1);
		set.add(100);
		set.add(10);
		
		//제너릭 타입이 지정되지 않은 set 객체는 Object 타입으로 저장
		
		for(Object o : set) {
			System.out.println(o);
		}
		
		Set<Integer> set2 = new HashSet<Integer>();
		
		for(int num : set2) {
			System.out.println(num);
		}
		System.out.println("----------------------");
		//반복자 사용
		//1. itera tor() 메서드
		//2. while문을 통해 Iterator 객체의 hashNext(0) 메서드가 true 인 동안 반복
		
		Iterator ite = set.iterator();
		while(ite.hasNext()) { //hasNext() 는 boolean 타입으로 리턴된다. 그렇기에 while문을 사용
			System.out.println(ite.next());
			
		}
		
		Iterator<Integer> ite2 = set2.iterator();
		while(ite2.hasNext()) {
//			System.out.println(ite.next());
			int num = ite2.next();
			System.out.println("set 객체에 " + num + "이 존재하는가" + set2.contains(num));
		}
		
	}//main 메서드 끝

}
