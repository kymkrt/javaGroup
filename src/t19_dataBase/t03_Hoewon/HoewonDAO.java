package t19_dataBase.t03_Hoewon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;

public class HoewonDAO {
	//여기서만 쓰니까 프라이베이트
	private Connection conn = null;
//	Statement stmt = null; //다른 메소드에서도 쓰기위해
	private PreparedStatement pstmt=null;
	private ResultSet rs = null;
	
	HoewonVO vo = null;
	String sql = "";//전역변수 데이터베이스 명령어?
	
	public HoewonDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/javagroup";
			String user="root";
			String password="1234";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색실패 "+e.getMessage());
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동실패 "+e.getMessage());
		}
		
		
	}
	//conn닫기
	public void connClose() {
		try {
			if(conn!=null) conn.close();
		} catch (SQLException e) {
			System.out.println("sql 오류 "+e.getMessage());
		}
	}
	
	//pstms 닫기
	public void pstmtClose() {
		try {
			if(pstmt!=null) pstmt.close();
		} catch (SQLException e) {
			System.out.println("sql 오류 "+e.getMessage());
		}
	}
	//rs 닫기 리설트셋 가비지컬렉터가 언제닫는지 몰라서 우리가 닫아야 함 위에것들 포함
	//rs객체는 pstmt객체가 생성 즉 rs(셀렉트에만 사용)를 닫는다 pstmt(crud에 사용)를 사용하지 않는다 역은 아님
	//리설트셋을 사용=프리페어스태이트먼트사용? 노션에 있음
	public void rsClose() {
		try {
			if(rs!=null) rs.close();
		} catch (SQLException e) {
			System.out.println("sql 오류 "+e.getMessage());
		}finally {
			pstmtClose();
		}
	}
	
	//회원자료 등록
	public int setInput(HoewonVO vo) {//
		int res =0;
		/* Statement 객체 사용시
		//이 아래가 스테이트 먼트 객체 요즘은 잘 안씀
		//스태이트먼트는 넘어온값을 그대로 넣음
		try {//idx는오토인크리스먼트라 default 넘어온값은 VO라서 거기값을 넣어야함
			sql = "insert into hoewon values (default,'"+vo.getName()+"',"+vo.getAge()+","
					+ "'"+vo.getGender()+"','"+vo.getJoinday()+"','"+vo.getAddress()+"')"; //왜 밸류?
			//커넥션 객체에의해 스태이트먼트 생성
			stmt = conn.createStatement(); //생성
			res=stmt.executeUpdate(sql); //실행하는명령 //한번실행하면 1이나옴 실행안되면0  10번실행되면 리턴값10
		} catch (SQLException e) {//데이터베이스는''라서 따로 넣어야함 숫자는 ''필요없음
			System.out.println("sql 오류 "+e.getMessage());
		}
		*/
		
		//프리페어스테이트먼츠는 값을 노출시키지 않는다 몇개올지 모르니까 물음표사용함
		try {
			
			sql = "insert into hoewon values (default,?,?,?,?,?)";//에러나면 값이 아니라 ?가 찍힘 
			//이것도 커넥션객체가 생성
			pstmt = conn.prepareStatement(sql); //객체 생성시 sql이 들어감 값은 생성하고 넣어줌 ?위치에 데이터베이스는 첫번째가 1임 주의 타입으로 넣는다
			pstmt.setString(1, vo.getName()); //파라미터=위치 단물음표만 본다 물음표갯수가 기준
			pstmt.setInt(2, vo.getAge()); //타입 미리 알고 정해줘야함
			pstmt.setString(3, vo.getGender());
			pstmt.setString(4, vo.getJoinday());
			pstmt.setString(5, vo.getAddress());
			//얘도 한번실핼하면 리턴값 1 아니면 0 여러번 하면 그만큼
			res=pstmt.executeUpdate(); //마지막에 sql 안넣음 
			
		} catch (SQLException e) {
			// TODO: handle exception
		}finally {
			pstmtClose();//이거만 닫음 rs안닫음
		}
		
		return res;
	}
	//전체 회원검색
	public ArrayList<HoewonVO> getList() { //리턴타입을 어레이리스트
		ArrayList<HoewonVO> vos = new ArrayList<HoewonVO>();
		try {
			sql = "select * from hoewon order by name";
			pstmt = conn.prepareStatement(sql);
			//? 없어서 그냥 해도 됨
//			rs=pstmt.executeQuery();//셀렉트라 쿼리
			rs=pstmt.executeQuery(); //rs pstmt 만써도 자동으로 쿼리 나옴 이렇게 가져온게 데이터베이스 레코드
			//빼서 vo에 담고 다시 vos에 담는것
			
			while(rs.next()) {//이걸 추가해줘야 아래 한칸 내려감
				vo = new HoewonVO();//이게 바깥에 있으면 얕은복사가 됨 새로만들어야 새로새로 들어감
				//이렇게 하면 안됨 앞에 BOF가 있기 때문
				//vo를 만들어서 하나씩
				vo.setIdx(rs.getInt("idx")); //데이터 베이스(rs) IDX를 vo에 넣는것
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setGender(rs.getString("gender"));
				vo.setJoinday(rs.getString("joinday"));
				vo.setAddress(rs.getString("address"));
				System.out.println(vo);
				vos.add(vo);//한덩어리 작업
				//이걸 반복해야 하는데 몇개있는지 모르므로 while
			}
		} catch (SQLException e) {
			System.out.println("sql 오류: "+e.getMessage());
		}finally {
			rsClose();
		}
		return vos;
	}
	//개별자료 검색
	public HoewonVO getSearch(String name) {//검색 =select=쿼리 리설트셋=rs클로즈=pstmt클로즈 셀렉트나오면 무조건 rs
		HoewonVO vo = new HoewonVO();
		try {//와일안써도 됨 없거나 있거나 =if
			sql = "select * from hoewon where name = ?";//pstmt라서 물음표 스테이트먼트면 직업써야함
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);//물음표 1개 1번
			rs=pstmt.executeQuery();
			
			if(rs.next()) {//bof 때문에 next 필요 찾으면 자료있음 =true
				vo.setIdx(rs.getInt("idx")); //데이터 베이스(rs) IDX를 vo에 넣는것
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setGender(rs.getString("gender"));
				vo.setJoinday(rs.getString("joinday"));
				vo.setAddress(rs.getString("address"));
			}
		} catch (SQLException e) {
			System.out.println("sql 오류: "+e.getMessage());
		}finally {
			rsClose();
		} 
		return vo; //없으면 null
	}
	//삭제처리
	//위에 패턴들하고 비교해보면 똑같다
	public int setDelete(String name) {
		int res = 0;
		try {//pstmt 값을 몰라서 ? 들어감
			sql="delete from hoewon where name=?";
			//커넥션에 의해 pstmt 생성
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);//name이 문자라 셋 스트링 물음표가 하나라 1번 
			res = pstmt.executeUpdate(); //실행하는코드 0 1 같은 수를 반환한다 편하게 앞에 res 붙여줌 셀렉트가 아니라 업데이트
		} catch (SQLException e) {
			System.out.println("sql 오류: "+e.getMessage());
		}finally {
			pstmtClose();//왜 점이 없지??
		} 
		return res;
	}
	//자료 업데이트 수정
	public int setUpdate(int idx, int choice, String content) {
		int res =0;
		try {
			if(choice==1)	sql="update hoewon set name =? where idx = ?";
			else if(choice==2)	sql="update hoewon set age =? where idx = ?";
			else if(choice==3)	sql="update hoewon set gender =? where idx = ?";
			else if(choice==4)	sql="update hoewon set joinday =? where idx = ?";
			else sql="update hoewon set address =? where idx = ?";
			pstmt = conn.prepareStatement(sql);
			
			if(choice==2) pstmt.setInt(1, Integer.parseInt(content));// 변경해줌
			else pstmt.setString(1, content);//나이 아니면 그냥 string 값
			
			pstmt.setInt(2, idx);
			res=pstmt.executeUpdate();
			//이러면 나이에서 오류남 나이는 인트기때문
		} catch (SQLException e) {
			System.out.println("sql 오류: "+e.getMessage());
		}finally {
			pstmtClose();//왜 점이 없지?? //업데이트임 셀렉트 아니라 pstmClose
		} 
		
		return res;
	}
}