package enum_type;

public class Ex3 {

	public static void main(String[] args) {
		Month now = Month.FEBRUARY;
		System.out.println(now + ", " + now.getMonthKor());

	}

}

enum Month {
	// 생성자를 사용하면 상수에 다른 값을 결합 가능
	JANUARY("1월"), FEBRUARY("2월"); // 영어 달 이름과 한국어 달 이름 결합
	// => The constructor Month(String) is undefined
	
	private Month(String monthKor) {
		this.monthKor = monthKor;
	}
	
	private String monthKor;

	public String getMonthKor() {
		return monthKor;
	}

	public void setMonthKor(String monthKor) {
		this.monthKor = monthKor;
	}
	
}