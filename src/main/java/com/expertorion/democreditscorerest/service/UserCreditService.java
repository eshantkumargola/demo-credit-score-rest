package com.expertorion.democreditscorerest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expertorion.democreditscorerest.dao.UserScoreDao;
import com.expertorion.democreditscorerest.repository.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserCreditService {
	
	@Autowired
	UserScoreDao userscoredao ;
	
	public User getUserById(int id){
		return userscoredao.getUsers().get(id);		
	}

}
