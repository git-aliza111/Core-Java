package jDBCPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class MySql7 {

	public static void main(String[] args) throws Exception{

		Class.forName("com.mysql.cj.jdbc.Driver");
	
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/August","root","root");
		
		System.out.println("connection...."+con);
	
	
		
	}
	
}
