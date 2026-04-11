import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectWhereEmp {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "1234";
		
		Connection conn = DriverManager.getConnection(url, user, passwd);
		
		System.out.println(conn.getClass().getName());
		Statement stmt = conn.createStatement();
		//SQL문을 실행하기 위한 Statement객체 생성
		System.out.println(stmt.getClass().getName());
		ResultSet rs = stmt.executeQuery("SELECT ename, sal, comm FROM emp WHERE comm is not null");
		//executeQuery는 select문 실행할 때 사용함
		//결과는 resultset에 담겨있음
		System.out.println(rs.getClass().getName());
		
		System.out.printf("%8s%8s%8s\n", "성명", "급여", "커미션");
		System.out.println("  -----------------------------------");
		while (rs.next()) {
			System.out.printf("%10s%10d%10d\n", rs.getString("ename"), rs.getInt("sal"), rs.getInt("comm"));
		}
		rs.close();//안에서부터 자원해제됨, 사용이 끝났으면 닫아줘야됨 
		stmt.close();
		conn.close();
	}
}
