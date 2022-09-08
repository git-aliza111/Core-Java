package Basics;

public class ArithmeticOperator2 {

	public static void main(String[] args) {
		int num1=10;
		int num2=5;
		
		//Relational operators
		//these operators will always return true or false
		
		Boolean boo=num1<num2;
		System.out.println(boo);

        System.out.println(num1>num2); //greater than
		
		System.out.println(num1>=num2); //greater than or equal to
		
		System.out.println(num1<=num2);  //lesser than or equal to
		
		System.out.println(num1>num2&&num1<11); //AND - both the expressions are true then it returns true
		//even if one condition fails it return false
		
		System.out.println(num1<num2 || num1==11);//OR - even if one of the expression returns true,
		//then the expression will return true
	}

}
