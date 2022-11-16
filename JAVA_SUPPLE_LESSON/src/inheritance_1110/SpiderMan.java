package inheritance_1110;

// Person 클래스를 상속받는 SpiderMan 클래스 정의
// => SpiderMan is a Person 이므로 SpiderMan 클래스는 Person 클래스를 상속받는다!
//    (A is a B = class A extends B)
// => 서브클래스 정의 시 class 서브클래스명 extends 슈퍼클래스명 {}
// => 단, 생성자 및 private 멤버는 상속되지 않는다!
public class SpiderMan extends Person {
	// SpiderMan 클래스만의 멤버변수 및 메서드 정의(추가) 가능함 - Person 클래스를 확장시킴
	String friend = "네드 리즈";
	
	public void fireWeb() {
		System.out.println("SpiderMan - 거미줄 발사!");
	}
}
