package basics;

public class EscapeSequence {

	public static void main(String[] args) {
		System.out.println("Hello\tworld");
		System.out.println("hello\nworld");
        System.out.println("hello \"world\" ");
        System.out.println("hello \'world\' ");
        System.out.println("hello \fworld ");     //prints every word on new page
        System.out.println("hello \bworld ");
        System.out.println("hello \r\nworld ");
        
        int i=0;
        while(true)
        {
        	System.out.print(++i+"\r");
        }

	}

}
