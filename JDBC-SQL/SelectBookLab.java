package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//1. 
//처음에는 메뉴별로 PreparedStatement 객체를 각각 생성하는 방식으로 구현했습니다.
//하지만 이 방식은 각 case마다 ResultSet 처리, 출력 로직, 자원 해제 코드가 반복되는 문제가 있었고, 코드 길이가 길어지고 유지보수가 어려워지는 단점이 있었습니다.
//이를 개선하기 위해 찾아본 방안이 SQL문만 switch문에서 선택하고, PreparedStatement 객체는 하나로 통합하여 사용하는 방식이였습니다.
//이렇게 변경함으로써 중복 코드를 줄이고, 공통 로직을 한 곳에서 처리할 수 있게 되었습니다.

//2.
//처음에 try-catch-finally 방식을 사용해서 close()를 따로 선언해줬습니다.
//하지만 이 방식으로 했을 때 close() 선언을 빼먹는 경우가 있어서 
// 이를 개선하기 위해 찾아본 방안이 try-with-resources 였습니다. 이 방안은 try문을 사용할 때 선언부에 작성하여 실수할 가능성이 적어진다는 장점과
//AutoCloseable을 구현한 객체가 자동으로 close되어 별도의 자원 해제 코드를 작성하지 않아도 되는 장점이 있습니다.

public class SelectBookLab {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try(Connection conn = DriverManager.getConnection(url,user,passwd);
				Scanner scan = new Scanner(System.in);)
		{
			while(true) {
				System.out.println("1. 모두 출력하기 ");
				System.out.println("2. 가격이 높은 순으로 출력하기 ");
				System.out.println("3. 20000 이상의 도서들만 출력하기 ");
				System.out.println("4. 웹 프로그래밍 도서들만 출력하기 ");
				System.out.println("5. 데이터베이스와 인프라 도서들만 출력하기 ");
				System.out.println("6. 도서명에 '자바'를 포함하는 도서들만 출력하기 ");
				System.out.println("원하는 메뉴의 번호를 선택 :");
				int num = Integer.parseInt(scan.nextLine());
				
				String sql = null;
				boolean AllColumns = false;
				
				switch(num) {
				case 1:
					sql = "SELECT id, title, format(price, 0) AS price, kind FROM book";
                    AllColumns = true;
                    break;
				case 2:
					sql = "SELECT id, title, format(price, 0) AS price, kind FROM book ORDER BY price DESC";
                    AllColumns = true;
                    break;
				case 3:
					 sql = "SELECT title, format(price, 0) AS price FROM book WHERE price >= 20000";
                     break;
				case 4:
					sql = "SELECT title, format(price, 0) AS price FROM book WHERE kind = 'b02'";
                    break;
				case 5:
					sql = "SELECT title, format(price, 0) AS price FROM book WHERE kind IN ('b04', 'b05')";
                    break;
				case 6:
					sql = "SELECT title, format(price, 0) AS price FROM book WHERE title LIKE '%자바%'";
                    break;
				default:
					System.out.println("메뉴 번호를 잘못 입력했습니다.");
					continue;
					
				}try(PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();
						){
					if(AllColumns) {
						System.out.printf("%5s %-20s %15s %10s%n", "ID", "도서명","가격", "분류");
						System.out.println("-----------------------------------------------------------------");
						while(rs.next()){
							System.out.printf("%5d %-20S %15s원 %10s%n",
									rs.getInt("id"),
									rs.getString("title"),
									rs.getString("price"),
									rs.getString("kind"));
						}
					}else {
						System.out.printf("%-20s %15s%n", "도서명", "가격");
						System.out.println("-------------------------------------");
						while(rs.next()) {
							System.out.printf("%-20s %15s원%n",
									rs.getString("title"), 
									rs.getString("price"));
						}
					}
				}
				System.out.print("계속 처리하겠습니까?(y/n): ");
				String answer = scan.nextLine();
				
				if(answer.equalsIgnoreCase("n")) {
					break;
				}
				System.out.println();
			}
		}catch(SQLException se) {
			System.out.println("DB 오류: " + se.getMessage());
		}catch(NumberFormatException ne) {
			System.out.println("메뉴 번호는 숫자로 입력해야 합니다.");
		}
		
	}
}

