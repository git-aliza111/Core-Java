package Basics;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("input a number");
		int a=sc.nextInt();
		System.out.println("input another number");
		int b=sc.nextInt();
		
		System.out.println("Total.."+(a+b));
		}

}
