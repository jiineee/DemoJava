package day08.encp.good;

public class MainClass {
	public static void main(String[] args) {
		MyDate me = new MyDate();
		
		//my.day = 2022;
		me.setYear(2022);
		
		int year = me.getYear();
		System.out.println(year);
		
		me.setMonth(12);
		
		int month = me.getMonth();
		System.out.println(month);
		
		me.setDay(30);
		int day = me.getDay();
		System.out.println(day);
		
		me.setSsn("112345-6789726");
		String ssn = me.getSsn();
		System.out.println(ssn);
	}
}
