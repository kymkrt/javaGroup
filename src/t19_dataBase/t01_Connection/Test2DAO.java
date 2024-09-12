package t19_dataBase.t01_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test2DAO {
	Connection conn=null;//비워놔도됨 커넥션 인터페이스 가져올때 같은 이름인데도 출처가 다른게 있다 mysql말고 sql로 해야함
	
	public Test2DAO() {
		try {
			//클래스 찾는 클래스 jdbc 드라이버
			Class.forName("com.mysql.jdbc.Driver");//3306은 mysql포트번호
			String url = "jdbc:mysql://localhost:3306/javagroup";
			String user = "atom";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색실패"+e.getMessage());
			
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동/연결실패 "+e.getMessage());
		}
		
	}
	//DB연결 종료
	public void dbClose() {
		try {
			if(conn!=null) conn.close();
		} catch (SQLException e) {}
		
		
	}
}