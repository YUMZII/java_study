import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CopyLab {
	public static void main(String args[]){
		String inputFile = "c:/iotest/sample.txt";
		
		LocalDate today = LocalDate.now();
		String dateStr = today.format(DateTimeFormatter.ofPattern("yyyy_MM_dd"));
		String outputFile = "c:/iotest/sample_" + dateStr + ".txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
				PrintWriter pw = new PrintWriter(new FileWriter(outputFile, true))
			) {
			String line;
			while((line = br.readLine()) != null) {
			pw.println(line);
			}
			System.out.println("저장이 완료되었습니다.");

		}catch(FileNotFoundException e) {
			System.out.println("sample.txt 파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
		}
		}
}
