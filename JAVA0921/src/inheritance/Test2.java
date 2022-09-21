package inheritance;

public class Test2 {

	public static void main(String[] args) {
	
	Manager m = new Manager("박영진", 1000, "개발부서");
	System.out.println(m.getManager());
	
	
	
	
	
	}//main 끝

}//Test2 끝
class Employee{
	String name; 
	int salary;
	
	
	public String getEmployee() {
		
//		System.out.println(name + "," + salary);
//		return
		return name + ", " + salary;
		
//		String names = name + "," + salary;
//		return names;
	}
}//Employee 클래스

class Manager extends Employee{
	String depart;
	
	public Manager(String name, int salary, String depart) {
		this.depart = depart;
		this.name = name;
		this.salary = salary;
		// name, salary는 Employee 라는 부모 클래스에 정의 되어 있기에
		// super() 로 지정해도 상관 없다 !
		// Manager 라는 생성자를 통해서 main 메서드에서 m.name, m,depart, m.salary 를 지정하지 않아도 된다. (파라미터로 받기에 ! )
		
	}
	
	public String getManager() {
		getEmployee();
		return getEmployee() + ", "  + depart;
	}
	
}

