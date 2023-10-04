import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class CreateBookServlet
 */

@WebServlet("/BookControllerServlet")
public class BookControllerServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		// Get the "name" parameter from FORM
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		
		// Create new User object
		Book book = new Book(title, author);
		
		// Add model as an attribute in the request
		request.setAttribute("book", book);
		
		//Forward updated request and response to ShowUser View
		request.getRequestDispatcher("ShowBook.jsp").forward(request, response);
	}
}


