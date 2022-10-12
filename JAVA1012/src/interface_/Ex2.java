package interface_;

public class Ex2 {

	public static void main(String[] args) {
		 고래상어 고래상어 = new 고래상어();
		 고래상어.번식();
		 
	     동물 동물 = new 고래상어();
	     동물.번식();
	}

}
//고래, 상어 특징을 추상화하여 동물 인터페이스로 정의
interface 동물 {
	public abstract void 번식();
}
interface 헤엄칠수있는{}

// 동물 인터페이스, 헤엄칠 수 있는 인터페이스를 상속받는 서브인터페이스 고래, 상어 정의
// => 인터페이스끼리 상속은 implements가 아닌 extends 사용, 다중 상속도 지원

interface 고래 extends 동물, 헤엄칠수있는 {}
interface 상어 extends 동물, 헤엄칠수있는 {}

//고래와 상어 인터페이스를 동시에 상속받아 구현하는 서브클래스 고래상어 정의
// => 인터페이스가 가진 추상메서드를 오버라이딩하여 구현해야 한다.
// => 또한, 복수개의 인터페이스를 상속받을 수 있다.

class 고래상어 implements 고래, 상어 {

	@Override
	public void 번식() {
		 System.out.println("알을 낳아 번식");
	}
	
}
abstract class 동물2 {
	
	public abstract void  번식();
}

class 고래2 extends 동물2{

	@Override
	public void 번식() {
		System.out.println(" 새끼를 낳아 번식");
	}
}
class 고래3 extends 동물2{
	
	@Override
	public void 번식() {
		System.out.println(" 새끼를 낳아 번식");
	}
}
