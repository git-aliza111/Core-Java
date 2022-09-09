package basics;

public class BreakLabel {

	public static void main(String[] args) {
		int i=20;
		
		firstLabel:
		{
			if(i<=20)
			{
				System.out.println("inside condition");
				
				secondLabel:
				{
				if(i>=20)
				{
					System.out.println("inside the next condition");
					
					ThirdLabel:
					{
						if(i==20)
						{
					       System.out.println("inside the third condition");
					       break secondLabel;
						}
						System.out.println("out of third label");
					}
				}
				System.out.println("out of second label");
    		}
		}
			System.out.println("out of first label");
	}
  }
}


