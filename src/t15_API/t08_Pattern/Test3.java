package t15_API.t08_Pattern;

import java.util.regex.Pattern;

public class Test3 {

	//글자수: {시작글자수, 종료글자수} - 종료글자수는 생략가능
	public static void main(String[] args) {
		String regEx1 = "^[a-zA-Z0-9_]+@[a-zA-Z0-9_-]+.[a-zA-Z]+$";
		String regEx2 = "^[a-zA-Z0-9_]{3,}+@[a-zA-Z0-9_-]+.[a-zA-Z]+$";
		String regEx3 = "^[a-zA-Z0-9_]{3,12}+@[a-zA-Z0-9_-]+.[a-zA-Z]+$";
		String regEx4 = "^[a-zA-Z0-9_]{3,12}+@[a-zA-Z0-9_-]{1,8}+.[a-zA-Z]{2,4}+$";
		String regEx5 = "\\w{3,}+@[a-zA-Z0-9_-]{1,8}\\.[a-zA-Z]{2,4}"; //최소1개 +없어도됨 .이 문제 일으킬때도 있어서\\. 마지막도 지정했기때문에 $제거
		String regEx6 = "\\w{3,}@\\w{3,}\\.\\w{2,}\\.\\w{2,}"; // atom@naver.co.kr
		String regEx7 = "\\w{3,}+@[a-zA-Z0-9_-]+(\\.[a-z]+)+$"; //뒤에 .이 여러번 나와도 가능
		
		String str00 = "";
		String str01 = "atom@naver.com";
		String str02 = "atom1234@naver.com";
		String str03 = "atom!1234@naver.com";
		String str04 = "atom 1234@naver.com";
		String str05 = "atom1234567890@naver.com";
		String str06 = "atom1234567890@navernaver.com";
		String str07 = "at@navernaver.com";
		String str08 = "atom@navernaver.comcom";
		String str09 = "atom@naver.co.kr";
		
		
		System.out.println("1:0 : "+Pattern.matches(regEx1, str00));
		System.out.println("1:1 : "+Pattern.matches(regEx1, str01));
		System.out.println("1:2 : "+Pattern.matches(regEx1, str02));
		System.out.println("1:3 : "+Pattern.matches(regEx1, str03));
		System.out.println("1:4 : "+Pattern.matches(regEx1, str04));
		System.out.println();
		
		System.out.println("2:0 : "+Pattern.matches(regEx2, str00));
		System.out.println("2:1 : "+Pattern.matches(regEx2, str01));
		System.out.println("2:2 : "+Pattern.matches(regEx2, str02));
		System.out.println("2:3 : "+Pattern.matches(regEx2, str03));
		System.out.println("2:4 : "+Pattern.matches(regEx2, str04));
		System.out.println();                            
		
		System.out.println("3:0 : "+Pattern.matches(regEx3, str00));
		System.out.println("3:1 : "+Pattern.matches(regEx3, str01));
		System.out.println("3:2 : "+Pattern.matches(regEx3, str02));
		System.out.println("3:3 : "+Pattern.matches(regEx3, str03));
		System.out.println("3:4 : "+Pattern.matches(regEx3, str04));
		System.out.println("3:5 : "+Pattern.matches(regEx3, str05));
		System.out.println();                            
		
		System.out.println("4:0 : "+Pattern.matches(regEx4, str00));
		System.out.println("4:1 : "+Pattern.matches(regEx4, str01));
		System.out.println("4:2 : "+Pattern.matches(regEx4, str02));
		System.out.println("4:3 : "+Pattern.matches(regEx4, str03));
		System.out.println("4:4 : "+Pattern.matches(regEx4, str04));
		System.out.println("4:5 : "+Pattern.matches(regEx4, str05));
		System.out.println("4:6 : "+Pattern.matches(regEx4, str06));
		System.out.println();                            
		
		
		System.out.println("5:0 : "+Pattern.matches(regEx5, str00));
		System.out.println("5:1 : "+Pattern.matches(regEx5, str01));
		System.out.println("5:2 : "+Pattern.matches(regEx5, str02));
		System.out.println("5:3 : "+Pattern.matches(regEx5, str03));
		System.out.println("5:4 : "+Pattern.matches(regEx5, str04));
		System.out.println("5:5 : "+Pattern.matches(regEx5, str05));
		System.out.println("5:6 : "+Pattern.matches(regEx5, str06));
		System.out.println("5:7 : "+Pattern.matches(regEx5, str07));
		System.out.println("5:8 : "+Pattern.matches(regEx5, str08));
		System.out.println("5:9 : "+Pattern.matches(regEx5, str09));
		System.out.println();      
		
		System.out.println("5:7 : "+Pattern.matches(regEx5, str07));
		System.out.println("5:8 : "+Pattern.matches(regEx5, str08));
		System.out.println("5:9 : "+Pattern.matches(regEx5, str09));
		System.out.println();                            
		
		System.out.println(Pattern.matches(regEx6, str09));
	}
}