import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	private String message;
	
	public void init() throws ServletException {
		// Do required initialization 
		message = "Hello World";
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter o = response.getWriter();
		o.println(message);
	}
	
	public void destroy() {
		
	}

}
