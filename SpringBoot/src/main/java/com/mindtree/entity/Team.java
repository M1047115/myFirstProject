package com.mindtree.entity;

public class Team {
private String teamId;
private String teamName;
public String getTeamId() {
	return teamId;
}
public void setTeamId(String teamId) {
	this.teamId = teamId;
}
public String getTeamName() {
	return teamName;
}
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
public Team(String teamId, String teamName) {
	super();
	this.teamId = teamId;
	this.teamName = teamName;
}
public Team() {}
}
