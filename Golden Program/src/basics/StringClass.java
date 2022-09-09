package basics;

import java.util.ArrayList;

public class StringClass {

	public static void main(String[] args) {
		
		//with new string- string object is created
		//without new string- only stack is used
		//string is a non mutable data type.
		String str="hello world";  // This will create a single memory allocation.
		String str2=new String("hello world");  //This will create a single memory allocation along with a object in heap
		
		int i=20;
		Integer ii=Integer.valueOf(20);   //complex types
		
		Integer iii=i; //auto boxing
		i=iii; //auto unboxing
		
		ArrayList al=new ArrayList();
		al.add(i);
		
		//we call this integer as wrapper class
		
		Float fff=new Float(20.9f);  //This is deppreated n jdk7
		Float ff=Float.valueOf(20.9f);
		
		int num=Integer.parseInt("20");   //it can convert a string to a number, provided that the string contains only number.
		
		System.out.println(Integer.max(20, 59));
		
		System.out.println(Integer.reverse(123));
		
	}

}
