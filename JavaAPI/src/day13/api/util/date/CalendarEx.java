package day13.api.util.date;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		
		//static메서드를 사용해서 객체를 반환하는 모형
		Calendar cal = Calendar.getInstance();
		
//		System.out.println(Calendar.YEAR);//1
//		System.out.println(Calendar.MONTH);//2
//		System.out.println(Calendar.DATE); //5
		int year = cal.get(1);
		//int year = cal.get(Calendar.YEAR);
		System.out.println(year); //년
		
		int month = cal.get(Calendar.MONTH);
		System.out.println(month); //월 -> 1작게 나옴
		
		int day = cal.get(Calendar.DATE);
		System.out.println(day); //일
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
	}
}
