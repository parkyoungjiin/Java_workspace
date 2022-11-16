package inheritance_1108;

//Person 클래스 상속 받는 SpiderMan
// a 는 b이다 (is - a 관계 ) : 상속
//	ex ) 스파이더맨은 사람이다 => 즉 사람을 상속받았다.
// 서브클래스 정의  : class 서브클래스명 extends 슈퍼클래스명
public class SpiderMan2 extends Person{
	String friends = "네드 리즈";
	
	public void fireWeb() {
		System.out.println("SpiderMan - 거미줄발사");
	}

	@Override
	public void talk() {
		System.out.println(" 수다 떨어 ~");
	}

	@Override //어노테이션
	public void jump() {
//		super.jump();
		System.out.println("슈퍼점프");
	}

	
}
