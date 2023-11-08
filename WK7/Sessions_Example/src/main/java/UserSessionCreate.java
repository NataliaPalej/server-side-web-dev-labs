

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class UserSessionCreate
 */
@WebServlet("/UserSessionCreate")
public class UserSessionCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSessionCreate() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**​

session.setAttribute(“user”, loggedInUser);
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s = request.getSession();
		//creating user method
		User u = new User(request.getParameter("name"), request.getParameter("address"));
		s.setAttribute("user", u);
		
		
		//using Strings method
	//	s.setAttribute("name", request.getParameter("name"));
	//	s.setAttribute("address", request.getParameter("address"));

		
		request.getRequestDispatcher("middleMan.jsp").forward(request, response);
		
	}

}
