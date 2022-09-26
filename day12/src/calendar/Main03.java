package calendar;

import java.util.Calendar;

public class Main03 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		DatePrinter.printDateTime(cal);
		
		// 특정 날짜로 지정
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 4);	//자바는 0부터 월을 관리하므로 5월로 설정한 것
		cal.set(Calendar.DAY_OF_MONTH, 5);
		cal.set(Calendar.HOUR_OF_DAY, 15);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 33);
		DatePrinter.printDateTime(cal);
		
		// 특정날짜로 지정
		cal.set(1982, 5, 17);
		DatePrinter.printDateTime(cal);
		
		// 특정 날짜로 지정, 시/분/초 포함, 24시간제만 가능
		cal.set(1982,5, 13,1,2, 3);
		DatePrinter.printDateTime(cal);
		
		
		
		
		
		
		
		
	}

}




