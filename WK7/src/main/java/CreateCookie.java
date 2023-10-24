

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerCookie
 */
@WebServlet("/CustomerCookie")
public class CreateCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Get parameters from request object
		String name = request.getParameter("name");
		
		// Check for null or empty values
		if (name == null || name.equals("")) {
			out.print("Please enter valid name <br/>");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
	    		requestDispatcher.include(request, response);
		}
		else if(name.equals("Lilly")) {
			// Create cookie object
			Cookie cookie1 = new Cookie("name", name);
			
			// Add cookie to the response object
			response.addCookie(cookie1);
			out.print("<h3>Cookies are created.</h3><p>Click on the button to get cookies.</p>");
			
			out.print("<form action='GetCookieServlet' method='POST'>");  
	        out.print("<input type='submit' value='Get Cookie'>");  
	        out.print("</form>");  
	        
	        out.close(); 
		}
	}

}
