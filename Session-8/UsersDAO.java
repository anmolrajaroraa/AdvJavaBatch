package com.advjava.dao;

public class UsersDAO {
	public boolean authenticate(String userid, String password) {
		if(userid != null && password!= null) {
			return true;
		}
			
		
		return false;
	}
}
