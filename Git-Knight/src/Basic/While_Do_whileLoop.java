package Basics;

public class While_Do_whileLoop {

	public static void main(String[] args) {
		
	//	while(true) {   //pre condition check
	//		System.out.println("infinite loop");
	//	}
		
	//	do {
	//		System.out.println("infinite loop");
	//	}while(true); //post condition check
		
		
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
	}

}
