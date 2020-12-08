import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "Full Creative",
    urlPatterns = {"/intro"}
)
public class Intro extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");

    response.getWriter().print("FULL Creative is a foundry for new ideas. "
    + "Over twenty years, we've evolved from being a long-distance"+"\ncarrier based in our founder's "
    + "garage into a provider of diverse products and services with a mission"
    		+ "\nto change how the world works.");

  }
}
