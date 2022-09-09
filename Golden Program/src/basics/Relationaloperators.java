package basics;

public class Relationaloperators {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		
		boolean result=(i==j); //comparison
        System.out.println(result);
        
        System.out.println(i<j);
        System.out.println(i>j);
        System.out.println(i!=j);
        System.out.println(i<=j);
        System.out.println(i>=j);
        
        if(result)
        {
        	
        }
        
        if(i==j)
        {
        	
        }
        
        if(true)
        {
        	
        }
        
        result=i<=j && i==10;   //both should satisfy
        System.out.println(result);
        
        result=i<j || i==20;   //either or
        System.out.println(result);
        
	}

}
