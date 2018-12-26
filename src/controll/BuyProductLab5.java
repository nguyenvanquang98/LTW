package controll;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.DAOProduct;
import DAO.LoginDAO;
import model.ProductBox;

/**
 * Servlet implementation class BuyProductLab5
 */
@WebServlet("/BuyProductLab5")
public class BuyProductLab5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public BuyProductLab5() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		List<ProductBox> list = DAOProduct.getListProductBox();
		List<ProductBox> list1 = DAOProduct.listProductBox();

		if (session.getAttribute("msgID") == null) {
			response.sendRedirect("lab/loginLab5.jsp");
		} else {
			String index = request.getParameter("index");
			int index1 = Integer.parseInt(index);
			for (int i = 0; i < list1.size(); i++) {
				if (index1 == i) {
					list.add(list1.get(i));
				}
			}
			response.sendRedirect("lab/CartLab5.jsp");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String ID = request.getParameter("username");
		String pass = request.getParameter("password");

		session.setAttribute("msgID", ID);
		session.setAttribute("msgP", pass);

		boolean kt = LoginDAO.validate(ID, pass);
		if (kt) {

			response.sendRedirect("lab/lab5.jsp");

		} else {
			String msg4 = "Login failed , please login again !";
			ServletContext svt = request.getServletContext();
			svt.setAttribute("mesage4", msg4);

			response.sendRedirect("lab/loginLab5.jsp");
		}

	}

}
