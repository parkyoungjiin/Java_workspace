package abstract_;

public class Test2 {

	public static void main(String[] args) {
		ElectricCar ec = new ElectricCar();
		ec.addFuel();
		ec.reportPosition();
		
		Diselcar d = new Diselcar();
		d.addFuel();
		d.reportPosition();
		System.out.println("----------다형성 적용-----------");
		Vehicle v = ec;
		v.addFuel();
		
		v = d;
		v.addFuel();
		
	}

}
abstract class Vehicle {
	int curX, curY;
	public abstract void addFuel();
	public void reportPosition() {
		System.out.println("현재 위치 : " + curX + "," + curY);
	}
}

class ElectricCar extends Vehicle{

	public void addFuel() {
		System.out.println("전기차 충전소에서 배터리 충전!");
	}
	
	
}
class Diselcar extends Vehicle{
	
	public void addFuel() {
		System.out.println("주유소에서 디젤 연료 공급!");
	}
	
}