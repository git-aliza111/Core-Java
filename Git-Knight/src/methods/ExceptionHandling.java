package methods;

public class ExceptionHandling {

	public static void main(String[] args) {
		
	System.out.println("before exception");
	try {
		int i=1/Integer.parseInt(args[0]);
		}catch(ArithmeticException ae){
	System.out.println(ae);	
	}catch(NumberFormatException ne) {
		System.out.println(ne);
	}catch(Exception e) {
		System.out.println("unknown execption");
	}
	finally {
		System.out.println("finally called.");
	}
		System.out.println("after exception");

	}

}
