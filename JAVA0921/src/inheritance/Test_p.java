package inheritance;

public class Test_p {

	public static void main(String[] args) {

	Student s = new Student();
	
	System.out.println("==========================");
	Student s1 = new Student("박영진", 26, true, false);
		
		
	}//main 메서드 끝

}
class Person {
	String name;
	int age;
	boolean isHungry;
	
	public Person() {
		System.out.println("Person()생성자 출력됨!");
	}
	
	public void eat() {
		System.out.println("밥먹기!");
	}
	public void sleep() { 
		System.out.println("잠자기!");
	}
}//Person 클래스(부모)

class Student extends Person{
	boolean isStudyMode;
	
	public Student() {
		System.out.println("Student()생성자 호출됨!");
	}
	public Student(String name, int age, boolean isHungry, boolean isStudyMode) {
		super();
		
		System.out.println("Student(String name, int age, boolean isHungry, boolean isStudyMode) 생성자 호출됨!");
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 배고픔 : " + isHungry + ", 공부모드 : " + isStudyMode);
	}
	public void study() {
		System.out.println("공부하기");
	}
}// Student 클래스 (자식)
