package calendar;
//캘린더
import java.util.Calendar;

public class Main01 {

	public static void main(String[] args) {
		// 캘린더 객체의 생성
		Calendar cal = Calendar.getInstance();	//싱글톤 객체

		// 년, 월, 일, 시, 분, 초 -> 24시간제
		int yy = cal.get(Calendar.YEAR);
		// 자바에서의 월은 0부터 시작된다.
		int mm = cal.get(Calendar.MONTH)+1; //1을 추가해야 1월부터 시작된다
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		
		System.out.printf("%04d년 %02d월 %02d일 %02d시 %02d분 %02d초\n", yy,mm,dd,hh,mi,ss);	// pc시간을 가져옴(배포된 서버의 시간)
		
		System.out.println("-------------------------");
		
		//년, 월, 일, 시, 분, 초 -> 12시간제
		yy = cal.get(Calendar.YEAR);
		mm = cal.get(Calendar.MONTH)+1;
		dd = cal.get(Calendar.DAY_OF_MONTH);
		hh = cal.get(Calendar.HOUR);
		mi = cal.get(Calendar.MINUTE);
		ss = cal.get(Calendar.SECOND);
		
		//오전(=0), 오후(=1)
		int ampm = cal.get(Calendar.AM_PM);
		String[] apname = {"오전", "오후"};
		
		System.out.printf("%04d년 %02d월 %02d일 %s %02d시 %02d분 %02d초\n", yy,mm,dd,apname[ampm], hh,mi,ss);
		
		
		
	}

}















