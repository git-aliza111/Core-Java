package ioPack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class IoDemo3 {

	public static void main(String[] args) throws Exception{
		IoDemo3 obj=new IoDemo3();
		Laddu myladdu=new Laddu();
		
		obj.writeobject(myladdu);
        System.out.println("before eating:"+myladdu.size);		
		myladdu.size=5;
		System.out.println("after eating:"+myladdu.size);
		
		myladdu=(Laddu)obj.readobject();
		
		System.out.println("after using time machine:"+myladdu.size);
	}
	public void writeobject(Object obj) throws Exception {
	FileOutputStream fos=new FileOutputStream("past.dat");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	
	oos.writeObject(obj);
	System.out.println("time is preserved ...momento is made..");
	}
	public Object readobject() throws Exception{
		FileInputStream fis=new FileInputStream("past.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		return ois.readObject();
		
	}
}

class Laddu implements Serializable{
	int size=10;
}