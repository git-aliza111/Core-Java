package ioPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	Socket client;
	
	public Client() throws Exception{
		while(true) {
		client=new Socket("localhost",2000);
		
		BufferedReader read=new BufferedReader(new InputStreamReader(client.getInputStream()));
		String msgfromserver=read.readLine();
		System.out.println("message from server:"+msgfromserver);

		PrintWriter out=new PrintWriter(client.getOutputStream(),true);
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("type your message for server");
		String msgtosever=in.readLine();
		out.println(msgtosever);		
	 }
	}
	
	public static void main(String[] args) throws Exception{
		new Client();
	}
}
