import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTimeTest {

	public static void main(String[] args) throws Exception {
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println(new Date().getTime());// 이렇게도 가능
		
		GregorianCalendar gc = new GregorianCalendar();//요일 정보 추출, 숫자로 나옴
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
		gc = new GregorianCalendar(2026, 5, 5);// 0이 1월 11은 12월
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));

		System.out.println(timeToStrDate(new Date().getTime()));
		System.out.println(parseStrDate("2026년 01월 01일"));
		System.out.println("================ NEW");
		LocalDate currentDate = LocalDate.now();
		LocalDate targetDate = LocalDate.of(2026, 9, 3);
		System.out.println(currentDate.getDayOfWeek());
		System.out.println(currentDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN));
		System.out.println(currentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));		
		System.out.println(targetDate.getDayOfWeek());
		System.out.println(targetDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN));
		System.out.println(targetDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		
		LocalTime currentTime = LocalTime.now();
		LocalTime targetTime = LocalTime.of(9, 10, 20);
		System.out.println(currentTime);
		System.out.println(targetTime);

		LocalDateTime currentDateTime = LocalDateTime.now();
		LocalDateTime targetDateTime = LocalDateTime.of(2026, 12, 25, 12, 30);
		System.out.println(currentDateTime);
		System.out.println(targetDateTime);
	}

	public static String timeToStrDate(long time) {
		DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
		return formatter.format(time);
	}

	public static Date parseStrDate(String strDate) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
		return formatter.parse(strDate);// 문자열(String)을 특정 형식에 맞게 해석하여 객체로 변환하는 것
	}
}
//Mon Mar 30 10:23:08 KST 2026
//1774833788889
//2
//6
//03-30-2026
//Thu Jan 01 00:00:00 KST 2026
//================ NEW
//MONDAY
//월
//월요일
//THURSDAY
//목
//목요일
//10:23:08.929137500
//09:10:20
//2026-03-30T10:23:08.929137500
//2026-12-25T12:30
