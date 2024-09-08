package t50_Exercise;

import java.util.Scanner;

public class Home_Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Home_Menu menu = new Home_Menu();
		String ans;
		int tot=0;
		
		while (true) {
			System.out.println("식단을 구성합니다");
			System.out.println("쌀밥과 불고기는 기본메뉴입니다");
			
			System.out.println("두부조림을 추가하시겠습니까?");
			menu.tofu(sc.next());
			System.out.println("미역국을 추가하시겠습니까?");
			menu.seaweed(sc.next());
			System.out.println("요플레를 추가하시겠습니까?");
			menu.yogurt(sc.next());
			System.out.println("바나나를 추가하시겠습니까?");
			menu.banana(sc.next());
			System.out.println("우유를 추가하시겠습니까?");
			menu.milk(sc.next());
			System.out.println("아몬드를 추가하시겠습니까?");
			menu.amond(sc.next());
			menu.total();
			
			System.out.println("다시 하시겠습니까?");
			if(sc.next().equalsIgnoreCase("n")) {
				System.out.println("종료합니다");
				break;
			}else {
				menu.totalReset();
			}
		}
		
		sc.close();
	}
}
