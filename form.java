import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyForm")
public class FormApp extends HttpServlet {

	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	   {

	      String email = request.getParameter("email");
	      String name = request.getParameter("name");
	      String pwd = request.getParameter("pwd");
	      String gender = request.getParameter("gender");
	      String[] course = request.getParameterValues("course");
	   
	      response.setContentType("text/html");
	      PrintWriter pw=response.getWriter();
	      
	      pw.write("<h5> Email: "+ email +" </h5>");
	      pw.write("<h5> User name: "+ name +" </h5>");
	      pw.write("<h5> Password: "+ pwd +" </h5>");
	      pw.write("<h5> Gender: "+ gender +" </h5>");
	      pw.write("<h5> Course:  ");
	     for(String str:course)
	      {
	         pw.write(  str+"   ");
	      }
	      pw.write("</h3>");
	   }
	}
	 
