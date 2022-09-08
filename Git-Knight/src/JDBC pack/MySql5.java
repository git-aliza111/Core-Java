package jDBCPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class MySql5 {

	public static void main(String[] args) throws Exception{

		Class.forName("com.mysql.cj.jdbc.Driver");
	
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/August","root","root");
		
		System.out.println("connection...."+con);
		con.setAutoCommit(false);
		
        String sql="update Aliza set flag=3";
		Scanner sc=new Scanner(System.in);
		Statement stmt=con.createStatement();
		
		stmt.executeUpdate(sql);
		
		System.out.println("press 0 to commit or 1 to roll back");
		
		int n=sc.nextInt();
		
		if(n==0) {
			con.commit();
		}
		else {
			con.rollback();
		}
	}
	
}
