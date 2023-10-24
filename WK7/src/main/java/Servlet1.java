

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession s = request.getSession();
		
		// Create new user
		User u = new User("Lilly", "Cushla", "Village", "Athlone", "4323 3232 4343 4343", "443", "2024");
		
		
		// Get user parameters
		User u1 = new User(request.getParameter("name"), request.getParameter("address"), request.getParameter("addressLine1"),
				request.getParameter("addressLine2"), request.getParameter("card"), request.getParameter("ccv"), request.getParameter("expiry"));
		// Pass the actual user s.setAttribute("user", u1);
		// In index file:
		// <c:out value="${sessionScope.user.name}"/>
		// <c:out value="${sessionScope.user.address}"/>
		// session.user.getname
		// session.user.getaddress
		
		
		// Get all parameters 
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String addressLine1 = request.getParameter("addressLine1");
		String addressLine2 = request.getParameter("addressLine2");
		String card = request.getParameter("card");
		String ccv = request.getParameter("ccv");
		String expiry = request.getParameter("expiry");
				
		
		if (name.equals("") || name == null) {
			name = "Unknown Name";
		}
		if (address.equals("") || address == null) {
			address = "Unknown Address";
		}
		if (addressLine1.equals("") || addressLine1 == null) {
			addressLine1 = " ";
		}
		if (addressLine2.equals("") || addressLine2 == null) {
			addressLine2 = " ";
		}
		if (card.equals("") || card == null) {
			card = "Unknown Card Number";
		}
		if (ccv.equals("") || ccv == null) {
			ccv = "Unknown Card Number";
		}
		if (expiry.equals("") || expiry == null) {
			expiry = "Unknown Card Number";
		}
		
		//s.setAttribute("user", u);
		request.getRequestDispatcher("PrintData.jsp").forward(request, response);
	}

}
