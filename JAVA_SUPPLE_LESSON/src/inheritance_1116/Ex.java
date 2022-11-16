package inheritance_1116;

import inheritance_1116.Person;

public class Ex {

	public static void main(String[] args) {
		SpiderMan s = new SpiderMan();
		s.jump();
		System.out.println("-------------");
		
		Person p = s;
		p.jump();
		
		System.out.println("-------------");
		Person p2 = new IronMan();
		p2.talk();
		p2.jump();
	}

}
class Person {
	private String name;
	
	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void talk() {
		System.out.println("Person - 말하기!");
	}
	
	public void jump() {
		System.out.println("Person - 점프!");
	}
}// Person 끝


class SpiderMan extends Person{
	String friend = "네드리즈";
	
	public void fireWeb() {
		System.out.println("SpiderMan - 거미줄 ㄱ");
	}

	public void jump() {
		System.out.println("SpiderMan - 슈퍼점프");
	}

	
	
}//SpiderMan 끝

class IronMan extends Person{
	
	public void fly() {
		System.out.println("아이어맨 비행!");
	}
	
	public void fireBim() {
		System.out.println("IronMan - 빔");
	}

	@Override
	public void talk() {
		System.out.println("IronMan - 잔소리");
	}
	
}//IronMan 끝

