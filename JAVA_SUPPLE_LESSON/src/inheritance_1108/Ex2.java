package inheritance_1108;

public class Ex2 {

	public static void main(String[] args) {
		SpiderMan2 sp = new SpiderMan2();
		sp.setName("피터파커");
		System.out.println(sp.getName());
		
		sp.talk();
		sp.jump();
		
		//-------------------------
		System.out.println("-------------------");
		
		IronMan2 i = new IronMan2();
		
		i.talk();
		i.jump();
		i.setName("아이언맨");
		System.out.println(i.getName());
		System.out.println("-------------------");
		
		System.out.println(sp.friends);
		sp.fireWeb();
	}//main 끝

	
	
}//Ex 끝
