package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class SelectEmpLab {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(url,user,passwd);
			stmt = conn.createStatement();
			Random r = new Random();
			boolean result = r.nextBoolean();	

			if(result) {
				rs = stmt.executeQuery("SELECT ename, concat(format(sal, 0),'달러') sal FROM emp");
				while (rs.next()) {
					System.out.printf(rs.getString("ename") + " 직원의 월급은" + rs.getString("sal") + "입니다. \n");
				}
			}else{
				rs = stmt.executeQuery("SELECT ename, YEAR(hiredate), MONTH(hiredate), DAY(hiredate) FROM emp");
				while (rs.next()) {
					System.out.printf(rs.getString("ename") + " 직원은" + rs.getString("YEAR(hiredate)")+ "년" + rs.getString("MONTH(hiredate)")+ "월" +  rs.getString("DAY(hiredate)") + "입사하였습니다.\n ");
				}
			} 
		}catch (SQLException se1) {
				System.out.println(se1.getMessage());
			} finally {
				try {
					rs.close();
					stmt.close();
					conn.close();
				} catch (SQLException se2) {
					System.out.println(se2.getMessage());
				}
			}
	}
}
