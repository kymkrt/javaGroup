package t50_Exercise;

import java.util.Scanner;

public class Homework_경마 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		
		Horse h1 = new Horse();
		Horse h2 = new Horse();
		Horse h3 = new Horse();
		Horse h4 = new Horse();
		Horse h5 = new Horse();
		
		h1.setName("1번말");
		h2.setName("2번말");
		h3.setName("3번말");
		h4.setName("4번말");
		h5.setName("5번말");
		
		for(int i=0;i<2;i++) {
			h1.start();
			System.out.println("");
			h2.start();
			System.out.println("");
			h3.start();
			System.out.println("");
			h4.start();
			System.out.println("");
			h5.start();
			System.out.println("");
		}
	}
}
class Horse extends Thread{
	@Override
	public void run() {
		int cnt=0;
		String line="";
		for(int i=0;i<=50;i++) {
			System.out.print(getName()+" "+i+"%");
			for(int j=0;j<=i;j++)
			System.out.print("-");
			cnt++;
			System.out.println();
			try {Thread.sleep((int)(Math.random()*500+1));	} catch (InterruptedException e) {}
		}
		System.out.println("도착 "+getName());
	}
}