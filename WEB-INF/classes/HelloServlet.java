import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class HelloServlet extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");

        PrintWriter out=res.getWriter();

        String str = req.getParameter("name");
        String age = req.getParameter("age");

    

        out.println("<html>");
        out.println("<body>");
        out.println("<p> Hello " + str + "," + age + "<p>");
        
        out.println("</html>");
        out.println("</body>");

        out.close();

    }

}