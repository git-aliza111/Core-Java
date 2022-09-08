package ioPack;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

public class IoDemo1 {

	public static void main(String[] args) throws Exception {
	   URL url=new URL("https://www.google.com/index.html");
		
	   URLConnection urlcon=url.openConnection();
	   
	   BufferedInputStream bis=new BufferedInputStream(urlcon.getInputStream());
	   FileOutputStream fos=new FileOutputStream("google.html");	   
	   int c=0;
	   byte b[]=new byte[8];
	   while((c=bis.read(b))!=-1) {
		   String str=new String(b,0,c);
		   System.out.print(str);
		   fos.write(b,0,c);
	   }

	}

}
