package basics;

public class Revision {

	public static void main(String[] args) {
		int amt=1000;
		int money[]= {100,500,100,400,500,500};
		
		GreedyAlgoIbrahim obj=new GreedyAlgoIbrahim();
		obj.calculate(money, amt);

	}

}

class GreedyAlgoIbrahim
{
	public void calculate(int money[],int amount)
	{
		int highest=0; int next=0;
	    for(int i=0;i<money.length;i++) {
		int temp=money[i];
		if(i<money.length-1) {
		  next=money[i+1];
		}
       if(temp<=next) {
    	   highest=next;
       }
       else {
    	   highest=temp; 
	  }
       
	}
     
	   System.out.println("highest..."+highest); 
  }
}