package ioPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;


public class IoDemo {
	
public static void main(String[] args) throws Exception {
	
	File file=new File("demo.file");
	System.out.println(file.canExecute());
	System.out.println(file.canRead()+":"+file.canWrite());
	System.out.println(file.getPath());
	System.out.println(file.getAbsolutePath());
	
	FileInputStream fis= new FileInputStream(file);
	
	FileReader fr=new FileReader(file);
   }
}

