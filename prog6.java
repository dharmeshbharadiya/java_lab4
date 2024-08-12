import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class prog6 extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String sessionid;
HttpSession session=request.getSession();
sessionid=session.getId();
out.println("The current sessionid is:" +sessionid);
out.println("<p>");
String newurl;
newurl=request.getRequestURL().toString()+ "?sessionid=" + sessionid;
out.println("<p> <a href=" + newurl +" here </a> Click again to continue browsing with
the same identity.</p>");
}
}