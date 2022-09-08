package level1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ReflectionDemo {

	public static void main(String[] args)  throws Exception{
	policestation ps=new policestation();
	Doctor doc=new Doctor();
	Politician pol=new Politician();
    ps.arrest(pol);
   // ps.arrest(doc);
	}

}

class policestation{
	public void arrest(Object obj) throws Exception {
		Class c=obj.getClass();
		Field field=c.getField("name");
		System.out.println(field.get(obj));
		
		Method method=c.getMethod("service");
		method.invoke(obj);
		
		//special room--torture room
		
		field=c.getDeclaredField("secret");
		field.setAccessible(true);
		System.out.println(field.get(obj));
		
		method=c.getDeclaredMethod("secretservice");
		method.setAccessible(true);
		method.invoke(obj);
		
		method=c.getDeclaredMethod("secretservice",new Class[] {String.class});
		method.setAccessible(true);
		method.invoke(obj,new Object[] {"billu bhaii"});
		
	}
	
}

class Doctor{
	
}
class Politician{
	public String name="i am a good politician";
	private String secret="i m rowdyyy";
	
	public void service() {
		System.out.println("i do public service");
	}
	private void secretservice() {
		System.out.println("i do secret service....heheeheh");
	}
	private String secretservice(String s) {
		System.out.println("secret service order from..."+s);
		return "swahaa...";
	}
	
}