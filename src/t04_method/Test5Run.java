package t04_method;

import java.util.Scanner;

public class Test5Run {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String volume;
		
		Test5 t5=new Test5(5);
		t5.volumePrint();
		
		while(true) {
			System.out.print("볼륨크기를 조정하세요(+/-, 종료시 0)");
			volume = sc.next();
			if(volume.equals("+")) {
				t5.volumeUp();
			}
			else if(volume.equals("-")) {
				t5.volumeDown();
			}
			else {
				break;
			}
		}
		
		System.out.println("작업끝...");
		sc.close();
	}
}
