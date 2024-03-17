package main.webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/result")
public class LastResult extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Demo data for the last result in different subjects
        HttpSession session = request.getSession();

        String username = (String) session.getAttribute("username");
        String email = (String) session.getAttribute("email");

        // Display session attributes
        response.getWriter().println("Username: " + username);
        response.getWriter().println("Email: " + email);

        String mathGrade = "A";
        String physicsGrade = "B";
        String chemistryGrade = "A-";
        String cPlusPlusGrade = "B+";

        // Construct HTML response
        StringBuilder htmlResponse = new StringBuilder();
        htmlResponse.append("<!DOCTYPE html>");
        htmlResponse.append("<html lang=\"en\">");
        htmlResponse.append("<head>");
        htmlResponse.append("<meta charset=\"UTF-8\">");
        htmlResponse.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        htmlResponse.append("<title>Last Result</title>");
        htmlResponse.append("</head>");
        htmlResponse.append("<body>");
        htmlResponse.append("<h2>Last Result</h2>");
        htmlResponse.append("<p><strong>Math Grade:</strong> " + mathGrade + "</p>");
        htmlResponse.append("<p><strong>Physics Grade:</strong> " + physicsGrade + "</p>");
        htmlResponse.append("<p><strong>Chemistry Grade:</strong> " + chemistryGrade + "</p>");
        htmlResponse.append("<p><strong>C++ Grade:</strong> " + cPlusPlusGrade + "</p>");
        htmlResponse.append("<form action='./'>");
        htmlResponse.append("<input type=\"submit\" value=\"Back to Form\">");
        htmlResponse.append("<p><a href=\"Home.html\">Home Page</a></p>");
        htmlResponse.append("</form>");
        htmlResponse.append("</body>");
        htmlResponse.append("</html>");

        // Set content type and write HTML response to the servlet's response stream
        response.setContentType("text/html");
        response.getWriter().write(htmlResponse.toString());
    }
}
