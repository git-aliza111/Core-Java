package Basics;

public class ConditionalOperators {

	public static void main(String[] args) {
	 
		//Ternary operator
		
		System.out.println(false?"sucess":"Failed");

		Boolean Boo=false;
		String result=Boo?"sucess":"Failure";
		System.out.println(result);
		
		int num=10%2;
		Boo=(num==0);
		result=Boo?"Even no..":"Odd no...";
		System.out.println(result);		
	}

}
