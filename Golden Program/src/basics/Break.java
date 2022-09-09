package basics;

public class Break {

	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			System.out.println("the loop started..."+i);
		    if(i==5)
		    {
		    	break;
		    }
		}
		for(int i=0;i<10;i++)
		{
			if(i%2==1)
			{
				System.out.println("the loop started..."+i);
				break;
			}
		}

	}

}
