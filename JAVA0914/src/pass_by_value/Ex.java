package pass_by_value;

public class Ex {

	public static void main(String[] args) {

	/*
	 * 메서드 호출 시 값 전달 방식에 따른 차이
	 * 기본 데이터 타입 vs 참조 데이터 타입 (차이점)
	 * 1. Pass by value(값에 의한 전달) - 복사본
	 * 
	 * 2. Pass by Reference(참조에 의한 전달) - 원본의 주소값을 전달
	 * 
	 * - 호출 시 참조 데이터타입 데이터를 전달하는 경우
	 * - 호출 된 메서드 내에서 전달받은 값(복사한 주소값)을 접근하여
	 * 해당 주소에 있는 데이터 값 변경 시 -> 원본에 영향을 준다.
	 * 기본데이터타입 - > 값 전달
	 * 기본데이터 타입외, 매개변수 설정 시 -> 참조 데이터 타입 (주소값이 전달된다.)
	 * 
	 */
		
	Money m = new Money();
	PassByTest pbt = new PassByTest();
	
	System.out.println("changePrimitiveType()메서드 호출 전 money = " + m.money);
	
	pbt.changePrimitiveType(m.money); //참조주소를 바꾼다했을 때 
	
	System.out.println("changePrimitiveType()메서드 호출 후 money = " + m.money);
	// 값 전달 방식(파라미터)를 통해 전달받았을 때 그 함수 내에서는 
	// 전달받은 데이터를 변경하더라도 원본 데이터에는 아무런 영향이 없다. (m.money는 그대로 10000원이 그대로 존재함.)
	
	System.out.println("=====================================================");
	
	System.out.println("changeReferenceType() 메서드의 호출 전 money = " + m.money);
	
	pbt.changeReferenceType(m); // Money 인스턴스의 주소 복사됨.
	
	System.out.println("changeReferenceType() 메서드의 호출 후 money = " + m.money);
	
	
	
	
	
	}//main 메서드 끝

}//Ex 클래스 


class PassByTest{
	public void changePrimitiveType(int money) {//파라미터 값을 받는다. (실제값을 복사, 10000)
		money -= 5000;
		System.out.println("changePrimitiveType() 메서드의 money = " + money);
		
		
	}//메서드 끝
	
	
	public void changeReferenceType(Money m) { //Money 클래스에 있는 m이라는 인스턴스 생성하여 접근.
		// 참조 데이터타입 데이터를 전달받음.
		// 전달 받은 주소값에 해당하는 인스턴스에 접근하여 인스턴스 내의 멤버변수(실제 값)을 변경
		m.money -= 5000;
		System.out.println("changeReferenceType()메서드의 money = " + m.money);
	}
}//PassByTest 클래스 끝

class Money{
	int money = 10000; //money라는 멤버변수
	
}//Money 클래스 끝
