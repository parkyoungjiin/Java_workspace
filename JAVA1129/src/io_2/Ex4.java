package io_2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 객체 직렬화(Serialization) & 역직렬화(Deserialization)
		 * - 자바에서 사용하는 객체는 상태(변수 값)가 계속 변하는 영속성을 부여함.
		 *   이때 어떤 순간의 상태(변수 값)를 파일 또는 네트워크 등으로 내보내는 것을 
		 *   직렬화라고 함.
		 *   반대로 파일이나 네트워크로부터 데이터를 읽어 객체로 변환하는 것을 
		 *   역질렬화라고 함.
		 * - 직렬화란 인스턴스 내용을 연속 스트림으로 만드는 것이고, 스트림을 
		 *   만들어야 파일에 쓸 수 있고, 네트워크도 전송할 수 있음
		 * - ObjectInputStream, ObjectOutputStream 클래스 사용
		 * - 주의! 직렬화 대상이 되는 클래스를 정의할 때는
		 *   반드시 Sriealizable 인터페이스 상속 필수!
		 * - 만약, 직렬화 클래스 내에서 출력 대상으로 제외시킬 변수가 있을 경우
		 *   해당 변수 선언부 앞에 transit 키워드를 사용하면 출력대상에서 제외됨
		 *   
		 * < 직렬화 문법 >
		 * ObjectInputStream(InputStream in)
		 * 
		 * <역직렬화 문법>
		 * ObjectOutputStream(OutputStream out)
		 * 	 * 
		 */
		
		// Person 객체 생성
		Person p = new Person("홍길동", 32, "911010-1234567");
		Person p2 = new Person("이순신", 44, "791010-1234567");
		
		// File 경로를 위한 File 객체 생성
		File f = new File("c:\\temp\\Prerson.txt");
		
		// Person 객체를 외부 파일로 출력하기(= 직렬화, Serialization)
		// => ObjectOutputStream 객체를 생성하여 FileOutputStream 객체 연결
//		ObjectOutputStream oss;
		
		try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(f))) {
			oss.writeObject(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("객체 출력 완료!");
		

	}

}

// 직렬화를 위한 Person 클래스 정의
// => 주의! 직렬화 대상이되는 클래스를 정의할 때 
//    반드시 Serializable 인터페이스 상속(구현) 필수
//    별도의 추상메서드가 없는 단순한 마커(Marker) 용도의 인터페이스
class Person implements Serializable {
	String name;
	int age;
	String jumin;
	
	public Person(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	@Override
	public String toString() {
		return "Person [name = " + name + ", age = " + age + ", jumin = " + "]";
	}
	
		
	
}









