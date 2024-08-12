import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class prog2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		
		String op = request.getParameter("calc");
		
		double n11 = Double.parseDouble(n1);
		double n22 = Double.parseDouble(n2);
		
		switch(op) {
		case "add":
			double a = n11 + n22;
			pw.println("Addition Is"+a);
			break;
		case "sub":
			double s = n11 - n22;
			pw.println("Addition Is"+s);
			break;
		case "mul":
			double m = n11 * n22;
			pw.println("Addition Is"+ m);
			break;
		case "div":
			double d = n11 / n22;
			pw.println("Addition Is"+d);
			break;
		default:
			pw.println("Error");
		}
		out.close();
		}

}
