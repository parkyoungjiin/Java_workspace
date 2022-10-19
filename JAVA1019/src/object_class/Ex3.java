package object_class;

public class Ex3 {

	public static void main(String[] args) {
		String str = new String ("자바");
		System.out.println(str); //.toString() 이 생략되어 있음 밑의 결과와 동일하다
		System.out.println(str.toString());
		
		A a = new A();
		System.out.println(a);
	}

}
class A{
	
}