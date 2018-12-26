package controll;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import DAO.DAOProduct;
import model.Product;
import model.ProductBox;

/**
 * Servlet implementation class DeleteLab5
 */
@WebServlet("/DeleteLab5")
public class DeleteLab5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteLab5() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("ID");
		int id1 = Integer.parseInt(id);
		List<ProductBox> li = DAOProduct.getListProductBox();
		for (int i = 0; i < li.size(); i++) {
			if (i == id1) {
				li.remove(li.get(i));
			}
		}
		response.sendRedirect("lab/CartLab5.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
