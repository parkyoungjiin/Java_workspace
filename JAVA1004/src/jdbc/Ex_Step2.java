package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_Step2 {

	public static void main(String[] args) {
		/*
		 * JDBC를 활용한 DB 구현 4단계
		 * 1. JDBC 드라이버 로드(드라이버 필요)
		 *  - java.lang.Class 클래스의 Static 메서드 forName()메서드 호출
		 *     => 파라미터 : 해당 db의 드라이버 클래스 =
		 *     
		 * 2. DB연결(URL, 계정명, 패스워드 필요)
		 *  - java.sql.DriverManager 클래스의 static 메서드인 getConnection() 메서드 호출
		 *    => 파라미터 : 해당 DB접속 URL, 계정명, 패스워드 전달
		 *    => URL 형식 : MySql 기준으로 "jdbc:mysql://DB접속주소:포트번호/DB명"
		 *  - 연결 성공 시 java.sql.connection 타입 객체 리턴됨 (con)
		 * ------------------------------------------------------------------------------------- 
		 * 
		 */
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java";
		String user = "root";
		String password = "1234";
		
		Connection con = null; // 밖에다 선언하여 try, catch, finally 모두 초기화하여 사용이 가능하게 함.
		PreparedStatement pstmt = null;
		
		try {
//			1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
			
//			2. DB 연결
//			=> java.sql.DriverManager 클래스의 getConnection() 메서드 호출
//			=> MySQL 데이터베이스가 현재 PC에 설치되어 있으므로
//			접속 주소를 localhost로 지정하고 기본 포트번호 3306 지정
			
			
			con = DriverManager.getConnection(url, user, password); // con 인스턴스 생성
			System.out.println("DB 연결 성공");
			
			// 3. SQL 구문 전달 및 실행
			String sql = "CREATE TABLE test(idx int)"; // 실행할 SQL 구문 작성 (test라는 테이블을 생성하는 sql 객체)
//			String sql = "DROP TABLE student"; 
//			String sql = "CREATE TABLE student(indx INT ,id INT, name VARCHAR(16))" ;
			pstmt = con.prepareStatement(sql); //prepareStatemnet 타입 sql 객체를 pstmt라는 변수에 저장
			
			// => PreparedStatement 객체의 executeUpdate() 메서드를 호출하여
			//    전달된 SQL 구문을 실행
			pstmt.executeUpdate();
			System.out.println("SQL 구문 실행 성공");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 에러의 발생 근원지를 찾아서 단계별로 에러를 출력한다.
			System.out.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB 연결 실패");
		} finally { //try잘 수행하면 catch는 수행되지 않는데, final은 제대로 실행이 되더라도 final부분은 무조건 실행된다.
			// finally 블록 내에서 DB 관련 자원 반환 필수
			try {
				pstmt.close();
				con.close(); //Connection 객체 반환 (con 인스턴스 삭제)
			} catch (SQLException e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}

	}
}
