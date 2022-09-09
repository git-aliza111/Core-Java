package basics;

public class WhileDOWhile {

	public static void main(String[] args) {
     int i=0;
     
     //post condition check...
     do {
    	 System.out.println("i is 0..."+i);
     }while(i>10);
     
     //pre condition check...
     while(i<10){
    	 System.out.println(i);
    	 i++;
     }
	}

}
