package t10_abstract.t2;

import java.util.Scanner;

public class BunsikRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		while(true) {
			System.out.println("분식점을 선택하세요");
			System.out.print("1.왕자분식 2.서울분식 3.우주분식 0.종료");
			choice=sc.nextInt();
			
			if(choice <1||choice>3) {
				break;
			}
			switch (choice) {
				case 1:
					WangjaBunsik wangjaBunsik = new WangjaBunsik();
					wangjaBunsik.getShopName();
					wangjaBunsik.kimchi();
					wangjaBunsik.budae();
					wangjaBunsik.bibim();
					wangjaBunsik.sundae();
					wangjaBunsik.konggi();
					break;
				case 2:
					SeoulBunsik seoulBunsik = new SeoulBunsik();
					seoulBunsik.getShopName();
					seoulBunsik.kimchi();
					seoulBunsik.budae();
					seoulBunsik.bibim();
					seoulBunsik.sundae();
					seoulBunsik.konggi();
					break;
				case 3:
					WoojuBunsik woojuBunsik = new WoojuBunsik();
					woojuBunsik.getShopName();
					woojuBunsik.kimchi();
					woojuBunsik.budae();
					woojuBunsik.bibim();
					woojuBunsik.sundae();
					woojuBunsik.konggi();
					break;
			}
			System.out.println();
		}
		System.out.println("작업끝");
		sc.close();
	}
}
