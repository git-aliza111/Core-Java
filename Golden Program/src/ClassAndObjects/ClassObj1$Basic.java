package classesAndObjects;

public class ClassObj1$Basic {

	public static void main(String[] args) {
     
	A obj=new A();
	System.out.println(obj);
		
	A obj2=null;
	System.out.println(obj2);
	
	obj2=obj;
	System.out.println(obj2);
	
	A obj3=new A("hello");
	System.out.println(obj3);
	
	A obj4=new A("hello",3141);
	System.out.println(obj4);
	
	
	}
	
}


class A
{
	//A class can have properties and Methods.
	//Constructor 
	A(){
		System.out.println("cons called...");
	}
	A(String s)
	{
		System.out.println("cons called..."+s);
	}
	A(String s,int i)
	{
		System.out.println("cons called..."+s+":"+i);
	}
}