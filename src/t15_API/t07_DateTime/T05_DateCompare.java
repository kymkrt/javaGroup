package t15_API.t07_DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class T05_DateCompare {

	public static void main(String[] args) throws ParseException {
		LocalDateTime startDateTime =LocalDateTime.now();
		LocalDateTime endDateTime = LocalDateTime.of(2024, 12,31,0,0,0);
		
		System.out.println("남은 월: "+startDateTime.until(endDateTime, ChronoUnit.MONTHS));
		System.out.println("남은 월: "+startDateTime.until(endDateTime, ChronoUnit.DAYS));
		System.out.println("남은 시간: "+startDateTime.until(endDateTime, ChronoUnit.HOURS));
		System.out.println();
		
		String strDate1 = "2024-09-11";
		String strDate2 = "2024-09-10";
		
//		String date1123=new SimpleDateFormat("yyyy-MM-dd").format(null);
		Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(strDate1);
		Date date2=new SimpleDateFormat("yyyy-MM-dd").parse(strDate2);
		
		if(date1.getTime()> date2.getTime()){
			System.out.println("strDate1이 크다");
		}else {
			System.out.println("strDate2가 더 크다");
		}
		
		long res=(date1.getTime()-date2.getTime())/1000;//초
		System.out.println("res1: "+res+"초");
		
		res=(date1.getTime()-date2.getTime())/(1000*60);//분
		System.out.println("res1: "+res+"분");
		
		res=(date1.getTime()-date2.getTime())/(1000*60*60);//시간
		System.out.println("res1: "+res+"시간");
		
		res=(date1.getTime()-date2.getTime())/(1000*60*60*24);//일
		System.out.println("res1: "+res+"일");
	}

}
