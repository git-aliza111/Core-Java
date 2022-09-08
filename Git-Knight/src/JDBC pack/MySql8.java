package jDBCPack;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Types;

public class MySql8 {

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/August","root","root");
		
		System.out.println("connection...."+con);
		
		CallableStatement cs=con.prepareCall("{call proc1()}");
		
		int n=cs.executeUpdate();
		System.out.println("updated:"+n);
		
		cs=con.prepareCall("{call proc3(?,?)}");
		cs.setString(1,"gitaa");
		cs.setInt(2,3);
		
		int n1=cs.executeUpdate();
		System.out.println("updated......."+n1);
		
		CallableStatement cs1=con.prepareCall("{call proc4(?,?)}");
		cs1.setString(1,"yasir");
		
		cs1.registerOutParameter(2,Types.INTEGER);
		boolean b=cs1.execute();
		System.out.println("result....."+b);
		
		int flag=cs1.getInt(2);
		System.out.println("the flag value....."+flag);
		
		Statement st=con.createStatement();
		b=st.execute("select * from Aliza");
		System.out.println("execute statement ....."+b);
		
		
	}

}
