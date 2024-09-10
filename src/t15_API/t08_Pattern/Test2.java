package t15_API.t08_Pattern;

import java.util.regex.Pattern;

//영문자와 숫자? ^[\\w]*$ , ^[a-zA-Z0-9]*$
public class Test2 {

	public static void main(String[] args) {
		String regEx1 = "^[\\w]*$"; //영문자와 숫자체크
		String regEx2 = "^[a-zA-Z0-9]*$"; //영문자와 숫자체크
		String regEx3 = "^[a-zA-Z가-힣]*$";//영문자와 한글체크
		String regEx4 = "^[\\s]*$"; // 공백
		String regEx5 = "^[a-zA-Z가-힣 ]*$";//영문자와 한글과 공백 체크
		String regEx6 = "^[a-zA-Z가-힣0-9 _-]*$"; //이름은 영문자 한글 공백 숫자 밑줄 하이폰 만이 포함된 글자만을 허용
		
		String str1 = "hello";
		String str2 = "hello1234";
		String str3 = "hello12!!";
		String str4 = "hello  ";
		String str5 = "안녕";
		String str5_2 = "안 녕";
		String str6 = "      ";
		String str7 = "		";
		String str8 = "		".trim();
		String str9 = "";
		String str10 = "한글 abc - _";
		String str11 = "한글 abc - _ !";
		
		//rexEx1
		if(Pattern.matches(regEx1, str1)) System.out.println("1.영문자와 숫자로만 구성되어 있다");
		else System.out.println("1.영문자와 숫자가 아닌 구성문자가 포함 되어있다");
		
		System.out.println("2. :"+Pattern.matches(regEx1, str2));
		System.out.println("3. :"+Pattern.matches(regEx1, str3));
		System.out.println("4. :"+Pattern.matches(regEx1, str4));
		System.out.println("5. :"+Pattern.matches(regEx1, str5));
		System.out.println("=========================================");
		
		//rexEx2
		if(Pattern.matches(regEx2, str1)) System.out.println("11.영문자와 숫자로만 구성되어 있다");
		else System.out.println("11.영문자와 숫자가 아닌 구성문자가 포함 되어있다");
		
		System.out.println("12. :"+Pattern.matches(regEx2, str2));
		System.out.println("13. :"+Pattern.matches(regEx2, str3));
		System.out.println("14. :"+Pattern.matches(regEx2, str4));
		System.out.println("15. :"+Pattern.matches(regEx2, str5));
		System.out.println("=========================================");
		
		//rexEx3
		if(Pattern.matches(regEx3, str1)) System.out.println("21.영문자와 한글로만 구성되어 있다");
		else System.out.println("21.영문자와 한글이 아닌 구성문자가 포함 되어있다");
		
		System.out.println("22. :"+Pattern.matches(regEx3, str2));
		System.out.println("23. :"+Pattern.matches(regEx3, str3));
		System.out.println("24. :"+Pattern.matches(regEx3, str4));
		System.out.println("25. :"+Pattern.matches(regEx3, str5));
		System.out.println("26. :"+Pattern.matches(regEx3, str5_2));//공백이 있어서 한글이 아닌걸로 취급 공백지울때 replace
		System.out.println("27. :"+Pattern.matches(regEx5, str5_2));
 		System.out.println("=========================================");
		
		//rexEx4
		if(Pattern.matches(regEx4, str1)) System.out.println("31.공백문자만 있다");
		else System.out.println("31.공백이 아닌 문자가 있다");
		
		System.out.println("32. :"+Pattern.matches(regEx4, str2));
		System.out.println("33. :"+Pattern.matches(regEx4, str3));
		System.out.println("34. :"+Pattern.matches(regEx4, str4));
		System.out.println("35. :"+Pattern.matches(regEx4, str5));
		System.out.println("36. :"+Pattern.matches(regEx4, str6));//공백 탭도 공백 
		System.out.println("37. :"+Pattern.matches(regEx4, str7));
		System.out.println("38. :"+Pattern.matches(regEx4, str8));
		System.out.println("39. :"+Pattern.matches(regEx4, str9)); //아무것도 안넣은것도 공백취급
		System.out.println("39-1. :"+Pattern.matches(regEx4, str5_2));
		System.out.println("=========================================");
		
		System.out.println("41. :"+Pattern.matches(regEx6, str10));
		System.out.println("42. :"+Pattern.matches(regEx6, str11));
		System.out.println("=========================================");
		
	}
}