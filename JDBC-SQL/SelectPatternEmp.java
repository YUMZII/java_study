package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class SelectPatternEmp2 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "1234";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();
		String munja;
		if (new Random().nextBoolean())
			munja="z";
		else munja="s";
		ResultSet rs = stmt.executeQuery("select ename, job, sal, deptno from emp where ename like '%" + munja + "%'");
		if(rs.next()) {//여기서 두번째 행으로 넘어가버림. 그러니까 딱 걸렸을 때 읽지 않고 다음으로 넘어감. do while문으로 하면 해결됨
			System.out.printf("%8s%8s%8s%4s\n", "성명", "직무", "급여", "부서");
			System.out.println("  -----------------------------------");
			do{//선처리 while은 후 처리
					System.out.printf("%10s%12s%8d%4d\n", 
							rs.getString("ename"), rs.getString("job"), 
							rs.getInt("sal"), rs.getInt("deptno"));
					}while(rs.next());
		}else {
			System.out.println("이름에 "+munja+"를 포함하고 있는 직원은 없어요");
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
