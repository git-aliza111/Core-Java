package basics;

import java.util.Scanner;

public class Conditions_Switch_case {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a no.");
		
		int i=scan.nextInt();
				
		switch(i)
		{
		case 5:
		{
		System.out.println("the value is 5");
		break;
		}
		case 10:
		{
			System.out.println("the value is 10");
			break;
		}
		default:
		{
			System.out.println("the value is unkown...");
		}
		
	}
		
		char c='d';
		switch(c)
		{
		case 'd':
		{
		System.out.println("the value is d");
		break;
		}
		case 'e':
		{
			System.out.println("the value is e");
			break;
		}
		default:
		{
			System.out.println("the value is unkown...");
		}
		
	}
		
		String s="hola";
		switch(s)
		{
		case "hello":
		{
		System.out.println("the value is hello");
		break;
		}
		case "hola":
		{
			System.out.println("the value is hola");
			break;
		}
		default:
		{
			System.out.println("the value is unkown...");
		}
		
		}
		
		
  }

}
