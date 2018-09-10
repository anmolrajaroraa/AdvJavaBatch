package com.advjava.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserDAO {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver"); //lazy
		//classA obj = new classA(); //eager
		//jdbc:postgresql:// server-name : server-port / database-name Note – NOTE: Default server port is 5432.
		//http://
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/webapp", "postgres", "EMgWi79A");
		if(connection!=null) {
			System.out.println("Connection created");
		}
		Scanner s = new Scanner(System.in);
		System.out.println("enter your userid");
		String userid = s.next();
		System.out.println("enter your password");
		String password = s.next();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select userid, password from user_details where userid = '"+userid+"' and password = '"+password+"'");
		                       // select userid, password from user_details where userid='andy' and password='1234';
		if(rs.next()) {
			System.out.println("Welcome User");
		}
		else {
			System.out.println("Invalid userid or password");
		}
		rs.close();
		statement.close();
		connection.close();
	} 
}
