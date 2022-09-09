package basics;

public class TypeVariable {

	public static void main(String[] args) {
		//byte, short, long, int
		//float, double
		//char
		//boolean
		
		//valid range 
		byte b= 100;
		short s= 32767;
		int i= 2147483647; 
		long l= 922337569;
		
		//test the range
	//	b=-129; //it rejects
		b=127;  //it accepts
	//	b=128;  //it rejects
		b=-128; //it accepts
		
		
		//jdk 8 gave another special representation called _ (underscore)
		
		i=1_44_366 + 29_502;
		System.out.println(i);
		
		char c='a';
		c=97;
		c=65535;
		
		boolean boo=true;
		boo=false;
	//	boo=0; //invalid
	//	boo=1; //invalid
		
		String str="heloo...";
		str="haiii";		
	}

}
