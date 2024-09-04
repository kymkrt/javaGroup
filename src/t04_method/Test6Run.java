package t04_method;

import java.util.Scanner;

public class Test6Run {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Test6 t6=new Test6();
		
		t6.mod1();
		System.out.println();

		System.out.println("정수를 입력하세요");
		int su= sc.nextInt();
		
		//입력된 정수가 음수/양수 판별
		String check= t6.integerCheck(su);
		System.out.println("입력된 수 "+su+" 는 "+check+" 입니다");
		sc.close();
	}
}
