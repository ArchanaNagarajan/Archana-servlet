import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class Session extends HttpServlet {

 
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
	
	  response.setContentType("text/html");
      PrintWriter out = response.getWriter();

	  try {
			request.getRequestDispatcher("New.html").include(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	  
       HttpSession session=request.getSession();  
           
      Date createTime = new Date(session.getCreationTime());
         
      Date lastAccessTime = new Date(session.getLastAccessedTime());
     
       Integer visitCount = new Integer(0);
       String visitCountKey = new String("visitCount");
      String userIDKey = request.getParameter("name");
      String userID = request.getParameter("email");
      if (session.isNew()) {
         session.setAttribute(userIDKey, userID);
      } else {
         visitCount = (Integer)session.getAttribute(visitCountKey);
         visitCount = visitCount + 1;
         userID = (String)session.getAttribute(userIDKey);
      }
      session.setAttribute(visitCountKey,  visitCount);
     
      out.println("\n\rUser Id:=> "+userIDKey);
      out.println("\n\r   Mail Id:=> "+userID);
      out.println("\n\r   Time of creation:=> " + createTime);
      out.println("\n\r   Last access time:=> "+lastAccessTime);
      out.println("\n\r   No of visits:=> "+visitCount);
	 
	  
    	   }
    	}
      
  
