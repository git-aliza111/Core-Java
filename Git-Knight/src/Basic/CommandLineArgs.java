package Basics;

public class CommandLineArgs {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		
		int n1=Integer.parseInt(args[1]);
		int n2=Integer.parseInt(args[2]);
		
		System.out.println("addition.."+(n1+n2));
	}

}
