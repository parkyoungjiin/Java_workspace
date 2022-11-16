package inheritance_1110;

public class Person {
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
	
}












