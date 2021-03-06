package com.mindtree.dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Set;

import com.google.gson.Gson;
import com.mindtree.connection.Conn;
import com.mindtree.entity.Match;
import com.mindtree.exception.SqlException;

public class DaoImplementation extends Conn {
	Conn c=new Conn();
	public void TeamDetails() throws ClassNotFoundException, SqlException
	{
		try {
		Connection con=c.connector();
		String query="select * from teams";
		Statement sts=con.createStatement();
		
		ResultSet rs=sts.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getString(1)+ " " + rs.getString(2));
		}
		con.close();
		sts.close();
		}
		catch(SQLException e)
		{
			throw new SqlException("Wrong sql code");
		}
	}
	public boolean checkTeamName(String teamname) throws ClassNotFoundException, SqlException {
		try {
		Connection con=c.connector();
		String query="select * from teams where team_name=?";
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1, teamname);
		ResultSet rs=st.executeQuery();
		boolean value=rs.next();
		con.close();
		st.close();
		return value;
		}
		catch(SQLException e)
		{
			throw new SqlException("Wrong sql code");
		}
	}
	public void saveIntoMatches(Match m) throws ClassNotFoundException, SqlException	{
		try {
		Connection con=c.connector();
		String query= "insert into Matches(match_date,first_team_name,second_team_name,first_team_goals,second_team_goals) values (?,?,?,?,?)";
		PreparedStatement st=con.prepareStatement(query);
		st.setTimestamp(1, m.getMatchDate());
		st.setString(2, m.getFirstTeam().getTeamName());
		st.setString(3, m.getSecondTeam().getTeamName());
		st.setInt(4, m.getFirstTeamScore());
		st.setInt(5, m.getSecondTeamScore());
		st.executeUpdate();
		con.close();
		st.close();
		}
		catch(SQLException e)
		{
			throw new SqlException("Wrong sql code");
		}
	}
	public LinkedList showFromMatches(Match m) throws ClassNotFoundException, SqlException
	{
		
		try {
			//Gson g=new Gson();
		Connection con=c.connector();
	
		String query="select MATCH_DATE,SECOND_TEAM_NAME as opponent,FIRST_TEAM_GOALS as team1,SECOND_TEAM_GOALS as team2 from MATCHES where FIRST_TEAM_NAME=? union select MATCH_DATE,FIRST_TEAM_NAME as opponent,SECOND_TEAM_GOALS as team1,FIRST_TEAM_GOALS as team2 from MATCHES where SECOND_TEAM_NAME=? order by (team1-team2) desc , MATCH_DATE";
		PreparedStatement st=con.prepareStatement(query);
		//PreparedStatement st1=con.prepareStatement(query1);
		st.setString(1, m.getFirstTeam().getTeamName());
		st.setString(2,m.getSecondTeam().getTeamName());
		ResultSet rs=st.executeQuery();
		//ResultSet rs1=st1.executeQuery();
		//System.out.println("TEAM NAME :"+ (m.getFirstTeam().getTeamName()));
		//System.out.println("MATCH_DATE     -     OPPONENT-\t\tGOALS");
		LinkedList l=new LinkedList();
		while(rs.next())
		{
			//String dt=rs.getTimestamp(1).toString();
			Match m1=new Match(rs.getTimestamp(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
			l.add(m1);
		}
	//	String s=g.toJson(rs);
		//while(rs1.next()) {
			//System.out.println(rs1.getTimestamp(1)+" "+rs1.getString(2) + "-\t" + rs1.getInt(3)+ "-"+ rs1.getInt(4));
		//}
		con.close();
		st.close();
		rs.close();
		
		
		//System.out.println(s);
		return l;
	}
		catch(SQLException e)
		{
			throw new SqlException("Wrong sql code");
		}
		
			
			
		
}
}
