package lab;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/lotto3")
public class LottoServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		HttpSession session = request.getSession();
		Integer count = (Integer)session.getAttribute("count");
		if(count == null) {
			count = 0;
		}
		if(count >= 3) {
			request.setAttribute("msg", "더 이상 응모할 수 없어요, 브라우저를 재기동한 후에는 가능하답니다.");
			request.getRequestDispatcher("/jspexam/lottoResult2.jsp").forward(request, response);
			return;
		}
		count ++;
		session.setAttribute("count", count);
		//입력값 받기
		String user = request.getParameter("num");
		int userNum = Integer.parseInt(user);
		//랜덤값 생성
		int random = (int)(Math.random()*6)+1;
		//콘솔 출력
		System.out.println("전달된 값: " + userNum);
		System.out.println("랜덤값: " + random);
		
		if(userNum == random) {
			request.setAttribute("msg", "당첨~~추카추카");
			request.setAttribute("imginfo","success.png");
		}else {
			request.setAttribute("msg", "실패~~아쉽아쉽");
			request.setAttribute("imginfo","failed.jpg");
		}
		request.getRequestDispatcher("/jspexam/lottoResult2.jsp").forward(request, response);
	}

}
