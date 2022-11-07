package collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex4 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "자바");
		map.put(2, "JSP");
		map.put(3, "클라우드");
		
		System.out.println("map 객체의 모든 엔트리 : " + map);
		//키는 중복이 안되기에, 덮어쓸 때 제거되는 데이터가 리턴된다.
		System.out.println("3을 키로 갖는 값 추가 : " + map.put(3, "Spring Framework"));
		System.out.println("map 객체의 모든 엔트리 : " + map);
		
		System.out.println("4를 키로 갖는 Spring Framework : " + map.put(4, "Spring Framework"));
		System.out.println("map 객체의 모든 엔트리 : " + map);
		
		System.out.println("정수 2에 해당하는 키의 데이터 : " + map.get(2));
		System.out.println("문자열 2에 해당하는 키의 데이터 : " + map.get("2"));
		
		//set.keyset() : 모든 키를 리턴 ( set 타입으로)
		Set keySet = map.keySet();
		
		System.out.println("모든 키 : " + keySet);
		
		//Collection values() : 모든 값을 리턴 (Collection 타입으로)
//		List valueList = (List)map.values(); //주의사항 : 직접 다운캐스팅은 불가
		List valueList = new ArrayList(map.values()); 
		System.out.println("모든 값 : " + valueList);
		
		//keySet(키 값 리턴된 변수)를 o에 넣어서 get을 통해 해당 키에 맞는 값을 리턴
		for(Object o : keySet) {
			System.out.println(map.get(o));
		}
		System.out.println("-----------------------------");
		//entrySet() : 키=값 을 한 쌍으로 갖는 엔트리 객체를 Set 타입으로 리턴
		
		Set entryset = map.entrySet();
		System.out.println(entryset);
		
		System.out.println("-----------------------------");
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("010-2222-2222", "홍길동");
		map2.put("010-2222-3333", "홍길동");
		map2.put("010-2222-4445", "김태훈");
		map2.put("010-2222-5555", "김기백");
		//키 값은 중복되지 않지만, 이름 값은 중복 가능
		
		System.out.println(map2);
		
		System.out.println("홍길동이라는 이름이 존재하는가? " + map2.containsValue("홍길동"));
		
	}

}
