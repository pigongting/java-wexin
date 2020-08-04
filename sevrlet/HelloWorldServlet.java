import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloWorldServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><head><title>Hello World!</title></head>");
        out.println("<body>");
        out.println("<p><img src=images/build_bea_web.gif align=right>");
        out.println("<h1>Hello World!</h1></body></html>");
    }
}