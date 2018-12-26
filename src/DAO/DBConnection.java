package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

import DAO.DBConnection;

public class DBConnection {
	public static Connection getConnection() {
		Connection cnn = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/personal";
		String user = "root";
		String pass = "141998";
		try {
			Class.forName(driver);
			cnn = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnn;
	}

	public static void main(String[] args) {
		Connection cnn = DBConnection.getConnection();
		if (cnn != null) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
	}
}
