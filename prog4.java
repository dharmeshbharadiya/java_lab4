import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class prog4 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		pw.println(request.getHeader("user-agent")); 
		String h = request.getHeader("user-agent");
		if (h.contains("MSIE")) {
			pw.println("Browser Use Is Internet Explorer");
		}
		else {
			response.sendRedirect("https://www.google.com/");
		}
		out.close();
	}

}
