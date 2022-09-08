package Basics;

public class ConditionalOperator2 {

	public static void main(String[] args) {
		
		int num=10;
		
		//Ternary Method
		Boolean boo=(num%2==0);
		System.out.println(boo?"Even no..":"odd no..");
		
		//If else Method
		if(boo) {
			System.out.println("even no..");
		}
		else
			System.out.println("odd no..");
		
		//If Else If ladder
		int month=4;
		if(month==1) {
			System.out.println("its jan ree");
		}
		else if(month==3){
			System.out.println("its march baba");
		}
		else if(month==5) {
			System.out.println("its mayyy");
		}
		else {
			System.out.println("i dont know then");
		}
	}

}
