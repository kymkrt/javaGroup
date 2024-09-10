package t15_API.t07_DateTime;

import java.util.Calendar;
import java.util.TimeZone;

public class T03_TimeZone {

	public static void main(String[] args) {
		//알고싶은 시간대와 타임존 확인: TimeZone 싱글톤이라 get으로 가져옴
		String temp;
		temp="Americal/Los_Angeless";
		TimeZone timeZone = TimeZone.getTimeZone(temp);
		Calendar calLA = Calendar.getInstance(timeZone);
		System.out.println("LA 현재 날짜 시간");
		System.out.println("날짜: "+calLA.get(Calendar.YEAR)+"년"
		+(calLA.get(Calendar.MONTH)+1)+"월"+calLA.get(Calendar.DATE)+"일");
		System.out.println("시간: "+calLA.get(Calendar.HOUR_OF_DAY)+"시 "+calLA.get(Calendar.MINUTE)+"분 "
		+calLA.get(Calendar.SECOND)+"초");
		System.out.println();
		
		System.out.println("TimeZone List");
		String[] timezone = TimeZone.getAvailableIDs();
		for(String id : timezone) {
			System.out.println(id);
		}
		
	}
}