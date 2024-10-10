package com.OmTamang.webService.rest_web_service_for_rochpaperscissors.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Users {
	
	public Users (){
		
	}
	
	@Id
	@GeneratedValue
	private int id;
	
	private String userName;
	private int wins;
	private int loses;
	private int total_games_played;
	private int draws;
	
	public Users(int id, String userName, int wins, int loses, int total_games_played, int draws) {
		super();
		this.id = id;
		this.userName = userName;
		this.wins = wins;
		this.loses = loses;
		this.total_games_played = total_games_played;
		this.draws = draws;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLoses() {
		return loses;
	}
	public void setLoses(int loses) {
		this.loses = loses;
	}
	public int getTotal_games_played() {
		return total_games_played;
	}
	public void setTotal_games_played(int total_games_played) {
		this.total_games_played = total_games_played;
	}
	public int getDraws() {
		return draws;
	}
	public void setDraws(int draws) {
		this.draws = draws;
	}
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", userName=" + userName + ", wins=" + wins + ", loses=" + loses
				+ ", total_games_played=" + total_games_played + ", draws=" + draws + "]";
	}	
	
}
