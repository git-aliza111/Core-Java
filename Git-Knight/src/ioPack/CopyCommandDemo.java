package ioPack;

import java.io.FileInputStream;

public class CopyCommandDemo {

	public static void main(String[] args) throws Exception {
	
		FileInputStream fis=new FileInputStream("demo.file");
		
		System.out.println(fis.available());
		
		int eof=-1;
		
		int n=0; byte b[]=new byte[fis.available()];
		
		while((n=fis.read(b))!=eof) {
			String s=new String(b,0,n);
			System.out.print(s);
		}
	}

}
