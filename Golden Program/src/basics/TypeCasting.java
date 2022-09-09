package basics;

public class TypeCasting {

	public static void main(String[] args) {
		//byte,short,char,integer,long - number type
		//float,double  - floating type
		//boolean
		
		byte b=100;
		//automatic type promotion will happen, the b value is promoted automatically
		int n=b;
	//	char c=b;  //char cannot store a data type; But can store a number.
		short s=b;
		long l=b;
		
		//Reverse
		// n is of 32 bit,it cannot be stored in a lesser size variable.
		n=257;	
		b=(byte)n;
	//		s=n;
	//		n=l;
		System.out.println(b);
		
         byte b1=2;
         byte b2=10;
         b=(byte)(b1*b2);
         System.out.println(b);  //the result of a arithmetic operation will always be integer
         
         short ss=20;
         char c=(char)s;
         
         n=c;  //though char cannot hold integer,still integer can hold char
         
         float f=100;
         f=100.41f;  //when u give decimal no. it is compulsory to give 'f', otherwise it will not accept
         
         double d=242.52;
         
         n=(int)f; //when u cast float with int, then the decimal values will be trimmed
         System.out.println(n);
         
	}

}
