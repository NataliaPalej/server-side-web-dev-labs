import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/HelloControllerServlet1")
public class HelloControllerServlet1 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		// Get the "name" parameter from FORM
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		// Create new User model (domain object)
		User user = new User(name, address);
		
		// Add model as an attribute in the request
		request.setAttribute("user", user);
		
		//Forward updated request and response to ShowUser View
		request.getRequestDispatcher("ShowUser.jsp").forward(request, response);
	}
}
