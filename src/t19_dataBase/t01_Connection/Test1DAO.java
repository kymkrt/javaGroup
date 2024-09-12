package t19_dataBase.t01_Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

//이 객체는 데이터베이스와 연관된 작업을 하는 객체다
//jdbc 커넥터를 이용해야만 접근 가능 
//데이터베이스 연동
//어차피 데이터베이스 관련 객체라 생성하는순간 디비하고 연결시킨다  즉 생성자에 디비연결을 넣는게 좋다 
public class Test1DAO {
	public Test1DAO() {//저 jdbc 클래스를 찾아서 넣어야한다 데이터 베이스 관련
		try {//얘는 무조건 트라이캐치필요함 아래 이건 도메인 반대로 들어감(클래스가) com.회사명. 부서명 같은 방식 D가 대문자=Driver라는 클래스
			//1.JDBC 드라이버(프로젝트당 하나씩 필수) 검색
			Class.forName("com.mysql.jdbc.Driver"); //클래스명을 넣어야 하는데 제작사에서 제공하는 클래스명이 있다 db프로퍼티에 있음
			System.out.println("드라이버검색성공");
			
			//2. DB서버에 연결(연동)후 데이터베이스 사용준비 작업 url주고 계정명 비빌번호가 필요함=인증 이 3가지가 있어야 db접속 가능
			String url="jdbc:mysql://localhost:3306/javagroup";//들어가는이름:프로토콜(우린mysql로 통신한다)://주소?:포트번호/데이터베이스이름
			String user = "root";
			String password = "1234";
			//외부에 접속하는애라 예외처리 필요 서라운딩=멀티 익셉션
			DriverManager.getConnection(url, user, password);
			//서버에 들어오면 로그가 나옴 시간도 나옴 
			System.out.println("데이터베이스연결성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색이 실패 "+e.getMessage());
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패 "+e.getMessage());
		}		
	}
	
	
}
