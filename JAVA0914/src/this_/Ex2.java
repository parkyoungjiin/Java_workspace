package this_;

public class Ex2 {

	public static void main(String[] args) {

		/*
		 * 생성자 this()
		 * - 자신의 생성자 내에서 또 다른 생성자를 호출
		 * - 메서드 안에서 this를 사용하여 생성자 
		 * 자신의 인스턴스에 접근하여 다른 오버로딩 된 생성자를 호출하는 용도로 사용
		 * 생성자 오버로딩 시 인스턴스 변수에 대한 초기화 코드가 중복되는데
		 * 초기화 코드 중복을 제거하는 용도로 사용한다.
		 * 
		 * 
		 */
		
		MyDate d1 = new MyDate();
		System.out.println(d1.year + "/" + d1.month + "/" + d1.day );
		
	}
	

}
class MyDate{
	int year;
	int month;
	int day;
	
	public MyDate() {
		// 연도 : 1990, 월 : 1 , 일  : 1로 초기화
		
//		this(1900, 1);
		// 이 문장을 기본 생성자에 작성하면 밑에 오버로딩된 this 문장 중복을 제거할 수 있다는 의미
		
		//this 사용 시 첫 번째로 와야 한다.
		System.out.println("MyDate 생성자 호출됨.");
		
		year = 1900;
		month = 1;
		day = 1;
		
	}//기본 생성자
	public MyDate(int year) {
		System.out.println("MyDate(int) 생성자 호출됨.");
		this.year = year;
		month = 1;
		day = 1;
		
	
	}
	//연도 (year), 월(month)을 전달받고 나머지는 1일로 초기화
	public MyDate(int year, int month) {
		System.out.println("MyDate(int,int) 생성자 호출됨.");
		this.year = year;
		this.month = month;
		day = 2;
		
		
	}
	public MyDate(int year, int month,int day) {
		System.out.println("MyDate(int, int, int) 생성자 호출됨.");
		this.year = year;
		this.month = month;
		this.day = day;
		
		
	}
}
