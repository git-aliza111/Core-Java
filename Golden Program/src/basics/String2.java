package basics;

public class String2 {

	public static void main(String[] args) {
		int i=20;
		int temp=i;
		i=i+20;
		
		System.out.println(i);
		System.out.println(temp);
		
		String s="hello";
		//String s=new String("hello");
		
		String strTemp=s;
		//String strTemp=new String(s);
		
		s=s+"world";
		
		System.out.println(s);
		System.out.println(strTemp);
		
		int j=20;
		if(i==j)
		{
			
		}
		String x="hello";
		//String y="hello";
		String y=new String("hello");
		if(x==y)
		{
		System.out.println("both are equal");
		}
		else 
		{
			System.out.println("both are not equal");
		}
		System.out.println(x+":"+y);
		System.out.println("x hashcode..."+x.hashCode());
		System.out.println("y hashcode..."+y.hashCode());
		
		if(x.equals(y))
		{
			System.out.println("both are equal because their hashcodes are compared now");
		}
		
		if(x.equalsIgnoreCase(y))
		{
			System.out.println("equal even though the H is in upper case");
		}
		
		boolean boo=true;
		boolean boo2=true;
		if(boo==boo2)
		{
			System.out.println("trueee truee");
		}
	}

}
