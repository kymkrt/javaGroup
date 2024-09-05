package t10_abstract.t2;

import java.util.Scanner;

public class BunsikRun3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bonsa[] bonsa= {new WangjaBunsik(), new SeoulBunsik(),new WoojuBunsik()};
		int choice = 0;
		
		while(true) {
			System.out.println("분식점을 선택하세요");
			System.out.print("1.왕자분식 2.서울분식 3.우주분식 0.종료");
			choice=sc.nextInt();
			
			if(choice <1||choice>3) break;
			
			//음식값 출력 메소드 호출
				bunsik(bonsa[choice-1]);
			}
			System.out.println("작업끝");
			sc.close();
	}
	private static void bunsik(Bonsa bonsa) {
		bonsa.getShopName();
		bonsa.kimchi();
		bonsa.budae();
		bonsa.bibim();
		bonsa.sundae();
		bonsa.konggi();
		System.out.println();
	}
}
			