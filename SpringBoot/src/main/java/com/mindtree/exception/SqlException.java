package com.mindtree.exception;

public class SqlException extends Exception{
	public SqlException(String s) throws ClassNotFoundException
	{
		System.out.println(s);
	}
}