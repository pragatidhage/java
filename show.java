import javax.servlet.http.*;
 import java.io.*; 
 public class show extends HttpServlet 
{ 
@Override public void doGet(HttpServletRequest req,HttpServletResponse res) 
{ 
 	PrintWriter out =null; 
 	try 
 	{ 
 	 	out=res.getWriter(); 
 	 	Cookie arr[]= req.getCookies();  	
           	out.println("<html><body>");  	 
               	out.println("Cokkies name"+arr[0].getName()+"<br>");  
                   	 	out.println("Cokkies name"+arr[0].getValue()+"</body></html>"); 
 	} 
 	catch(Exception ex) 
 	{ 
 	 	out.println(ex); 
 	} 
 	finally 
 	{ 
 	 	out.close(); 
 	} 
} 
} 
