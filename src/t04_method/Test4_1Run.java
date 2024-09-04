package t04_method;

import java.util.Scanner;

public class Test4_1Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gas;
		
		Test4 t4=new Test4();
		
		if(t4.gas==0) {
			while(true) {
				System.out.print("가스를 주입하세요");
				gas= sc.nextInt();
				if(gas<0) {
					continue;
				}	
				else {
					t4.gas=gas;
					t4.run();
					break;
				}
			}
		}
		else {
			t4.run();
		}
		System.out.println("작업끝..");
		sc.close();
	}
}
