import java.io.*;
import java.servlet.*;
import javax.servlet.http.*;
@WebServlet("/Lab1")
public class prog1 extends HttpServlet {
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String un = request.getParameter("un");
		String ps = request.getParameter("ps");
		
		if (un.equals(ps) && un != null && ps != null) {
			pw.println("Welcome To Our Website Mr/Miss "+un);
		}
		else {
			
			response.sendError(404, "Please Enter Correct Username Or Password");
		}
        out.close();

	}

}
