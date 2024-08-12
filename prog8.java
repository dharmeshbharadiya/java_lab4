import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class prog8 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html ");
        PrintWriter out = response.getWriter();
        try {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            Cookie c1=new Cookie("first","firstc");
            response.addCookie(c1);
            Cookie[] cookies = request.getCookies();
            out.println("Your browser sent the following cookies:");
            out.println("<pre>");

            if (cookies != null) {
                for (int i=0; i < cookies.length; i++) {
                    out.println(cookies[i].getName()+": "+cookies[i].getValue());
                }
            }
            else {
                out.println("no cookies");
            }
        }
        catch(Exception e) {
        }
    }
}