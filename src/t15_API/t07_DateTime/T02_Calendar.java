package t15_API.t07_DateTime;
//Date와 다르게 생성안해도 됨 싱글톤 객체이기 때문

import java.util.Calendar;

public class T02_Calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();//싱글톤이라 겟인스턴스로 가져오기
		System.out.println("년도: "+cal.get(Calendar.YEAR));//YEAR가 대문자=상수 전부 상수다  클래스 이름으로 가져와야함 Calendar. 
		System.out.println("월: "+(cal.get(Calendar.MONTH)+1));//1월달이 0월달로 나옴 현재월보다 하나 적음
		System.out.println("일: "+cal.get(Calendar.DATE));
		System.out.println("시(12시간제): "+cal.get(Calendar.HOUR));
		System.out.println("분: "+cal.get(Calendar.MINUTE));
		System.out.println("초: "+cal.get(Calendar.SECOND));
		System.out.println("시(24시간제): "+cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("AM/PM: "+cal.get(Calendar.AM_PM));//0 AM / 1 PM 24시간제랑 같이 쓰면 좋다
		System.out.println("오늘은 무슨요일 "+cal.get(Calendar.DAY_OF_WEEK));// 일:1 월:2 화:3 수:4 목:5 금:6 토:7 다른함수도 있어서 주의하기
		System.out.println();
		
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = amPm==0 ? "오전":"오후";
		System.out.println("지금은 "+strAmPm+" 입니다");
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String strWeek = "";
		switch (week) {
			case 1: strWeek="일"; break;
			case 2: strWeek="월"; break;
			case 3: strWeek="화"; break;
			case 4: strWeek="수"; break;
			case 5: strWeek="목"; break;
			case 6: strWeek="금"; break;
			case 7: strWeek="토"; break;
		}
		System.out.println("오늘은 "+strWeek+"요일 입니다");
		
		
		
	}
}