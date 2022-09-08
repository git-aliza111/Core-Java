package jDBCPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class MySql3 {

	public static void main(String[] args) throws Exception{

		Class.forName("com.mysql.cj.jdbc.Driver");
	
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/August","root","root");
		
		System.out.println("connection...."+con);
		

		String sql="create table department (did int(5),dname varchar(40))";
		String sql2="insert into department values (1,'purchase')";
		String sql22="insert into department values (2,'sales')";
		String sql3="delete from department where did=2";
		
		Statement stmt=con.createStatement();
		
//		System.out.println(stmt.executeUpdate(sql));
		System.out.println(stmt.executeUpdate(sql2));
		System.out.println(stmt.executeUpdate(sql22));
		System.out.println(stmt.executeUpdate(sql3));
		
		
		
	}
	
}
