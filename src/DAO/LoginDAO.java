package DAO;

public class LoginDAO {
	public static boolean validate(String username, String password) {
		boolean t = false;
		if (username.equals("quang") && password.equals("quang")) {
			t = true;
		}
		return t;
	}

	public static boolean Null(String str) {
		boolean e = false;
		if (str.equals("")) {
			e = true;
		}
		return e;
	}

	public static boolean EqualsPassword(String matkhau, String nhaplaimatkhau) {
		boolean ss = false;
		if (matkhau.equals(nhaplaimatkhau)) {
			ss = true;
		}
		return ss;
	}
}
