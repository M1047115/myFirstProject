package com.mindtree.entity;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Match {
private int matchId;
private Timestamp matchDate;
private int firstTeamScore;
private int secondTeamScore;
private Team firstTeam;
private Team secondTeam;
public Match(int matchId, Timestamp matchDate, int firstTeamScore, int secondTeamScore, Team firstTeam, Team secondTeam) {
	super();
	this.matchId = matchId;
	this.matchDate = matchDate;
	this.firstTeamScore = firstTeamScore;
	this.secondTeamScore = secondTeamScore;
	this.firstTeam = firstTeam;
	this.secondTeam = secondTeam;
}
public Match() {}
public Match(Timestamp timestamp, String string, int int1, int int2) {
	// TODO Auto-generated constructor stub
	Team t=new Team();
	t.setTeamName(string);
	this.matchDate=timestamp;
	this.firstTeam= t;
	this.firstTeamScore=int1;
	this.secondTeamScore=int2;
}
public int getMatchId() {
	return matchId;
}
public void setMatchId(int matchId) {
	this.matchId = matchId;
}
public Timestamp getMatchDate() {
	return matchDate;
}
public void setMatchDate(Timestamp matchDate) {
	this.matchDate = matchDate;
}
public int getFirstTeamScore() {
	return firstTeamScore;
}
public void setFirstTeamScore(int firstTeamScore) {
	this.firstTeamScore = firstTeamScore;
}
public int getSecondTeamScore() {
	return secondTeamScore;
}
public void setSecondTeamScore(int secondTeamScore) {
	this.secondTeamScore = secondTeamScore;
}
public Team getFirstTeam() {
	return firstTeam;
}
public void setFirstTeam(Team firstTeam) {
	this.firstTeam = firstTeam;
}
public Team getSecondTeam() {
	return secondTeam;
}
public void setSecondTeam(Team secondTeam) {
	this.secondTeam = secondTeam;
}

}

