package t15_API.t07_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class T04_LocalDate {

	public static void main(String[] args) {
		//날짜 LocalDate 객체 자바 8부터
		LocalDate currentDate = LocalDate.now(); //상수로 되있어서 생성하지 않고 사용
		System.out.println("오늘날짜: "+ currentDate);
		
		//날짜 지정 셋팅
		currentDate = LocalDate.of(2024, 12, 25);
		System.out.println("지정날짜: "+currentDate);
		
		//시스템 시간 LocalTime
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재시간: "+currentTime.toString().substring(0,8));
		
		//날짜 시간 동시 보기 : LocalDateTime
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("현재 날짜/시간: "+currentDateTime);
		System.out.println("현재 날짜/시간: "+currentDateTime.toString().substring(0,10));
		System.out.println("현재 날짜/시간: "+currentDateTime.toString().substring(11,19));
		
		System.out.println();
		String[] strDateTime= currentDateTime.toString().split("T");
		System.out.println("현재 날짜: "+ strDateTime[0]);
		System.out.println("현재 시간: "+ strDateTime[1].substring(0, strDateTime[1].lastIndexOf(".")));
		System.out.println("현재 시간: "+ strDateTime[1]);
		
		//날짜 연산: plusYears(), minusYears() plusMonths() plusDays()  -day -minuten 등등
		LocalDateTime res =currentDateTime.plusYears(1); //롱형으로 나온다
		System.out.println("오늘날짜 년도+1: "+res.toString().substring(0,4));
		
		LocalDateTime res2 =currentDateTime.minusDays(7); //롱형으로 나온다
		System.out.println("오늘날짜 일-7: "+res2.toString().substring(8,10));
		
		
		
		
	}
}
