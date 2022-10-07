package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_step4_DELETE {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java";
		String user = "root";
		String password = "1234";
		
		Connection con = null; // db연결
		PreparedStatement pstmt = null; //sql 구문 실행
		try {
			//1. 드라이버
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
			// 2. db연결
			con = DriverManager.getConnection(url, user, password); // con 인스턴스 생성
			System.out.println("DB 연결 성공");
			// 3. sql 구문 작성, 전달
			int idx = 10;
			
			String sql = "DELETE FROM test WHERE idx = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  idx);
			// 4. sql 구문 실행 및 결과 처리
			
			int result = pstmt.executeUpdate();
			if(result > 0 ) {
				System.out.println("DELETE 작업 성공 - " + result + "개 레코드");
			}else {
				System.out.println("DELETE 작업 실패 - " + result +"개 레코드");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); 
			System.out.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB 연결 실패");
		} finally { 
			try {
				pstmt.close();
				con.close(); 
			} catch (SQLException e) { 
		
				e.printStackTrace();
		}
	}

	}

}
