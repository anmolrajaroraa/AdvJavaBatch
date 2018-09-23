package com.advjava.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersDAO {
	Connection connection;
	boolean result;
	public boolean authenticate(String userid, String password) throws SQLException, ClassNotFoundException {
		runQuery(userid, password);
		return result;
		//		if(userid != null && password!= null) {
//			return true;
//		}
//			
//		
//		return false;
	}
	public void makeConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/webapp";
		connection = DriverManager.getConnection(url, "postgres", "EMgWi79A");
	}
	
	public void runQuery(String userid, String password) throws SQLException, ClassNotFoundException {
		makeConnection();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select userid, password from user_details where userid = '" + userid + "' and password = '" + password + "'");
		if(rs.next()) {
			result = true;
		}
		else {
			result = false;
		}
		rs.close();
		statement.close();
		connection.close();
	}
}
