package t50_Exercise;

import java.util.Scanner;

//배역을 입력했을때 해당 배우의 역할 출력
public class Home_2Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans;
		Home2_Acting acting = new Home2_Acting();
		
		while(true) {
			System.out.println("배역을 골라주세요");
			System.out.println("경찰, 소방관, 요리사, 종료");
			ans=sc.next();
			if(ans.equals("종료")) {
				System.out.println("종료합니다");
				break;
			}
			acting.info(ans);
			switch(ans){
				case "경찰":
					acting.catching(ans);
					acting.searching(ans);
					break;
				case "소방관":
					acting.extinguish(ans);
					acting.rescue(ans);
					break;
				case "요리사":
					acting.pizza(ans);
					acting.spaghetti(ans);
					break;
				default:
					break;
			}
		}
		sc.close();
	}
}
