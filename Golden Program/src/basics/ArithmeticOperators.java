package basics;

public class ArithmeticOperators {

	public static void main(String[] args) {
	int i=10;  // 'equal to' is an assignment operator
	int j=2;
	
	//addition
	System.out.println("Addition.." +(i+j));
	
	//concatenation
	String s1="Hello";
	String s2="World";
	System.out.println("Concatenation.." + s1+" "+s2);
	//only + is overloaded with add and concat, not with others.
	
	//subtraction
	System.out.println("Subtraction...." +(i-j));

	//Multiplication
	System.out.println("Multilication..."+(i*j));
//	byte b1=2;
//	byte b2=2;
//	byte result=(int)(b1*b2);  //the result of arithmetic operation is always in integer.
	
	//Division- returns the quotient
	System.out.println("Division..."+(i/j));
	
	//mod- returns the remainder
	System.out.println("Remainder..."+(i%j));
	
	
	
	}

}
