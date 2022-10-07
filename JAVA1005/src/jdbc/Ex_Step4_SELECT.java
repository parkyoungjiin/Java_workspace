package jdbc;

import java.sql.*;

public class Ex_Step4_SELECT {

	public static void main(String[] args) {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java";
		String user = "root";
		String password = "1234";
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 로드 
			Class.forName(driver);
			System.out.println("드라이버 로드 성공!");
			
			// 2. DB 연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공!");
			
			//3. SQL 구문 작성, 전달
			String sql = "SELECT * FROM test";
			pstmt = con.prepareStatement(sql);
			
			//4. SQL 실행, 결과 처리
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
//				int idx = rs.getInt(1); // 첫 번째 컬럼 데이터 int형으로 가져오기
				int idx = rs.getInt("idx");
				System.out.println(idx);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연결 실패");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				con.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}// main 끝

}//클래스 끝
