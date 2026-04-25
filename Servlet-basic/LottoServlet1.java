import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/lotto1")
public class LottoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		//입력값 받기
		String user = request.getParameter("num");
		int userNum = Integer.parseInt(user);
		//랜덤값 생성
		int random = (int)(Math.random()*6)+1;
		//콘솔 출력
		System.out.println("전달된 값: " + userNum);
		System.out.println("랜덤값: " + random);
		//forward로 값 비교해서 넘겨주기
		if(userNum == random) {
			request.getRequestDispatcher("/clientexam/success.html").forward(request, response);
		}else {
			request.getRequestDispatcher("/clientexam/fail.html").forward(request, response);
		}
		out.close();
	}

}
