package this_;

public class home {

	public static void main(String[] args) {

		Year h = new Year(1991,1);
		
		
	}//main 메서드 끝

}// home 클래스 끝


class Year{
	int year;
	int month;
	int day;
	
	public Year() {

		this(1900,1,1);
		
//		year = 1900;
//		month = 1;
//		day = 1; 
// 위의 문장을 생성자 this를 사용하면 중복을 최소화할 수 있다.		
		
		System.out.println("기본 생성자 호출!");
	
	}//기본 생성자
	public Year(int year) {
		
		this(year,1,1);
		
//		this.year = year;
//		month = 1;
//		day = 1;
		
		
	}//int 1개 받는 생성자
	public Year(int year, int month) {
		this(year,month,1);
		
//		this.year = year;
//		this.month = month;
//		day = 1;
		
		
	}//int 2개 받는 생성자
	
	public Year(int year, int month, int day) {
		//마지막은 생성자 this를 사용하면 안된다. 오류발생
		this.year = year;
		this.month = month;
		this.day = day;
		
		
	}//int 3개 받는 생성자
	
}//MyDate 클래스 끝