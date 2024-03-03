package main.webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginform")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println(" <title>Login From</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2> Login Form</h2>");
        out.println("<form action='loginform' method='post'>");
        out.println("<label for='uname'>UserName:</label>");
        out.println("<input type='text' id='uname' name='uname'><br><br>");
        out.println("<label for='pwd'>Password:</label>");
        out.println("<input type='password' id='pwd' name='pwd'><br><br>");
        out.println("<input type='submit' value='Login'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();

            String uname=req.getParameter("uname");
            String pwd=req.getParameter("pwd");
            out.println("<html>");
             out.println("<body>");
             out.println("<br><br>");
            out.println("<h2>");
            if(uname.equalsIgnoreCase("root") && pwd.equalsIgnoreCase("root"))
            {
                out.println("User Login Success...");
            }
            else {
                out.println("User Login failed...");
            }
            out.println("</h2>");
            out.println("<br><br>");
            out.println("<a href='./loginform'> | Show Details | </a> ");
            out.println("</body>");
            out.println("</html>");


            //who give the implementation of httpServlet tomcat or java

    }
}
