package t19_dataBase.t02_DbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDAO {
	Connection conn=null;//비워놔도됨 커넥션 인터페이스 가져올때 같은 이름인데도 출처가 다른게 있다 mysql말고 sql로 해야함
	String sql="";
	public TestDAO() {
		try {
			//클래스 찾는 클래스 jdbc 드라이버
			Class.forName("com.mysql.jdbc.Driver");//3306은 mysql포트번호
			String url = "jdbc:mysql://localhost:3306/javagroup";
			String user = "root";
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
	//test테이블의 전체자료 조회 원래는 출력을 서비스에서 해야함
	public void getList() {
		try {//무조건 sql로 mysql쓰면 안됨
			//DB 검색 연결은 커넥션 사용 
			Statement stmt = conn.createStatement();
			sql = "select*from test"; //입력순서로 가져옴 idx순서
			ResultSet rs=stmt.executeQuery(sql);//검색할때 사용하는 /result set 저기서 레코드 하나 받아오는 객체
			//자료가 rs에 있음 
			//출력
			System.out.println("=============================");
			System.out.println("번호\t성명\t나이\t성별\t주소");
			System.out.println("=============================");
			while(rs.next()) {//자료있으면 참 없으면 거짓
				System.out.print(rs.getInt("idx")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getInt("age")+"\t");
				System.out.print(rs.getString("gender")+"\t");
				System.out.print(rs.getString("address")+"\n");
			}
			System.out.println("=============================");
		} catch (SQLException e) {
			System.out.println("sql 오류: "+e.getMessage());
		}
	}
}