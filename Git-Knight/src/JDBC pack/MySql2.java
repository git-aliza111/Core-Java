package jDBCPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class MySql2 {

	public static void main(String[] args) throws Exception{

		Class.forName("com.mysql.cj.jdbc.Driver");
	
	    Connection con=DriverManager.getConnection("jdbc:mysql:st/August","root","root");
		//localho
		System.out.println("connection...."+con);
		
		
	//	String sql="insert into Aliza values (2,'mohan','mohu','mumbai',0)";
		String sql="insert into Aliza values (3,'moha','mohu111','highway',1)";
		Statement stmt=con.createStatement();
		int no=stmt.executeUpdate(sql);
        System.out.println("no of recoreds updated....."+no);
		
		
	}
	
}
