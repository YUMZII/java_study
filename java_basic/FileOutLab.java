import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FileOutLab {
	public static void main(String[] args) {
		String path = "c:/iolab";
		File dir = new File(path);
		
		if(!dir.exists()) {	
			dir.mkdir();
		}
		try(FileWriter writer = new FileWriter("c:/iolab/event.txt",true);
				PrintWriter out = new PrintWriter(writer);){
			LocalDate ld = LocalDate.now();
			int yearNum = ld.getYear();
			int monthNum = ld.getMonthValue();
			int dateNum = ld.getDayOfMonth();
			DayOfWeek day = ld.getDayOfWeek();
			String korday = day.getDisplayName(TextStyle.FULL, Locale.KOREA);
			
			out.printf("오늘은 %d년 %d월 %d일은 %s입니다. \r\n", yearNum, monthNum, dateNum, korday);
			System.out.println("저장이 완료되었습니다.");
			
		}catch(Exception e){
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}
	}

}
