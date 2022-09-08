package utilPack;

import java.util.Enumeration;
import java.util.Properties;

public class PropDemo {

	public static void main(String[] args) {
   
		Properties prop=new Properties();
		
		prop.put("a1","hello jii");
		prop.put("a4","am finum fine");
		prop.put("a2","heyyy");
		prop.put("a3","how's uh");
 
		System.out.println(prop);
		
		Enumeration en=prop.elements();
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement() + " ");
		}
	}

}
