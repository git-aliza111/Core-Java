package Basics;

public class ForLoop {

	public static void main(String[] args) {
	//	for(;;) {
	//	System.out.println("infinite for Loop");
	//	}
       
		for(int i=0;i<10;i++) {
    	   System.out.println(i);
       }
		//Nested For loop
		
		for(int i=0;i<=10;i++) {
		 for(int j=0;j<5;j++) {
			 System.out.print(j+" ");
		 }
		 System.out.println();
		}
	}

}
