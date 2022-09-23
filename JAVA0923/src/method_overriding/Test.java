package method_overriding;

public class Test {

	public static void main(String[] args) {

		
		
	Car c = new Car();
	electricCar ele = new electricCar();
	DieselCar di = new DieselCar();
	
	c.speedUp();
	c.speedDown();
	c.addFuel();
	System.out.println("================");
	ele.speedUp();
	ele.speedDown();
	ele.addFuel();
	
	System.out.println("================");
	di.speedUp();
	di.speedDown();
	di.addFuel();
	
	System.out.println("================");
		
	}

}//Test 클래스 끝

class Car{
	int speed;
	int maxSpeed;
	
	public void speedUp() {
		System.out.println("자동차 속도 증가!");
		
	}
	public void speedDown() {
		System.out.println("자동차 속도 감소!");
		
	}
	public void addFuel() {
		System.out.println("자동차 연료 주입");
		
	}
}// car 클래스 끝

class electricCar extends Car{
	int batteryCapacity; // 배터리 용량

	public void speedUp() {
		
		System.out.println("Electric 전기모터의 힘으로 속력 증가!");
	}
	

	public void speedDown() {
		System.out.println("Electric 속력 감소하면서 전기배터리 충전!!");
	}

	public void addFuel() {
		System.out.println("전기차 충전소에서 배터리 충전!");
	}


}//electricCar 클래스 끝

class DieselCar extends Car{
	int cc;

	public void speedUp() {
		System.out.println("디젤 엔진의 힘으로 속력 증가!");

	}

	public void speedDown() {
		System.out.println("디젤 자동차 속력 감소!");

	}

	public void addFuel() {
		System.out.println("주유소에서 디젤 연료 주입!");

	}
	
}
