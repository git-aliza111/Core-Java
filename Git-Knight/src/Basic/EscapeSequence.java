package Basics;

public class EscapeSequence {

	public static void main(String[] args) {
		System.out.println("Hello \"Knightangle\" Batch");

		System.out.println("Hello \'Knightangle\' Batch");
		
		System.out.println("Hello \t\t\tKnightangle\t\t\t Batch");
		
		System.out.println("Hello \nKnightangle\nBatch");
		
		System.out.println("Hello \fKnightangle\f Batch");
		
		System.out.println("Hello\bKnightangle Batch");  // \b-backspace
		
		System.out.println("Hello \rKnightangle\r Batch");
		
		int count=0;
		while(true) {
			System.out.print(count++ +"\r");
		}
	}

}
