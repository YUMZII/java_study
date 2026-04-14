package lab;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet("/reservation")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter(); 
		
		String stname = request.getParameter("stname");
		String stroom = request.getParameter("stroom");//radio는 String
		String[] stfood = request.getParameterValues("stfood");//checkbox는 배열에 담아서 출력해야 됨
		String a = request.getParameter("a");
		LocalDate date = LocalDate.parse(a);
		
		out.print("<h1 style='color:blue;'>" + stname + "님의 예약 내용" + "</h1>");
		out.print("<hr>");
		out.print("<li>" + "선택한 룸: "+ stroom + "</li>");
		if(stfood != null) {
			out.print("<li>" + "추가 요청 사항: "); //배열 끝날때까지 반복
			for(int i = 0; i < stfood.length; i++){
				out.print(stfood[i]);
				if(i != stfood.length -1) {//마지막에는 컴마 안찍히게 
					out.print(",");
				}
			}
		 out.print( "</li>");
		}
		out.print("<li>" + "예약날짜: " +date.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")) + "</li>");
		out.close();
	}
}
