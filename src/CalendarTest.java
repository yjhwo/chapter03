import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		// Calendar 클래스가 추상클래스 이므로 객체 생성(new)X
		printDate(calendar);
		
		// 연도
		calendar.set(Calendar.YEAR,2006);
		printDate(calendar);
		// 월
		calendar.set(Calendar.MONTH,0);
		printDate(calendar);
		
		//년,월,일
		calendar.set(2008, 1, 30);
		printDate(calendar);
		
		// 기념일
		calendar.set(2012,1,1);
		calendar.add(Calendar.DATE, 100);
		printDate(calendar);
		
		calendar.set(1971,12,18);
		calendar.add(Calendar.DATE, -10000);
		printDate(calendar);
		// 어플에서 사용많이..
		
		// 오늘은 올해의 며칠일까?
		calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
	}
	
	public static void printDate(Calendar calendar){
		String date = "";
		
		// 연도
		int year = calendar.get(Calendar.YEAR);
		date += (year + "년");
		
		// 월 (0~11)
		int month = calendar.get(Calendar.MONTH);
		date += ((month+1)+"월");
		
		// 일
		int d = calendar.get(Calendar.DATE);
		date += (d+"일");
		
		// 요일 (1~7;일요일 부터 시작)
		final String[] days = {"일","월","화","수","목","금","토"};
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		date += ("("+days[day-1]+")");
		
		// AM_PM(0;AM,1;PM)
		String ampm = calendar.get(Calendar.AM_PM)==0?"오전":"오후";
		date += (ampm+ " ");
		
		// 시
		int hour = calendar.get(Calendar.HOUR);
		date += (hour+":");
		
		// 분
		int minute = calendar.get(Calendar.MINUTE);
		date += (minute+":");
		
		//초
		int second = calendar.get(Calendar.SECOND);
		date += second;
		
		
		System.out.println(date);
	}
}
