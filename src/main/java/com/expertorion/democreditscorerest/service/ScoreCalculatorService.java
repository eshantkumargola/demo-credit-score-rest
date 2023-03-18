package com.expertorion.democreditscorerest.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ScoreCalculatorService {

	public Mono<Integer> expectedScoreMono;
	public Mono<Integer> actualScoreMono; 
		
	@Autowired 
	UserCreditService userCreditService;
	
	@Autowired 
	private Logger logger;
	
	public Mono<Integer> getExpectedScore(int userid)
	{
		logger.info("USER ID received in ScoreCalculatorService.getExpectedScore() is : "+ userid);
		expectedScoreMono = Mono.just(userCreditService.getUserById(userid).getExpectedscore());		
		return expectedScoreMono;
	}	 
	 
	public Mono<Integer> getActualScore(int userid)
	{
		actualScoreMono = Mono.just(userCreditService.getUserById(userid).getActualscore());
		logger.info("USER ID received in CreditScoreController.getActualScore() is : "+ userid);
		return actualScoreMono;
	}
}
