package com.expertorion.democreditscorerest.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expertorion.democreditscorerest.service.ScoreCalculatorService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cs")
public class CreditScoreController {
	
	@Autowired 
	private ScoreCalculatorService scoreService; 
	
	@Autowired 
	private Logger logger;
	
	private Flux<Integer> scoreFlux;
	
	@GetMapping(path="/get-score/{userid}")
	public Flux<Integer> getScore(@PathVariable int userid){
		Mono<Integer> expectedScore = scoreService.getExpectedScore(userid);
		Mono<Integer> actualScore   = scoreService.getActualScore(userid);
		
		scoreFlux = Flux.merge(expectedScore, actualScore);
		
		logger.info(" RESULTANT FLUX from "+getClass()+" is "+scoreFlux);
		return scoreFlux;
	}
}
