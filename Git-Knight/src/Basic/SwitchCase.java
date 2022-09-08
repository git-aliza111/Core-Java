package Basics;

public class SwitchCase {

	public static void main(String[] args) {
	int month=2;
	switch(month%2) {
	case 0:{
		System.out.println("Even month");
		break;
	}
	case 1:{
		System.out.println("odd month");
		break;
	}
}
    
	switch(month) {
	case 1:{
		System.out.println("this is jan");
		break;
	}
	case 3:{
		System.out.println("this is feb");
		break;
	}
	case 2:{
		System.out.println("this is march..");
		break;
	}
	default:{
		System.out.println("i dont know i am sorry...very sorry...");
	}
  }
	
	char c='a';
	switch(c) {
	case 'a':{
		System.out.println("a for apple");
		break;
	}
	case 'b':{
			System.out.println("b for balll...");
		}
	case 'c':{
		System.out.println("c for cat...");
	}
	default:{
		System.out.println("change the alphabet then..");
	}
	}	
	
	String str="13 feb 2022";
	String m=str.substring(3,6);
	System.out.println(m);
	
	switch(m) {
	case "jan":{
		System.out.println("this is january month....");
		break;
	}
	case "feb":{
		System.out.println("this is feb month......");
		break;
	}
	default:{
		System.out.println("Yet to improve....");
	}
	}
 }
}
