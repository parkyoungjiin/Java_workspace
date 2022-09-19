package pack_one;

import pack_two.ExPack; // pack_two 패키지에 있는 ExPack 클래스를 가져옴.
import pack_three.*;


public class Ex {

	public static void main(String[] args) {
		Ex ex = new Ex(); // 클래스명과 동일한 생성자 생성
		
		//만약 서로 다른 패키지의 동일한 클래스가 존재하는 경우 
		//import 문을 통해 포함시키더라도 각 클래스 구분을 위해 
		// 최소 하나의 클래스는 패키지명까지 명시해야 한다.
		// 단, 실제 작성 시 명확한 구분을 위해 둘 다 패키지 명을 명시하는 것이 좋다
		ExPack ex2 = new ExPack(); // pack_two 패키지의 ExPack 클래스이기에 불가능

		ExPack ex3 = new ExPack(); // pack_two 패키지의 ExPack 클래스이기에 불가능
		
		pack_three.ExPack ex4;
		
		
	}

}
