package jdbc;

public class Ex_Step1 {

	public static void main(String[] args) {
		/*
		 * JDBC(Java Database Connectivity)
		 * - 자바에서 DB에 접근하기 위한 연결 방식을 제공하는 API(라이브러리)
		 * - 데이터베이스 접근 방식 외의 모든 작업은 통일된 방법으로 제공하고
		 *   각 DB 제조사에서 제공하는 드라이버를 로드하여 설정함.
		 *   => DB 제조사마다 드라이버가 다르므로 각각 다운로드 필요
		 *   
		 *   ex ) MYSQL -> mysql-connector-java.버전.jar 파일
		 *   ex ) Oracle -> ojdbcX.jar 파일
		 *   
		 *   <JDBC를 활용한 DB구현 프로그램 구현 4단계>
		 *   1. JDBC 드라이버 로드(드라이버 필요)
		 *    - java.lang.class 클래스의 static 메서드 forName() 메서드 호출
		 *       => 파라미터 : 해당 DB의 드라이버 클래스 파일명을 문자열로 전달 (패키지명.클래스명 형태로 지정 필요)
		 *    - 단, 미리 해당 드라이버가 포함된 jar 파일이 추가되어 있어야 함.
		 *    - 드라이버 클래스 위치가 잘못 지정되었거나 클래스 파일이 없을 경우
		 * 	
		 *   2. DB 연결(URL, 계정명, 패스워드 필요)
		 *   
		 *   3. PreparedStatment 객체를 통해 SQL 구문 전달 및 실행
		 *   
		 *   4. SQL 구문 실행 후 결과 처리
		 *   
		 */
		
		/*
		 * 1. 드라이브 로드
		 *   ex ) MYSQL -> mysql-connector-java.버전.jar 파일 sodml
		 *   com.mysql.
		 */
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 이 문장을 실행했을 때 오류가 발생하지 않으면 catch가 실행되지 않는다. 
			// 만약 오류 발생 시 ClassNotFoundException 관련된 오류라면 e.printStackTrace()가 실행된다.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		// => Unhandled exception type ClassNotFoundException 
	}

}
