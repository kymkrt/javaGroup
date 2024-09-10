package t50_Exercise;

import java.util.Scanner;
/*
단어 또는 문장을 입력받은후 입력받은 글자중에서 특정 문자가 어디/어디에 위치 하고 있는지 출력하시오.
예)문장: Welcome to Korea!
	찾고자하는 알파벳(한글): o
	o를 포함하고 있는 갯수:3개
	o가 위치한곳 : 4/ 9/ 12
*/
public class T5_IndexOf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String stack ="";
		String ans1, ans2;
		while(true) {
			int cnt =0;
			System.out.println("단어 혹은 문장을 입력해주세요");
			ans1 = sc.nextLine();
			System.out.println("찾을 문자를 입력해주세요");
			ans2= sc.next();
			sc.nextLine(); 
			char[] ansArr= new char[ans1.length()];
			ans1.getChars(0, ans1.length(), ansArr, 0);
			for(int i =0;i<ansArr.length;i++) {
				if(ans2.equals(String.valueOf(ansArr[i]))) {
					cnt++;
					stack += (i+1)+" ";
				}
			}
			System.out.println("찾는 단어 혹은 글자 "+ans2);
			System.out.println("찾는 단어 혹은 글자가 나온 횟수 "+cnt);
			System.out.println("찾는 단어 혹은 글자가 나온 곳 "+stack);
			
			System.out.println("계속 하시겠습니까?");
			if(sc.next().equalsIgnoreCase("y")) {
				cnt=0;
				stack ="";
				sc.nextLine(); 
				System.out.println();
			}
			else {
				System.out.println("종료합니다");
				break;
			}
		}
		sc.close();
	}
}