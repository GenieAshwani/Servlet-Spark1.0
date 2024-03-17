package main.webapp;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "/StudentServlet")
public class LoggingFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code (if needed)
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        System.out.println("Request URI: " + httpRequest.getRequestURI());
        System.out.println("Raja----simran");
        System.out.println("raj gaya");
        System.out.println(((HttpServletRequest) request).getHeaderNames());

        chain.doFilter(request, response);


    }

    public void destroy() {
        // Cleanup code (if needed)
    }
}