import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Products
 */
@WebServlet("/products")
public class Products extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException {

		    response.setContentType("text/plain");
		    response.setCharacterEncoding("UTF-8");

		    response.getWriter().print("The Products of FULL CREATIVE are \n");
		    response.getWriter().print("AnswerConnect\r\n" + "AnywhereWorks\r\n"+ 
		    		                   "AnswerForce\r\n" +  "Teleport.Video\r\n" + 
		    		                    "AnywhereWorks\r\n" + "Distributed Source\r\n"+
		    		                   "HelloSells\r\n" + "LexReception\r\n" + 
		    		                   "Setmore\r\n" + "YoCoBoard\r\n" + 
		    		                   "Switchboard\r\n" + "Form Creator\r\n");


}

}
