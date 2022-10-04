package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_Step3 {

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
		 * 
		 * 3. PreparedStatement 객체를 통해 SQL 구문 전달, 실행
		 *  - Connection 객체의 preparedStatement() 메서드 호출
		 *     => 파라미터 : 실행할 SQL 구문 문자열
		 *     
		 *  - Connection 객체 연결 성공 시
		 *    java.sql.PreparedStatement 객체 리턴됨.
		 *  
		 *  - PreparedStatement 객체의 executeXXX() 메서드 호출
		 *    1) executeUpdate() : INSERT, UPDATE, DELETE 구문 실행 시 호출(데이터를 조작하는 것은 executeUpdate) 
		 *    	=> 실행 후 적용된 레코드 수가 int 타입으로 리턴됨.
		 *    2) executeQuery() : SELECT 구문 실행 전용 (데이터 조회하는 것은 executeQuery)
		 *      => 실행 후 조회된 테이블이 ResultSet 타입으로 리턴
		 *      
		 */
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java";
		String user = "root";
		String password = "1234";
		
		Connection con = null;
		PreparedStatement psmt = null;
		
		try {
//			1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
//			2. DB 연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공");
//			3. sql 구문전달 및 실행
			String sql = "CREATE TABLE test(idx int)"; // test : 테이블 , idx : 필드, int : 타입
			psmt = con.prepareStatement(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
