import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class prog9 extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        boolean newreq = true;

        Cookie[] cookies = request.getCookies();
        if (cookies != null)
        {
            for(int i=0; i<cookies.length; i++)
            {
                Cookie c = cookies[i];
                out.println(cookies[i].getName());
                out.println("<br>");
                out.println(cookies[i].getValue());
                out.println("<br>");
                if ((c.getName().equals("repvis")) &&(c.getValue().equals("yes")))
                {
                    newreq = false;
                    out.println("Welcome back");
                    break;
                }
            }
        }
        if(newreq)
        {
            Cookie retVisC =new Cookie("repvis", "yes");
            retVisC.setMaxAge(360);
            response.addCookie(retVisC);
            out.println("you have visited this site first time");
        }
    }
}