package t50_Exercise;

import java.util.Scanner;

public class T1_MachineRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no, price;
		boolean check;
		String yn;
		
		T1_Machine machine = new T1_Machine();
		
		while(true) {
			System.out.print("\n구매할 음료번호를 입력하세요? ");
			no = sc.nextInt();
			System.out.print("금액을 투입하세요? ");
			price = sc.nextInt();
			
			while(true) {
				check = machine.priceCheck(no, price);
				if(!check) {
					System.out.print("금액이 부족합니다. 추가 입력해주세요? ");
					price += sc.nextInt();
				}
				else break;
			}
			
			machine.calculator(no, price);
			
			System.out.print("또 주문하시겠습니까?(y/n) ");
			yn = sc.next();
			if(yn.toUpperCase().equals("N")) break;
			else machine.menu();
		}
		System.out.println("\n==================");
		System.out.println("주문해주셔서 감사합니다.");
		System.out.println("==================");
		sc.close();
	}
}
