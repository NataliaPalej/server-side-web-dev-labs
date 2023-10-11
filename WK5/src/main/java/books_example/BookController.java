package books_example;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookController
 */
@WebServlet("/BookController")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Book b = new Book("Crime and Punishment", "Fyodor Dostoevsky", 1866, "Novel");
		BookDAO.instance.saveBook(b);
		
		
		// Get book instances from BookDAO and store them in bookList
		List<Book> bookList = BookDAO.instance.bookList;
		
		// Get attributes from bookList
		request.setAttribute("bookList", bookList);
		// Forward the list to display books
		request.getRequestDispatcher("listBooks.jsp").forward(request, response);
	}

}
