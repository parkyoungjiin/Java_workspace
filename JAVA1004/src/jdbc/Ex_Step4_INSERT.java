package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_Step4_INSERT {

	public static void main(String[] args) {
		int idx = 10;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java";
		String user = "root";
		String password = "1234";
		
		Connection con = null; // db연결
		PreparedStatement pstmt = null; //sql 구문 실행
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
			
			con = DriverManager.getConnection(url, user, password); // con 인스턴스 생성
			System.out.println("DB 연결 성공");
			
			// 3. SQL 구문 전달 및 실행
//			String sql = "INSERT INTO test VALUES(" + idx + ")"; //"10" 을 값에 넣은 것
			// ***주의***
			// 값을 바로 넣을 수 있지만, 값 대신 SQL 구문으로 대체될 수 있다.
			// idx 부분을 입력받는 형태라면 정수값이 아닌, 다른 것으로 대체할 수 있다.
			// 따라서, 만능문자(=wildcard = ? ) 처리를 하여 우선 객체를 생성하고
			// setXXX메서드를 통해 데이터를 바인딩 처리해주는 것이 좋다.
			
//			String sql = "INSERT INTO test VALUES(?)";
//			pstmt = con.prepareStatement(sql);
//			// setXXX메서드를 통해 데이터를 바인딩 처리
//			pstmt.setInt(1, idx);//앞 파라미터는 ?의 순서 (1이면 첫번째꺼), 해석하면 첫 번째 ?에 idx값을 넣는다.
			
//			pstmt.executeUpdate();
			String sql = "INSERT INTO student VALUES(?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 1); //indx
			pstmt.setInt(2, 1); //id
			pstmt.setString(3, "Park"); //name
			
			
			//4. sql 구문 실행 및 결과 처리
			
			// 경우 1번 => UPDATE, DELETE 구문의 경우 WHERE 절 사용 시 영향을 받은 레코드 수 리턴됨
			// 단, 일치하는 레코드가 없을 경우 수정 또는 삭제 되지 않아 0이 리턴된다.
			
			// 경우 2번 => INSERT 구문의 경우 성공하면 1, 실패 시 예외가 발생한다.
			
			int result = pstmt.executeUpdate(); // 실행 결과를 result에 저장
			// => 실행결과리턴(INSERT 된 레코드 수)
			
			if(result > 0) {
				System.out.println("INSERT 작업 성공 : " + result + "개 레코드" );
			}else {
				System.out.println("INSERT 작업 실패 !");
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
	}//main 끝

}// 클래스 끝
