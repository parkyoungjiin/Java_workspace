package inheritance;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * has-a 관계(포함) vs is-a 관계(상속)
		 *  1. A has a B = A가 B를 포함한다로 표현 가능한 관계
		 *  - 가장 일반적인 객체 관계
		 *  - 특정 클래스 내에서 다른 클래스의 인스턴스를 생성하여
		 *  해당 인스턴스를 다루는 관계
		 *  
		 *  2. is-a 관계 (상속)
		 *  - A is a B = A는 B이다 로 표현 가능한 관계
		 *  - 특정 클래스가 다른 클래스의 상속을 받아
		 * 	  해당 클래스의 멤버를 선언 없이 다루는 관계
		 *  
		 *  
		 *  
		 */
	}

}// Ex3
class Engine {
	int cc = 3000;
}

class Car { //Car가 Engine을 포함한다는 has-a 관계. (포함 관계) => Car has a Engine
	//포함관계 일 경우, 해당 클래스의 인스턴스를 통해 접근 가능한 관계
	
	Engine engine = new Engine(); // 포함하고 있는 Engine의 인스턴스 생성 (생성해야 포함하고 있는 클래스의 멤버변수에 접근할 수 있다.)
	
	String modelName = "그랜져";
	
	public void showCarInfo() {
		System.out.println("모델명 : " + modelName); // 자신의 멤버변수기에 변수명만으로 접근이 가능
		System.out.println("배기량 : " + engine.cc); // 그냥 cc를 적으면 오류 ! 다른 클래스의 변수에 접근하기 위해서는 참조변수명.멤버변수로 접근
		
		
	}
}

class FireEngine extends Car {
	int supplyLimit = 10000; // 급수량 멤버변수
		public void showFireEngineInfo() {
			System.out.println("급수량 : " + supplyLimit);
			System.out.println("모델명 : " + modelName);
			System.out.println("배기량 : " + engine.cc); // 부모와 포함관계인 변수에 접근할 때도 참조변수명.멤버변수
		}
	

}//FireEngine 클래스
