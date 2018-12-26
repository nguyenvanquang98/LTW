package controll;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutLab5
 */
@WebServlet("/LogoutLab5")
public class LogoutLab5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LogoutLab5() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session != null) {
			session.invalidate();
		}
		response.sendRedirect("lab/loginLab5.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("msgID") != null) {
			response.sendRedirect("lab/lab5.jsp");
		} else {
			response.sendRedirect("lab/loginLab5.jsp");
		}
	}

}
