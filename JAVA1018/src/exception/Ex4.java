package exception;

public class Ex4 {

	public static void main(String[] args) {

	}
	public static void printScore(int score) throws Exception{
		if(score < 0 || score > 100) {
			System.out.println(score + "점 : 점수 입력 오류!");
			
			Exception e = new Exception(score + "점 : 점수 입력 오류");
			
			// 위 방법은 e를 한 번 쓰고 버리므로
			// 별도의 변수 없이 바로 객체를 생성하여 예외 발생 가능 = 
			
		}
	}//print 끝
	
	public static void userExceptionMethod(int score) throws InvaildScoreException {
		if(score < 0 || score > 100) {
			throw new InvaildScoreException("점수 입력 오류 -" + score);
		}
	}
	
}

class InvaildScoreException extends Exception{
	
	//생성자를 정의해서 예외 메시지를 슈퍼클래스 생성자에 전달
	public InvaildScoreException(String message) {
		super(message);
	}
}