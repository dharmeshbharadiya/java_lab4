import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class prog3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        	
		PrintWriter pw = response.getWriter();
		pw.println(request.getHeader("user-agent")); 
		String h = request.getHeader("user-agent");
		if (h.contains("MSIE")) {
			pw.println("<br>Browser Use Is Internet Explorer");
		}
		else {
			pw.println("<br>Browser Use Is Not Internet Explorer");
		}
        out.close();
		
	}

	
}
