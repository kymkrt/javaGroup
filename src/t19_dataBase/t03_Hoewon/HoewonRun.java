package t19_dataBase.t03_Hoewon;

import java.util.Scanner;

public class HoewonRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HoewonDAO dao =new HoewonDAO(); //싱글톤 비슷한 효과 미리 다른 클래스가 쓸수 있게 메인에 만들고 다른 클래스에 인자로줌
		HoewonService service = new HoewonService();
		
		boolean run = true;
		String name = "";
		
		while(run) {
			System.out.print("\n1.회원등록 2.전체조회 3.개별조회 4.수정 5.삭제 6.종료 ==> ");
			int choice =scanner.nextInt();
			
			switch (choice) {
				case 1:
					service.setInput(dao); //회원자료 등록 /같은 dao객체를 넣어줌
					break;
					
				case 2:
					service.getList(dao); //회원자료 전체조회
					break;
				case 3:
					System.out.print("검색할 회원 성명을 입력하세요");
					name=scanner.next();
					service.getSearch(dao,name); //회원자료 개별조회
					break;
				case 4:
					System.out.print("수정할 회원 성명을 입력하세요");
					name=scanner.next();
					service.setUpdate(dao,name); //회원자료 수정
					break;
				case 5:
					System.out.print("삭제할 회원 성명을 입력하세요");
					name=scanner.next();
					service.setDelete(dao, name); //회원자료 삭제
					break;
				default:
					run=false;
			}
		
		}
		
		System.out.println("작업끝");
		dao.connClose(); //여기서 끝내는걸 넣어서 한번만 접속해제할수 있게함
		scanner.close();
	}
}
