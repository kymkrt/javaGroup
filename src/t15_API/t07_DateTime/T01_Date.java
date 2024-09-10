package t15_API.t07_DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class T01_Date {

	public static void main(String[] args) {
		//Date 객체 (날짜 형식)
		Date now = new Date();
		System.out.println("1. 오늘의 날짜(기본형식): "+now);
		
		//날짜객체를 문자화: toString()
		String strNow = now.toString();
		System.out.println("2. 오늘의 날짜(문자형식): "+strNow);
		
		//날짜 형식을 사용자 지정에 따른 변경: SimpleDateFormat() 최근에는 다른거쓰지만 옛날부터 썼기 때문에 유지보수에 많이 쓰임
		//매개변수의형식: 년도(yy, yyyy), 월(M)월이 M 분이 m, 일(d), 시간(h, H)12/24, 분(m), 초(s), 요일(E), 1월1일부터 오늘까지 날수(D)
		SimpleDateFormat sdf = new SimpleDateFormat();
		String strNow1=sdf.format(now);
		System.out.println("3. 기본 날짜 시간 포맷: "+strNow1);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		strNow1=sdf.format(now);
		System.out.println("4. yyyy-MM-dd: "+strNow1);
		
		sdf = new SimpleDateFormat("yyyy년-MM월-dd일");
		strNow1=sdf.format(now);
		System.out.println("5. yyyy년-MM월-dd일: "+strNow1);
		
		sdf = new SimpleDateFormat("hh:mm:ss");//24시간제
		strNow1=sdf.format(now);
		System.out.println("6. hh:mm:ss: "+strNow1);
		
		sdf = new SimpleDateFormat("HH:mm:ss"); //12시간제(AM, PM)출력해야함
		strNow1=sdf.format(now);
		System.out.println("7. HH:mm:ss: "+strNow1);
		
		sdf = new SimpleDateFormat("오늘은 E요일"); //한글지원 
		strNow1=sdf.format(now);
		System.out.println("8. 오늘은 E요일: "+strNow1);
		
		sdf = new SimpleDateFormat("오늘은 올해의 D번째 날");  
		strNow1=sdf.format(now);
		System.out.println("9.오늘은 올해의 D번째 날: "+strNow1);
		
		sdf = new SimpleDateFormat("오늘은 이번달의 d번째 날");  
		strNow1=sdf.format(now);
		System.out.println("10. 오늘은 이번달의 d번째 날: "+strNow1);
		//국가별설정 로케일
		sdf = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss");  
		strNow1=sdf.format(now);
		System.out.println("11. E, d MMM yyyy HH:mm:ss: "+strNow1);
	
		sdf = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss", Locale.ENGLISH);  //로케일 적용
		strNow1=sdf.format(now);
		System.out.println("11. E, d MMM yyyy HH:mm:ss: "+strNow1);
		
		
	}
}
