package interface_;

public class Ex4 {

	public static void main(String[] args) {
		Ex4 ex = new Ex4(); //noRelationship을 호출하기 위해서 생성함.
		ex.noRelationship();
		ex.hasRealtionShip();
		
		//메서드를 static으로 정의할 경우 ex를 제외하고 가능.
	}
	public void noRelationship() {
//		NoteBookPc notebook = new NoteBookPc();
//		notebook.charge();
//		SmartPhone smartPhone = new SmartPhone();
//		smartPhone.charge();
		//2개의 인스턴스를 나의 배열로 관리
		Object[] objArr = {new NoteBookPc(), new SmartPhone()}; //object 클래스를 통해 objArr이라는 인스턴스 생성
		
		for (int i = 0 ; i <objArr.length; i++) {
			 //object에서 charge 메서드를 사용할 수 없다. (자식에서 직접 생성한 메서드는 할아버지 클래스에서 호출할 수 없다. )
			//instanceof 연산자를 사용하여 NoteBookPc와 SmartPhone 타입을 판별
			if(objArr[i] instanceof NoteBookPc) {
				//Object에서 Notebook으로 다운캐스팅 후 charge() 호출
				NoteBookPc notebook = (NoteBookPc)objArr[i];
				notebook.charge();
			}else if(objArr[i] instanceof SmartPhone) {
				SmartPhone smartPhone = (SmartPhone)objArr[i];
				smartPhone.charge();
				
			}
		}
	}
	
	public void hasRealtionShip() {
		Chargeable c = new NoteBookPc2(); // Note - >charge
		Chargeable c2 = new SmartPhone2();// Smart -> charge
		
		Chargeable[] chargeableArr = {new NoteBookPc2(), new SmartPhone2()};
		for (int i = 0 ; i <chargeableArr.length; i++) {
			chargeableArr[i].charge();
			
		}
	}
}//Ex4 클래스 끝
//3. 서로 상속관계가 없는 클래스 간에 인터페이스를 통한 상속관계를 부여

interface Chargeable{
	public abstract void charge();
}

class NoteBookPc2 extends Pc implements Chargeable{
	public void charge() {
		System.out.println("노트북 충전 중");
	}
}
class SmartPhone2 extends Pc implements Chargeable{
	public void charge() {
		System.out.println("스마트폰 충전 중");
	}
}

//==================================
// 노트북은 pc 상속, 스마트폰은 핸드폰을 상속받고 
// pc 와 handPhone은 Object의 상속을 받는다
class Pc{}

class NoteBookPc extends Pc{
	public void charge() {
		System.out.println("노트북 충전 중 !");
	}
}

class HandPhone{}

class SmartPhone extends HandPhone {
	public void charge() {
		System.out.println("스마트폰 충전 중");
	}
	
	
}