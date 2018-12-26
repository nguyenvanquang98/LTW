package controll;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class UpLoad
 */
@WebServlet("/ControllLab8")
public class ControllLab8 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllLab8() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uploadFolder = getServletContext().getRealPath("\\upload");
		String rs = null;
		boolean uploadCompleted = false;
		if (ServletFileUpload.isMultipartContent(request)) {
			try {
				List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
				for (FileItem fileItem : multiparts) {
					if (!fileItem.isFormField()) {
						String name = new File(fileItem.getName()).getName();
						File a = new File(uploadFolder);
						if (!a.exists())
							a.mkdir();
						fileItem.write(new File(uploadFolder + "/" + name));
						rs = name;
						uploadCompleted = true;
					}
				}
			} catch (Exception e) {
				request.setAttribute("message", "File Upload Failed" + e);
			}
		} else {
			request.setAttribute("message", "Sorry! Well done!");
		}
		if (uploadCompleted) {
			response.sendRedirect("upload/" + rs);
		} else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/lab/lab8.jsp");
			rd.forward(request, response);
		}

	}

}
