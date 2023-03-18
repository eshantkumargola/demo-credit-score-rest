package com.expertorion.democreditscorerest.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.expertorion.democreditscorerest.repository.User;

@Repository
public class UserScoreDao {
	
	private User user;
	
	private static List<User> users =new ArrayList<>();
	
	static {		
		users.add(new User(0,"eshant-g" , 1010 ,2999)); 
		users.add(new User(1,"nicolas-k", 1011 ,3999));
		users.add(new User(2,"gary-k"   , 1100 ,4999)); 
		users.add(new User(3,"martin-l" , 1101 ,4599));
	}

	public List<User> getUsers() {
		return users;
	}	
}
