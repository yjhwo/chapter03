import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		// deprecated!
		System.out.println(now.getYear()+1900);	// 곧 지원하지 않을 api라는 뜻
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		System.out.println(sdf.format(now));
		
		// ----
		DateFormat dateFormat1 = DateFormat.getDateInstance( DateFormat.FULL );
		System.out.println(  dateFormat1.format( now )  );

		DateFormat dateFormat2 = DateFormat.getDateInstance( DateFormat.LONG );
		System.out.println(  dateFormat2.format( now )  );

		DateFormat dateFormat3 = DateFormat.getDateInstance( DateFormat.MEDIUM );
		System.out.println(  dateFormat3.format( now )  );

		DateFormat dateFormat4 = DateFormat.getDateInstance( DateFormat.SHORT );
		System.out.println(  dateFormat4.format( now )  );

		
	}

}
