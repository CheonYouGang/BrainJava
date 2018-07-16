import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WinnersServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request,
							HttpServletResponse response)
				throws ServletException, IOException {
		
		int arr[] = new int[6];
		Random random = new Random();
		for(int cnt = 0; cnt < arr.length; cnt++)
			arr[cnt]= random.nextInt(45)+1;
		request.setAttribute("ARR", arr);// int[] ARR = arr; --> jsp파일안에 있는 items="${ARR}"의 값
		RequestDispatcher rd = request.getRequestDispatcher("Winners.jsp");
		rd.forward(request, response);
	}

}
