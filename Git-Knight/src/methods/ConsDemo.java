package methods;

public class ConsDemo {
     ConsDemo(){         //constructor
    	System.out.println("cons called..."); 
     }
     String ss;
   //String s
     ConsDemo(String s){
    	 System.out.println("cons called"+s);
    	 s=ss;
    //   this.s=s;
     }
     ConsDemo(String s,int n){
    	 System.out.println("cons called"+s+"...."+n);
     }
     public static void main(String[] args) {
        ConsDemo obj=new ConsDemo();
		System.out.println(".......");
    	 
		ConsDemo obj2=new ConsDemo("hello");
		
		ConsDemo obj3=new ConsDemo("hello",1000);
	}
     
     
}
