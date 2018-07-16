import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonalInfoServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//한글데이터 인코딩
		
		String name = request.getParameter("Name");
		String id = request.getParameter("ID");
		String password = request.getParameter("Password");
		String gender = request.getParameter("Gender");
		
		if (gender.equals("Male"))
			gender = "남";
		else 
			gender = "여";
		
		String iNotice = request.getParameter("INotice");
		String cNotice = request.getParameter("CNotice");
		String dNotice = request.getParameter("DNotice");
		String job = request.getParameter("JOB");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out =response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>개인정보 입력 - 결과화면</TITLE></HEAD>");
		out.println("<BODY>");
		out.printf("이름: %s <br>", name);
		out.printf("아이디: %s <br>", id);
		out.printf("암호: %s <br>", password);
		out.printf("성별: %s <br>", gender);
		out.printf("공지 메일: %s <br>", noticeToHangul(iNotice));
		out.printf("광고 메일: %s <br>", noticeToHangul(cNotice));
		out.printf("배송 확인 메일: %s <br>", noticeToHangul(dNotice));
		out.printf("직업: %s <br>", job);
		out.println("</BODY>");
		out.println("</HTML>");
	}
	
	private String noticeToHangul(String notice) {
		if (notice==null) {//체크 안되있으면
			return "받지않음";
		}
		else if(notice.equals("on")){//체크 되어있으면
			return "받음";
		}
		else {
			return notice;
		}
	}
	
}
