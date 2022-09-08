package jDBCPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class MySql1 {

	public static void main(String[] args) throws Exception{
		/*
		 * 1. Load or register the driver- this should be done only once.
		 * 
		 * 2. Establish a connection.
		 * 
		 * 3. prepare and execute a statement.
		 * 
		 * 4. process the result.
		 * 
		 */
		
		// step 1.
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2.
		//DriverManager=(url,user id,password)  //url=protocol:database://ip address/dbname
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/August","root","root");
		
		System.out.println("connection...."+con);
		
		String sql="select * from Aliza";
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("UDI: "+rs.getInt(1)+" :Uname "+rs.getString(2)+" :city "+rs.getString(4));
		}
		
		System.out.println("........................................");
        sql="select * from Aliza where city='bombay'";
		
        stmt=con.createStatement();
		
		rs=stmt.executeQuery(sql);
		
		if(rs.next()) {
			System.out.println("UDI: "+rs.getInt(1)+" :Uname "+rs.getString(2)+" :city "+rs.getString(4));
		}
		else{
			System.out.println("no record found..");
		}
	}

}
