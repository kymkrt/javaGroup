package t19_dataBase.t02_DbTest;

public class TestRun {
	public static void main(String[] args) {
		TestDAO dao = new TestDAO();
		
		dao.getList();//test테이블의 전체 자료 조회 이름상관없음
		
		
		dao.dbClose();
		System.out.println();
		System.out.println("작업끝");
	}
}
