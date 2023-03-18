package com.expertorion.democreditscorerest.repository;

public class User {
	private long id;
	private String username;
	private int expectedscore;
	private int actualscore;
		
	public User(long id, String username, int expectedscore, int actualscore) {
		super();
		this.id = id;
		this.username = username;
		this.expectedscore = expectedscore;
		this.actualscore = actualscore;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getExpectedscore() {
		return expectedscore;
	}
	public void setExpectedscore(int expectedscore) {
		this.expectedscore = expectedscore;
	}
	public int getActualscore() {
		return actualscore;
	}
	public void setActualscore(int actualscore) {
		this.actualscore = actualscore;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", expectedscore=" + expectedscore + ", actualscore="
				+ actualscore + "]";
	}	
}
