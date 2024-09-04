package t08_inheritance;

//출력전담 클래스
public class T02Cc extends T02Bb {
	
	//매개변수(flag)에 1이 오면 사각형 처리 2가 오면 원처리
	void prn(int flag, String ans, int res, double res2 ) {
		String str;
		if(ans.equals("a")) str="넓이";
		else str="둘레";
		
		if(flag ==1) {
			//사각형 출력처리
			System.out.println("사각형의 "+str+"는 "+res+"입니다.");
		}else if(flag ==2) {
			//원에 관계된 출력처리
			System.out.println("원의 "+str+"는 "+res2+"입니다.");
			
		}
	}
}