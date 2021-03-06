package com.mindtree.services;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import com.mindtree.dao.DaoImplementation;
import com.mindtree.entity.Match;
import com.mindtree.entity.Team;
import com.mindtree.exception.FetchException;
import com.mindtree.exception.InvalidInputException;
import com.mindtree.exception.SqlException;
public class FootballMatchManager {
	public void Insertion(String ftn,String stn,String date,String ftg,String stg) throws ClassNotFoundException, SqlException, InvalidInputException
	{
		try {
	Match m= new Match();
	Team t1=new Team();
	Team t2=new Team();
	DaoImplementation d=new DaoImplementation();
	System.out.println("TEAM NAME        TEAMCITY");
	d.TeamDetails();
	String name="";
	boolean b=d.checkTeamName(ftn);
	if(b==false)
		throw new InvalidInputException("Team not present");
	t1.setTeamName(ftn);
	m.setFirstTeam(t1);
	b=d.checkTeamName(stn);
	if(b==false)
		throw new InvalidInputException("Team not present");
	t2.setTeamName(stn);
	m.setSecondTeam(t2);
	name+=date;
	
	try{
		SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy hh:mm");
		Date dt=format.parse(name);
		Timestamp ts=new Timestamp(dt.getTime());
		m.setMatchDate(ts);
		}
		catch(ParseException e)
		{
			throw new FetchException("Date format should be [DD-MM-YYYY HH:MM]");
		}
	m.setFirstTeamScore(Integer.parseInt(ftg));
	m.setSecondTeamScore(Integer.parseInt(stg));
	if(m.getFirstTeamScore()<0||m.getSecondTeamScore()<0)
	{
		throw new InvalidInputException("Invalid goal");
		
	}
	d.saveIntoMatches(m);
	}
	catch(InvalidInputException e)
	{}
	catch(FetchException e)
	{}
}
	public LinkedList display(String n) throws ClassNotFoundException, SqlException
	{
		LinkedList s=new LinkedList();
		try {
		DaoImplementation d=new DaoImplementation();
		Match m=new Match();
		System.out.println("Enter team name");
		//System.out.println("\n");
		//String n=sc.nextLine();
		boolean b=d.checkTeamName(n);
		Team t=new Team();
		if(b==true)
		{
			t.setTeamName(n);
			m.setFirstTeam(t);
			m.setSecondTeam(t);
			s=d.showFromMatches(m);
		}
		else
		{
			throw new FetchException("Team " +n +"doesn't exists");
		}
		
		}
		catch(FetchException e)
		{
			
		}
		return s;
	
	}}
