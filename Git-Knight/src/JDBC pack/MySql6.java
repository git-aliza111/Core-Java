package jDBCPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class MySql6 {

	public static void main(String[] args) throws Exception{

		Class.forName("com.mysql.cj.jdbc.Driver");
	
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/August","root","root");
		
		System.out.println("connection...."+con);
		
		String sql="insert into Aliza values(?,?,?,?,?)";
		PreparedStatement stmt=con.prepareStatement(sql);
		
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a id");
		int id=sc.nextInt();
		System.out.println("please enter a name");
		String name=sc.next();
		System.out.println("please enter a password");
		String pass=sc.next();
		System.out.println("please enter a city");
		String city=sc.next();
		int flag=0;
		
		stmt.setInt(1,id);
	    stmt.setString(2,name);
	    stmt.setString(3,pass);
	    stmt.setString(4,city);
	    stmt.setInt(5, flag);
	    int no=stmt.executeUpdate();
	    System.out.println(no+" : no. of records inserted");
		}
		
		
	}
	
}
