

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Forms wth Servlet", urlPatterns = { "/HelloFormsServlet" })
public class HelloFormsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloFormsServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		
		// Get the parameter from the form 
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		p.println("<h2>Hello " + name + " from " + city + ".</h2>");
		p.close();
	}

}
