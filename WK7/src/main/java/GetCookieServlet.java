

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckCookie
 */
@WebServlet("/CheckCookie")
public class GetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCookieServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
    	PrintWriter out = response.getWriter();
		
    	try {
    		Cookie[] cookies = request.getCookies();
    		
    		for (Cookie c : cookies) {
    			if (c.getName().equals("name")) {
    				out.println("Cookie Name: " + c.getName());
    				out.println("Cookie Value: " + c.getValue());
    				out.println();
    			}
    		}
    		out.close();
    		} catch (Exception e) {
    			out.println("Some error occured");
    			e.printStackTrace();
    		}
    	}
}
