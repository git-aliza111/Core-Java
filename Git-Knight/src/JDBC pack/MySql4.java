package jDBCPack;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class MySql4 {

	public static void main(String[] args) throws Exception{

		Class.forName("com.mysql.cj.jdbc.Driver");
	
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/August","root","root");
		
		System.out.println("connection...."+con);
	    con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
		System.out.println("For IRCTC");
		System.out.println(con.getTransactionIsolation());
		
    	con.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
		System.out.println("For Reservation Counter");
		System.out.println(con.getTransactionIsolation());
	    
		DatabaseMetaData dmd=con.getMetaData();
		System.out.println("For default database");
		System.out.println(dmd.getDefaultTransactionIsolation());
		
		System.out.println(dmd.getDatabaseProductName());
		System.out.println(dmd.getDriverName());
		System.out.println(dmd.getUserName());
		System.out.println(dmd.getDriverVersion());
	
		
		
	}
	
}
