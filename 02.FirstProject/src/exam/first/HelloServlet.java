package exam.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet") //어노테이션 주소뒤에 이값을 넣어서 실행
 
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8"); 			//요청하는거 인코딩
		response.setContentType("text/html; charset=UTF-8");	//charset=인코딩 글씨 깨지는거 고침
		
		PrintWriter out = response.getWriter();
		
		
		String getname = request.getParameter("abc"); //요청한것중에 파라미터로 넘어오는 값중 name을 getname변수에 대입
		String getID = request.getParameter("ID");
		String getpwd = request.getParameter("pwd");
		out.println("Hello - GET<br>");
		
		out.print("<html>");
		out.print("Hello - POST<br>");
		out.print("이름 :"+getname+"<br>");
		out.print("ID  :"+getID+"<br>");
		out.print("암호 :"+getpwd+"<br>");
		out.print("</html>");
		//request로 정보가 들어옴 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8"); 			//요청하는거 인코딩
		response.setContentType("text/html; charset=UTF-8");	//charset=인코딩 글씨 깨지는거 고침
		
		
		PrintWriter out = response.getWriter();
		String getname = request.getParameter("abc"); //요청한것중에 파라미터로 넘어오는 값중 name을 getname변수에 대입
		String getID = request.getParameter("ID");
		String getpwd = request.getParameter("pwd");
	
		out.print("<html>");
		out.print("Hello - POST<br>");
		out.print("이름 :"+getname+"<br>");
		out.print("ID  :"+getID+"<br>");
		out.print("암호 :"+getpwd+"<br>");
		out.print("</html>");
		
out.println("Hello - POST<br>");
		
	}

}
