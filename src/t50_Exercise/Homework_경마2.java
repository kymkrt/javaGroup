package t50_Exercise;

import java.util.Scanner;

public class Homework_경마2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] win = {"1","2","3","4","5"};
		int[] x = new int[5];
		String horse, ans;
		int money=0;
		
		System.out.println("말을 골라주세요");
		System.out.println("1번마 / 2번마 / 3번마 / 4번마 / 5번마");
		System.out.println("말을 골라주세요");
		horse = sc.next();
		System.out.println("배당율은 1등 2배, 2등 1.5배, 3등 1배, 4등 부터는 0배입니다");
		System.out.println("금액을 입력해주십시요");
		money =sc.nextInt();
		System.out.println("경주를 시작합니다");
		
		Horse_differ h1 = new Horse_differ();
		Horse_differ h2 = new Horse_differ();
		Horse_differ h3 = new Horse_differ();
		Horse_differ h4 = new Horse_differ();
		Horse_differ h5 = new Horse_differ();
		
		h1.setName("1번말");
		h2.setName("2번말");
		h3.setName("3번말");
		h4.setName("4번말");
		h5.setName("5번말");
		
		
		
	}
}
class Horse_differ extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<100;i++) {
			System.out.print(i+"번말");
			for(int j=0;j<i;j++) {
				System.out.println(">");
			}
			System.out.println(i+"번말 도착");
			if(1==0) {
				System.out.println("merry on across");
			}
		}
		
		
		
	}
}