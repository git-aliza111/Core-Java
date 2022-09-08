package ioPack;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class IoDemo2 {

	public static void main(String[] args) throws Exception {
	   URL url=new URL("http://www.Google.com/index.html");
		
	   URLConnection urlcon=url.openConnection();
	   
	   BufferedReader bis=new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
	   FileWriter fos=new FileWriter("google2.html");	   
	   int c=0;
	   char b[]=new char[8];
	   while((c=bis.read(b))!=-1) {
		   String str=new String(b,0,c);
		   System.out.print(str);
		   fos.write(b,0,c);
	   }
	   fos.close();

	}

}
