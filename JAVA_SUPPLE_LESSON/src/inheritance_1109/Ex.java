package inheritance_1109;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex {

	public static void main(String[] args) {
		SpiderMan sp = new SpiderMan();
		sp.setName("피터파커");
		System.out.println(sp.getName());
		
		sp.talk();
		sp.jump();
		
		//-------------------------
		System.out.println("-------------------");
		
		IronMan i = new IronMan();
		
		i.talk();
		i.jump();
		i.setName("아이언맨");
		System.out.println(i.getName());
		System.out.println("-------------------");
		
		System.out.println(sp.friends);
		sp.fireWeb();
		
		System.out.println("-------------------");

		Person p = sp; // 부모 = 자식 (자식꺼를 부모한테 준 것)
		
		System.out.println("-------------------");

		p = i;
		
		List list = new ArrayList<>(); // 부모 = 자식 (업캐스팅)
		
		List[] lists = {new ArrayList<>(), new LinkedList<>()};
		
	}//main 끝

	
	
}//Ex 끝
