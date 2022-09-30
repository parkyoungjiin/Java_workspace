package polymorphism;

public class Ex5 {

	public static void main(String[] args) {
		병사 병사 = new 병사();
		
//		병사.장착(new 칼()); //매개변수 값으로 new 칼() => 칼이 무기를 상속받아서 생겨났기에 무기라는 배개변수에 들어갈 수 있음.
		칼 칼 = new 칼();
		총 총 = new 총();
		활 활 = new 활();
		
		병사.장착(칼);
		병사.장착(총);
		병사.장착(활);
// ===========================================================================
		System.out.println("------------------------------------");
		
		Employee emp = new Employee("박영진", 10000);
		
		System.out.println("Employee 정보 : " + emp.getEmployee());
		emp.salaryCalculation();
		
		Manager man = new Manager("이순신", 4000, "개발팀", 3);
		System.out.println("Manager 정보 : " + man.getManager());
		System.out.println("Manager 정보 : " + man.getEmployee());
		man.salaryCalculation();
		
		
// ===========================================================================
		System.out.println("------------------------------------");
		Engineer eng = new Engineer("박영진", 5000, 15);
//		System.out.println("Engineer 정보 :" + eng.getEngineer());
		System.out.println("Engineer 정보 :" + eng.getEmployee());
		eng.salaryCalculation();
		
// ===========================================================================
		System.out.println("------------------------------------");
		
		emp.salaryCalculationAll(emp);
		// emp.salaryCalculationAll(new Employee());
		
		emp.salaryCalculationAll(man);
		// emp.salaryCalculationAll(new Manager());

		emp.salaryCalculationAll(eng);
		// emp.salaryCalculationAll(new Enginner());

		
	
	
	}//main 메서드 끝

}//Ex5 클래스 끝

class Employee {
	//멤버변수 선언
	String name;
	int salary;
	
//	//기본 생성자 정의
//	public Employee() {
//		
//	}

	//파라미터 생성자 정의
	public Employee(String name, int salary) {
		super(); // Object() 기본 생성자 호출
		this.name = name; 
		this.salary = salary;
	}
	
	//직원 이름과 연봉을 리턴받는 getEmployee 메서드
	
	public String getEmployee() {
		return name + "," + salary; // 문자열 형태로 리턴
	}
	
	// 일반 직원의 연봉 계산기(기본 연봉을 그대로 적용)
	public void salaryCalculation() {
		System.out.println("연봉 : " + salary);
	}
	
	//전 직원의 연봉을 슈퍼클래스인 Employee 클래스에서 모두 계산(다형성을 이용, Employee, Manager, Engineer 인스턴스 모두 처리해야 함.)
	// => 따라서, 메서드 파라미터로 다형성을 적용한 Employee 타입 필요
	public void salaryCalculationAll(Employee emp) { //Employee emp = new Manager(); Employee 클래스 안에서 파라미터로 전달하기에 업캐스팅이 자동으로 된다.
		int salaryResult = 0; //연봉 계산 결과를 저장할 변수
	
		//참조영역의 축소로 인해 각 서브클래스 타입 멤버변수는 보이지 않음. (업캐스팅했기에)
		// => Employee를 제외한  Manager, Engineer 의 경우 다시 다운캐스팅을 통해 서브클래스의 전용 멤버에 접근해야 한다.
		// => 단, 무작정 다운캐스팅을 수행할 경우 오류가 발생할 수 있으므로, 반드시 instanceof 연산자를 통해 타입 판별 후 다운캐스팅 필요
		
		
//		 * 주의할점 *
//		 => instanceof 를 사용할 경우, 하위타입부터 판별을 수행해야 한다. (else if 문장으로 인해 if문이 계속 돌 수 있기 때문이다.)
//		if(emp instanceof Employee) {
//			System.out.println("Employee 그대로 사용!");
//		}
//		=> emp 로컬 변수에 들어갈 수 있는 Employee, Manager, Engineer 모두 Employee 타입으로 변환이 가능하므로 항상 첫 번째 문은 true가 되고
//		첫 번째 if문 블록이 계속 실행된다.
		
		
// -----------------------------------------------------------------------------------------------------------------------------------------		
		if(emp instanceof Manager) {
			System.out.println("Employee -> Manager 로 다운캐스팅 가능"); // Manger 일 때, 다운 캐스팅 가능(자식)
			
			Manager man = (Manager)emp; //부모 -> 자식으로 갈 때는 강제 형변환 
			// 업캐스팅으로 축소되었던 참조영역이 다운캐스팅으로 확대되었으므로
			// 다운캐스팅된 Manager 타입 인스턴스를 통해 모든 변수 접근이 가능하다.
			
			salaryResult = man.salary + man.managerEmployeeCount * 10;
			
		}else if(emp instanceof Engineer) { // Engin
			System.out.println("Employee -> Enginner 로 다운캐스팅 가능"); // Enginner 일 때, 다운캐스팅 가능(자식)
			Engineer eng = (Engineer)emp;
			// 업캐스팅으로 축소되었던 참조영역이 다운캐스팅으로 확대되었으므로
			// 다운캐스팅 된 Engineer 타입 참조변수 (eng)를 통해 모든 변수 접근 가능
			//기본 연봉과 자격증 수에 따른 인센티브가 적용된 연봉이 계산
			salaryResult = eng.salary + eng.numOfCertificate * 20;
			
		}else if(emp instanceof Employee) {
			System.out.println("Employee 그대로 사용"); //부모니까 다운캐스팅 불가능
			salaryResult = salary;
		}
	
	//각 직원의 계산된 연봉 출력
		System.out.println("연봉 :" + salary);
	}


}//Employee 클래스 끝 ------------




class Manager extends Employee { 
	// 기본생성자가 없어서 오류 발생 Implicit super constructor Employee() is undefined for default constructor. Must define an explicit constructor
	// => 부모에 기본생성자 생성 or 파라미터 생성자 호출
	
	//관리 직원들은 연봉 + 관리하는 직원 수에 비례하여 인센티브 지급
	
	//Manager 클래스 멤버변수 추가
	String depart;
	int managerEmployeeCount;//관리하는 직원 수 
	

	public Manager(String name, int salary, String depart, int managerEmployeeCount) { 
		// 기본적으로 super()가 생략되어 있는데 
		// ******부모 클래스에는 파라미터 생성자가 있기에, 파라미터 생성자를 호출하도록 생성자를 정의 해야 한다.**********
		super(name, salary);
		this.depart = depart;
		this.managerEmployeeCount = managerEmployeeCount;
	}
	
	//이름, 연봉, 부서명, 관리하는 직원 수를 리턴하는 getManager() 메서드 정의
	
	public String getManager() {
//		return name + "," + salary + "," + depart + "," + managerEmployeeCount;
		return getEmployee() + "," + "," + depart + "," + managerEmployeeCount; // 위 문장을 이와 같이 작성하여 코드의 중복을 제거할 수 있다는 상속의 장점을 보여줌.
	}

	// 매니저 연봉 = 기본연봉 + (관리직원 수 + 10만원);
	@Override
	public void salaryCalculation() {
		int salaryResult = salary + managerEmployeeCount + 10; // 기본연봉 + (관리직원 수 + 10만원)으로 계산한 것을 salaryResult에 저장
		
		
		System.out.println("연봉 : " + salaryResult);
	}

	

	
	

}//Manager 클래스 끝
class Engineer extends Employee {
	//엔지니어들은 자격증 수에 비례하여 연봉 인센티브 지급
	
	int numOfCertificate; // 자격증 개수

	public Engineer(String name, int salary, int numOfCertificate) {
		super(name, salary); //파라미터 생성자 호출( 이 문장이 없으면 오류가 발생함. 왜냐하면 기본적으로 super() 가 생략되어 있는데, Employee(부모) 클래스에는 기본 생성자가 아닌 파라미터 생성자이기 때문이다.)
		
		this.numOfCertificate = numOfCertificate; 
	}
	
	public String getEngineer() {
		return getEmployee() + "," + numOfCertificate + "개";
	}

	//Employee 연봉계산기를 오버라이딩 엔지니어 연봉 = 기본연봉 ( 자격증 수 * 20만원)
	@Override
	public void salaryCalculation() {
		int salaryResult = salary + numOfCertificate * 20;
		System.out.println("연봉 :" + salaryResult);
	}
	
	
	
	
	
}// Engineer 클래스 끝 ====================












//=================================================================
class 병사{
	public void 장착(무기 무기) {
		무기.장착();
	}
	public void 공격(무기 무기) {
		무기.공격();
	}
}//병사 끝

class 무기 {
	public void 장착() {
		System.out.println("무기를 장착하다");
	}
	public void 공격() {
		System.out.println("무기로 공격하다");
	}
}// 무기 끝

class 칼 extends 무기 {

	@Override
	public void 장착() {
		System.out.println("칼을 장착하다.");
	}

	@Override
	public void 공격() {
		System.out.println("칼로 공격하다.");
	}
	
	
}
class 총 extends 무기 {
	@Override
	public void 장착() {
		System.out.println("총을 장착하다.");
	}

	@Override
	public void 공격() {
		System.out.println("총으로 공격하다.");
	}
	
	
}
class 활 extends 무기 {
	@Override
	public void 장착() {
		System.out.println("활을 장착하다.");
	}

	@Override
	public void 공격() {
		System.out.println("활로 공격하다.");
	}
	
	
}