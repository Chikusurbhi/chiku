package com.cg.hr.core.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cg.hr.core.exceptions.Empexception;

public class JDBCUtil 
{
	private Connection connect;
	
	public JDBCUtil() throws Empexception {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			String userName="system";
			String password="Capgemini123";
			connect = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException | SQLException e) {
			throw new Empexception("Wrong in JDBCUtil",e);
		}
	}

	public Connection getConnect() {
		return connect;
	}
	

}
