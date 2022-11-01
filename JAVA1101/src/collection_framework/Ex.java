package collection_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex {

	public static void main(String[] args) {
//		HashSet set = new HashSet();
		Set set = new HashSet(); // hashset -> set 업캐스팅
		System.out.println("Set 객체 비어 있는가? : " + set.isEmpty());
		
		System.out.println("Set 객체에 저장된 요소 개수 : " + set.size());
		
		set.add(1); // int형 ->Integer(Wrapper) -> Object 로 변환되어 저장
		set.add("TWO"); // String -> Object
		set.add(3.14); // double -> Double(Wrapper) -> Object 
		System.out.println("Set 객체 비어 있는가? : " + set.isEmpty());
		
		System.out.println("Set 객체에 저장된 요소 개수 : " + set.size());
		
		System.out.println("set 객체의 모든 요소 출력 : " + set); //set.String
		// set만 적어도 되는 이유 : toString() 메서드가 오버라이딩 되어 있기에 출력문에 사용이 가능하다.
		
		System.out.println("실수 3.14 출력 가능한가:"  + set.add(3.14));
		
		System.out.println("문자 '4' 추가 가능한가?" + set.add('4'));
		System.out.println("set 객체의 모든 요소 출력 : " + set); //set.String
		
		set.add(5);
		set.add("육");
		System.out.println("Set 객체에 저장된 요소 개수 : " + set.size());
		System.out.println("set 객체의 모든 요소 출력 : " + set); //set.String
		
		System.out.println("문자열 4 존재 : " + set.contains('4'));
		
		System.out.println("실수 3.14 삭제 : " + set.remove(3.14));
		
//		set.clear();

System.out.println("--------------------");
		Object[] oArr = set.toArray();
		System.out.println(Arrays.toString(oArr));
		System.out.println("--------------------");
		
		for(int i = 0; i < oArr.length; i++) {
			System.out.println(oArr[i]);
		}
		
		System.out.println("--------------------");
		Set set2 = new HashSet(set);
		System.out.println("set2 객체 모든 요소 출력" + set2);
		
		Set set4 = new HashSet(set);
		set4.remove("육");
		set4.remove("TWO");
		
		TreeSet treeSet = new TreeSet(set4);
		
		System.out.println("treeset 객체 모든 요소 출력 : " + treeSet);
		
	}
}
