package controll;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.Lab3DAO;
import model.Member;

@WebServlet("/controllLab3")
public class controllLab3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public controllLab3() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String repass = request.getParameter("repass");
		String name = request.getParameter("name");
		String day = request.getParameter("day");
		String month = request.getParameter("month");
		String year = request.getParameter("year");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		String yourphone = request.getParameter("yourphone");
		String quocgia = request.getParameter("quocgia");
		String tinhthanh = request.getParameter("tinhthanh");
		String quanhuyen = request.getParameter("quanhuyen");
		String diachinha = request.getParameter("diachinha");

		boolean checkmail = Lab3DAO.CheckMail(email);
		boolean sspass = Lab3DAO.EqualsPass(pass, repass);
		boolean nul1 = Lab3DAO.Null(name);
		boolean nul2 = Lab3DAO.Null(phone);
		boolean nul3 = Lab3DAO.Null(pass);

		Member mb = new Member(email, pass, repass, name, day, month, year, gender, phone, yourphone, quocgia,
				tinhthanh, quanhuyen, diachinha);
		String email1 = mb.getEmail();
		String pass1 = mb.getPass();
		String repass1 = mb.getRepass();
		String name1 = mb.getName();
		String gender1 = mb.getGender();
		String phone1 = mb.getPhone();
		String yourphone1 = mb.getYourphone();
		String day1 = mb.getDay();
		String month1 = mb.getMonth();
		String year1 = mb.getYear();
		String quocgia1 = mb.getQuocgia();
		String tinhthanh1 = mb.getTinhthanh();
		String quanhuyen1 = mb.getQuanhuyen();
		String diachinha1 = mb.getDiachinha();

		ServletContext svt = request.getServletContext();
		svt.setAttribute("email1", email1);
		svt.setAttribute("pass1", pass1);
		svt.setAttribute("repass1", repass1);
		svt.setAttribute("name1", name1);
		svt.setAttribute("gender1", gender1);
		svt.setAttribute("phone1", phone1);
		svt.setAttribute("yourphone1", yourphone1);
		svt.setAttribute("day1", day1);
		svt.setAttribute("month1", month1);
		svt.setAttribute("year1", year1);
		svt.setAttribute("quocgia1", quocgia1);
		svt.setAttribute("tinhthanh1", tinhthanh1);
		svt.setAttribute("quanhuyen1", quanhuyen1);
		svt.setAttribute("diachinha1", diachinha1);

		session.setAttribute("email1", email1);
		session.setAttribute("pass", pass);
		session.setAttribute("name", name);
		session.setAttribute("gender", gender);
		session.setAttribute("phone", phone);
		session.setAttribute("yourphone", yourphone);
		session.setAttribute("day", day);
		session.setAttribute("month", month);
		session.setAttribute("year", year);
		session.setAttribute("quocgia", quocgia);
		session.setAttribute("tinhthanh", tinhthanh);
		session.setAttribute("quanhuyen", quanhuyen);
		session.setAttribute("diachinha", diachinha);

		// start if
		if (checkmail == true) {
			if (sspass == true) {
				if (nul1 == false && nul2 == false) {
					if (nul3 == false) {
						response.sendRedirect("lab/lab3Access.jsp");
					} else {
						String msgMatkhau = "Mật khẩu không được để trống";
						svt.setAttribute("msg3", msgMatkhau);
						response.sendRedirect("lab/bab3.jsp");
					}
				} else {
					if (nul1 == true && nul2 == true) {
						if (nul3 == false) {
							String msgSDT = "Số điện thoại không được để trống";
							String msgHVT = "Họ và tên không được để trống";
							svt.setAttribute("msg2", msgSDT);
							svt.setAttribute("msg1", msgHVT);
							response.sendRedirect("lab/lab3.jsp");
						} else {
							String msgSDT = "Trường số điện thoại không được để trống";
							String msgHVT = "Trường họ và tên không được để trống";
							String msgMatkhau = "Trường mật khẩu không được để trống";
							svt.setAttribute("msg2", msgSDT);
							svt.setAttribute("msg1", msgHVT);
							svt.setAttribute("msg3", msgMatkhau);
							response.sendRedirect("lab/lab3.jsp");
						}
					} else {
						if (nul1 == true && nul2 == false) {
							if (nul3 == false) {
								String msgHVT = "Họ và tên không được để trống";
								svt.setAttribute("msg1", msgHVT);
								response.sendRedirect("lab/lab3.jsp");
							} else {
								String msgHVT = "Họ và tên không được để trống";
								String msgMatkhau = "Mật khẩu không được để trống";
								svt.setAttribute("msg1", msgHVT);
								svt.setAttribute("msg3", msgMatkhau);
								response.sendRedirect("lab/lab3.jsp");
							}
						} else {
							if (nul3 == false) {
								String msgSDT = "Số điện thoại không được để trống";
								svt.setAttribute("msg2", msgSDT);
								response.sendRedirect("lab/lab3.jsp");
							} else {
								String msgSDT = "Số điện thoại không được để trống";
								String msgMatkhau = "Mật khẩu không được để trống";
								svt.setAttribute("msg2", msgSDT);
								svt.setAttribute("msg3", msgMatkhau);
								response.sendRedirect("lab/lab3.jsp");
							}
						}
					}
				}
			} else {
				if (nul1 == false && nul2 == false) {
					String msgMatkhau1 = "Mật khẩu không trùng khớp vui lòng nhập lại";
					svt.setAttribute("msg5", msgMatkhau1);
					response.sendRedirect("lab/lab3.jsp");

				} else {
					if (nul1 == true && nul2 == true) {
						String msgMatkhau1 = "Mật khẩu không trùng khớp vui lòng nhập lại";
						String msgSDT = "Trường số điện thoại không được để trống";
						String msgHVT = "Trường họ và tên không được để trống";
						svt.setAttribute("msg2", msgSDT);
						svt.setAttribute("msg1", msgHVT);
						svt.setAttribute("msg5", msgMatkhau1);
						response.sendRedirect("lab/lab3.jsp");

					} else {
						if (nul1 == true && nul2 == false) {
							String msgMatkhau1 = "Mật khẩu không trùng khớp vui lòng nhập lại";
							String msgHVT = "Họ và tên không được để trống";
							svt.setAttribute("msg1", msgHVT);
							svt.setAttribute("msg5", msgMatkhau1);
							response.sendRedirect("lab/lab3.jsp");
						} else {
							if (nul1 == false && nul2 == true) {
								String msgMatkhau1 = "Mật khẩu không trùng khớp vui lòng nhập lại";
								String msgSDT = "Số điện thoại không được để trống";
								svt.setAttribute("msg2", msgSDT);
								svt.setAttribute("msg5", msgMatkhau1);
								response.sendRedirect("lab/lab3.jsp");
							}
						}
					}
				}
			}
		} else {
			if (sspass == true) {
				if (nul1 == false && nul2 == false) {
					if (nul3 == false) {
						String msgEmail = "Email không được để trống";
						svt.setAttribute("msg4", msgEmail);
						response.sendRedirect("LabWeb/Lab3.jsp");
					} else {
						String msgEmail = "Email không được để trống";
						String msgMatkhau = "Mật khẩu không được để trống";
						svt.setAttribute("msg4", msgEmail);
						svt.setAttribute("msg3", msgMatkhau);
						response.sendRedirect("lab/lab3.jsp");
					}
				} else {
					if (nul1 == true && nul2 == true) {
						if (nul3 == false) {
							String msgEmail = "Email không được để trống";
							String msgSDT = "Số điện thoại không được để trống";
							String msgHVT = "Họ và tên không được để trống";
							svt.setAttribute("msg4", msgEmail);
							svt.setAttribute("msg2", msgSDT);
							svt.setAttribute("msg1", msgHVT);
							response.sendRedirect("lab/lab3.jsp");
						} else {
							String msgEmail = "Email không được để trống";
							String msgSDT = "Số điện thoại không được để trống";
							String msgHVT = "Họ và tên không được để trống";
							String msgMatkhau = "Mật khẩu không được để trống";
							svt.setAttribute("msg4", msgEmail);
							svt.setAttribute("msg2", msgSDT);
							svt.setAttribute("msg1", msgHVT);
							svt.setAttribute("msg3", msgMatkhau);
							response.sendRedirect("lab/lab3.jsp");
						}
					} else {
						if (nul1 == true && nul2 == false) {
							if (nul3 == false) {
								String msgEmail = "Email không được để trống";
								String msgHVT = "Họ và tên không được để trống";
								svt.setAttribute("msg4", msgEmail);
								svt.setAttribute("msg1", msgHVT);
								response.sendRedirect("lab/lab3.jsp");
							} else {
								String msgEmail = "Email không được để trống";
								String msgHVT = "Họ và tên không được để trống";
								String msgMatkhau = "Mật khẩu không được để trống";
								svt.setAttribute("msg4", msgEmail);
								svt.setAttribute("msg1", msgHVT);
								svt.setAttribute("msg3", msgMatkhau);
								response.sendRedirect("lab/lab3.jsp");
							}
						} else {
							if (nul3 == false) {
								String msgEmail = "Email không được để trống";
								String msgSDT = "Số điện thoại không được để trống";
								svt.setAttribute("msg4", msgEmail);
								svt.setAttribute("msg2", msgSDT);
								response.sendRedirect("lab/lab3.jsp");
							} else {
								String msgEmail = "Email không được để trống";
								String msgSDT = "Số điện thoại không được để trống";
								String msgMatkhau = "Mật khẩu không được để trống";
								svt.setAttribute("msg4", msgEmail);
								svt.setAttribute("msg2", msgSDT);
								svt.setAttribute("msg3", msgMatkhau);
								response.sendRedirect("lab/lab3.jsp");
							}
						}
					}
				}
			} else {
				if (nul1 == false && nul2 == false) {
					String msgMatkhau1 = "Mật khẩu không trùng khớp vui lòng nhập lại";
					String msgEmail = "Email không được để trống";
					svt.setAttribute("msg5", msgMatkhau1);
					svt.setAttribute("msg4", msgEmail);
					response.sendRedirect("lab/lab3.jsp");
				} else {
					if (nul1 == true && nul2 == true) {
						String msgMatkhau1 = "Mật khẩu không trùng khớp vui lòng nhập lại";
						String msgEmail = "Email không được để trống";
						String msgSDT = "Số điện thoại không được để trống";
						String msgHVT = "Họ và tên không được để trống";
						svt.setAttribute("msg2", msgSDT);
						svt.setAttribute("msg4", msgEmail);
						svt.setAttribute("msg1", msgHVT);
						svt.setAttribute("msg5", msgMatkhau1);
						response.sendRedirect("lab/lab3.jsp");
					} else {
						if (nul1 == true && nul2 == false) {
							String msgMatkhau1 = "Mật khẩu không trùng khớp vui lòng nhập lại";
							String msgEmail = "Email không được để trống";
							String msgHVT = "Họ và tên không được để trống";
							svt.setAttribute("msg4", msgEmail);
							svt.setAttribute("msg1", msgHVT);
							svt.setAttribute("msg5", msgMatkhau1);
							response.sendRedirect("lab/lab3.jsp");
						} else {
							if (nul1 == false && nul2 == true) {
								String msgMatkhau1 = "Mật khẩu không trùng khớp vui lòng nhập lại";
								String msgEmail = "Email không được để trống";
								String msgSDT = "Số điện thoại không được để trống";
								svt.setAttribute("msg4", msgEmail);
								svt.setAttribute("msg5", msgMatkhau1);
								svt.setAttribute("msg2", msgSDT);
								response.sendRedirect("lab/lab3.jsp");
							}
						}
					}
				}
			}
		}
		// the end if
		session.getCreationTime();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}
