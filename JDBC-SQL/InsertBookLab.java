package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertBookLab {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		int count = 0;
		try(
			Connection conn = DriverManager.getConnection(url, user, passwd);
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO book(title, price, kind) VALUES(?,?,?)");
			Scanner scan = new Scanner(System.in);){
			while(true) {
				System.out.println("도서명을 입력하세요: ");
				String title = scan.nextLine();
				System.out.println("가격을 입력하세요 : ");
				int price = Integer.parseInt(scan.nextLine());
				System.out.println("도서분류에 대한 넘버를 입력하세요");
				System.out.println("1. 프로그래밍 언어");
				System.out.println("2. 웹 프로그래밍");
				System.out.println("3. 빅데이터");
				System.out.println("4. 데이터베이스");
				System.out.println("5. 인프라");
				System.out.println("선택(1~5) :");
				int menu = Integer.parseInt(scan.nextLine());
				String kind = null;
				switch(menu) {
				case 1:
					kind = "b01";
					break;
				case 2:
					kind = "b02";
					break;
				case 3:
					kind = "b03";
					break;
				case 4:
					kind = "b04";
					break;
				case 5:
					kind = "b05";
					break;
				default:
					System.out.println("분류 번호를 잘못 입력했습니다.");
					continue;
				}
				pstmt.setString(1, title);
				pstmt.setInt(2, price);
				pstmt.setString(3, kind);
				int result = pstmt.executeUpdate();
				if(result == 1) {
					System.out.println("정보가 입력되었습니다.");
					count++;
			}
			System.out.print("계속 입력하시겠습니까?(y/n): ");
			String answer = scan.nextLine();
			
			if(answer.equalsIgnoreCase("n")) {
				break;
			}	
		}
			System.out.print(count+"개의 데이터 입력 완료!");
		}catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}

}
