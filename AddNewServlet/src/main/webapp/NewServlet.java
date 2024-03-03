package main.webapp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/test")
public class NewServlet extends GenericServlet{

    public void service(ServletRequest servletRequest, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Genie Ashwani</h2>");
        out.println("<hr></body></html>");
    }

}
