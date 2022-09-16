package variable_arguments;

public class test {

	public static void main(String[] args) {
		
	numm te = new numm();
	te.print(5,3);
	}//main 메서드 끝

}//test 클래스 끝

class numm{
	
//	public void print() {
//		System.out.println("전달받은 인자가 없음!");
//	}
	public void print(int... num) { // int[] nums ={};
		if(num.length== 0) { // 가변인자로 받으면 배열로 생성되기에 배열의 길이가 0일 경우
			System.out.println("전달받은 인자가 없음!");
		}else { 
			for(int i =0; i < num.length ; i++) {
				System.out.println(num[i]);
			}
		}
	}//print 메서드 끝
	
}//Test 클래스 끝