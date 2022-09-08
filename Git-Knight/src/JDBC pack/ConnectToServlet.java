package jDBCPack;

import java.net.URL;
import java.net.URLConnection;

public class ConnectToServlet {

	public static void main(String[] args) throws Exception{

		URL url=new URL("http://localhost:2020/GoldenWeb/HelloServlet");
		
		URLConnection urlcon=url.openConnection();
		
		urlcon.getInputStream();
		
	}

}
