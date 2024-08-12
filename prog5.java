import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class prog5 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw = response.getWriter();
		String s1 = "Hello";
		if (s1.length() == 5) {
			pw.println("String Is Equal To 5");
		}
		else{
			response.sendError(404, "String Is  Greathe Than 5");
		}
        out.close();
	}


}
