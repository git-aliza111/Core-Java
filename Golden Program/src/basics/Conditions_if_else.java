package basics;

public class Conditions_if_else {

	public static void main(String[] args) {
		int i=10;
		String s="hello";
		boolean b=true;
		
		if(i>5)
		{
			System.out.println("i value is bigger than 5");
		}
		else
		{
			System.out.println("i value is smaller than 5");
		}
		
		//...................................................
		
		if(s.equals("hello"))
		{
			System.out.println("its hello");
		}
		else if(s.equals("haiii"))
		{
			System.out.println("its haiii");
		}
		else if(s.equals("world"))
		{
			System.out.println("its world");
		}
		else
		{
			System.out.println("its out of world");
		}
		
		//.....................................................
		
		if(b)
		{
			System.out.println("b value is true");
		}
			
	}

}
