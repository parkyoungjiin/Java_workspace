package final_;

public class Ex {

	public static void main(String[] args) {

		/*
		 * final 키워드
		 * - 대상의 변경이 불가능하도록(변경의 최종) 지정
		 * - 이 변수는 수정할 수 없다는 의미를 가진다.
		 * 1. 변수에 final이 붙을 경우
		 * = > 변수 값 변경이 불가능 = 저장되어 있는 값만 사용이 가능하다
		 *     = 상수로 취급된다.
		 *     
		 * = > 일반 변수와 구별하기 위해 이름을 보통 대문자 사용하며,
		 *     단어와 단어 사이의 구분은 언더스코어(_)를 사용한다.
		 *     ex ) MAX_NUM
		 * = > ***반드시 초기화 필수***
		 *     단, 초기화를 수행하지 않은 상수를 blank final 상수라고 하며
		 *     생성자를 통해 초기화하면 사용이 가능함.
		 *     = > 목적 : 객체마다 다른 상수 값을 갖기 위함.
		 * 
		 * 2. 메서드에 final이 붙을 경우
		 * = > 메서드 변경 불가 (= 오버라이딩 금지)
		 * 
		 * 
		 * 3. 클래스에 final이 붙을 경우
		 * = > 상속을 못한다.
		 * 
		 */
		
		
		//final 변수의 대표적인 예 : Math 클래스 PI 상수
		System.out.println("PI 값 : " + Math.PI);//math. 했을 때 s가 있는 것은 Static을 의미. 또한 기울어져있는 것도 static 변수를 의미.
		
		//final 클래스는 상속은 불가능하지만 사용은 가능하다
		String str = new String();
	}//main 끝

}//Ex 끝

// 1. 변수에 final 키워드를 사용할 경우
class FinalMember {
	final int finalMember = 10;
	//final int finalMember; -> The blank final field finalMember may not have been initialized 에러 발생
	// => 변수 앞에 final이 붙으면 final 상수는 반드시 초기화 필수로 되어야 한다.
	
	
	//만약, final 상수를 초기화하지 않을 경우
	final int blankFinalMember; // FinalMember라는 생성자 생성해야 함.
	// 단, 생성자를 통해 초기화 하는 경우 사용 가능하다
	
	public FinalMember(int blankFinalMember) {
		super();
		this.blankFinalMember = blankFinalMember;
	}
	
	public void change() {
		finalMember = 99; // final 키워드가 붙은 변수(=상수)는 값 변경이 불가능하다.
		// = > 기존값 변경은 불가능하지만 사용은 가능하다.
		
		System.out.println("finalMember = " + finalMember);
		
		final int finalLocalVar = 20; //로컬변수 선언
//		finalLocalVar = 30; // 값 변경 불가, setter도 불가능 (get은 가능)
		
		
	}//change 메서드 끝
	
	
	
	
}// FinalMember 끝


// 2. 메서드에 final 키워드 사용

class FinalMethod {
	public final void FinalMethod() {//public, void 사이에 final을 넣으면 오버라이딩이 불가능
		System.out.println("슈퍼클래스의 finalMethod()");
		
	}
	
	public void normalMethod() {
		System.out.println("슈퍼클래스의 nomalMethod");
	}
	
	
}

class subFinalMethod extends FinalMethod {
	@Override
	public void FinalMethod() {
		System.out.println("서브클래스에서 오버라이딩 된 finalMethod()");
		
		//일반 메서드는 오버라이딩 가능함
		
	}


}
final class FinalClass{ //Final 클래스 = 상속불가
	int num = 10;
	
	public void method() {
		System.out.println("슈퍼클래스의 method()");
	}
}

//class SubFinalClass extends FinalClass{
	//The type SubFinalClass cannot subclass the final class FinalClass => FianlClass를 상속받을 수 없음
//}

class SubFinalClass {
	//FinalClass 는 상속관계로 불가능하지만 포함관계 형태로 인스턴스 생성하여 사용은 가능하다.
	
	FinalClass fc = new FinalClass();
	
	
}