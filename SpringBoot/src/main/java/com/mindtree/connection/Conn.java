package com.mindtree.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mindtree.exception.SqlException;


public class Conn {
	protected Connection con;
	public Connection connector() throws SqlException, ClassNotFoundException
	{
	try {	
	String username="root";
	String password="Welcome123";
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/football",username,password);
	return con;
	}
	
	catch(SQLException s)
	{
		throw new SqlException("Database not Found");
	}
	
	}
}
