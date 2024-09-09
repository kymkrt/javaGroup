package t15_API.t04_String;

import java.util.StringTokenizer;

public class T08_stringtokenizer {

	public static void main(String[] args) {
		String tel = "010-1234-5678";
		
		StringTokenizer telArr = new StringTokenizer(tel, "-");
		
		System.out.println("telArr토큰의 갯수: "+telArr.countTokens());
		
		String str="";
		while (telArr.hasMoreElements()) {
			str+=telArr.nextToken()+ "/";
		}
		str=str.substring(0,str.length()-1);
		System.out.println("str: "+str);
	}

}
