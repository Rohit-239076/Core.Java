package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.*;
public class DBUtils {
//add a method to return a database connection
	public static Connection openConnection() throws ClassNotFoundException, SQLException {
		// load typeIV jdbc driver(pure java)
		// Class.forName("com.mysql.cj.jdbc.Driver");
		// Class. maa chuda bhosdike
		// get the connection to DB
		// API: java.sql.DriverManager : class
		// method public static Connection getConnection
		// (String dbURL,String UserName,String pwd) throws SqlException
		String dbURL = "jdbc:mysql://localhost:3306/advjava?useSSL=false&allowPublicKeyRetrieval=true";
		return DriverManager.getConnection(dbURL, "root", "rupesh123");
	}
}
