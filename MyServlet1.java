import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet1 extends HttpServlet
{

public void init() throws ServletException{}
public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
{
PrintWriter out = response.getWriter();
out.println("Hello there!");
out.println("Putting the Servlet in service");
}

public void destroy() {}
}