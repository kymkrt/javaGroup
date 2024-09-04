package t08_inheritance;

import java.util.Scanner;

//면적을 계산하고자 한다 
//T02Aa 클래스는 사각형 면적/둘레을 구할수 있고,
//T02Ba 클래스는 원의 면적/둘레을 구할수 있다
//T02Cc 클래스는 출력 전담 클래스이다.
public class T02Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T02Cc Cc =new T02Cc();
		int choice, w,h,r,resRect;
		double resCircle;
		
		
		while(true) {
		System.out.println("작업할 번호를 입력하세요");
		System.out.println("1: 사각형 넓이, 2:사각형 둘레, 3:원넓이, 4:원둘레, 0:종료");
		choice =sc.nextInt();
		if(choice==1||choice==2) {
			System.out.print("사각형의 폭: ");
			w=sc.nextInt();
			System.out.print("사각형의 높이: ");
			h=sc.nextInt();
			
			resRect=(int) Cc.areaRec(w, h);
			Cc.prn(1,"a",resRect,0.0);
			
			resRect=(int) Cc.lenRec(w, h);
			Cc.prn(1,"l",resRect,0.0);
			
		}else if(choice==3||choice==4) {
			System.out.print("원의 반지름: ");
			r=sc.nextInt();
			
			resCircle= Cc.areaCircle(r);
			Cc.prn(2,"a",0,resCircle);
			resCircle= Cc.lenCircle(r);
			Cc.prn(2,"l",0,resCircle);
			
		}else {
			break;
		}
		
		}
		System.out.println("작업끝");
		sc.close();
	}
}
