package DAO;

public class Lab3DAO {
	public static boolean CheckMail(String email) {
		boolean checkmail = true;
		if (email.equals("")) {
			checkmail = false;
		}
		return checkmail;
	}

	public static boolean EqualsPass(String pass, String repass) {
		boolean sspass = false;
		if (pass.equals(repass)) {
			sspass = true;
		}
		return sspass;
	}
	public static boolean Null(String str) {
		boolean nul = false;
		if(str.equals("")) {
			nul = true;
		}
		return nul;
	}
}
