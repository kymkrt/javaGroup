package t19_dataBase.t01_Connection;

public class Test2Run {
	public static void main(String[] args) {
		//사용자가 사용하기 위한것들 뷰 같은것
		Test2DAO dao =new Test2DAO();
		
		Test2Service service = new Test2Service();
		
		service.getDBprocessMethod();
		
		dao.dbClose();
		
		System.out.println("작업끝");
		
		
	}
}
