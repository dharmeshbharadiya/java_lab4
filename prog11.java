import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class prog11 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String un = request.getParameter("un");
		String ps = request.getParameter("ps");
		
		
		if(un.equals(ps) && un != null && ps != null) {
			pw.println("Hello" + un);
			HttpSession hs = request.getSession();
			hs.setAttribute("session",un);
			
		}
		else {
			response.sendRedirect("http://localhost:8080/LabProgram4/Lab11.html");
		}
		out.close();
	}

}
