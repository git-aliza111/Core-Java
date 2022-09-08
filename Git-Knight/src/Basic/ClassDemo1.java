package Basics;

public class ClassDemo1 {

	public static void main(String[] args) {
		ClassDemo1 obj=new ClassDemo1();
		
		Human obj1=new Female();                              
	}
 void met() {
	 System.out.println("heloo ji");
 }
}

class Human {
	String name="Alizaaa";
}
class Female extends Human{
          // INHERITANCE--KIND OF RELATIONSHIP..
}