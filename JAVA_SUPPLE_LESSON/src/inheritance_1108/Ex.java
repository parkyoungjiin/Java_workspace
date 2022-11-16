package inheritance_1108;

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
	}//main 끝

	
	
}//Ex 끝
