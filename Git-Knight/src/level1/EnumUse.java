package level1;

public class EnumUse {

	public static void main(String[] args) {
		States Mystates=States.Bangalore;
		
		if(States.valueOf("Bangalore")==Mystates) {
			System.out.println("its bangalore");
		}

		switch(Mystates) {
		case Bangalore:{
			System.out.println("i m bangalorian");
			break; 
		}
		case kerela:{
			System.out.println("i m kerelian");
		}
		}
		
		States[] allstates=States.values();
		for(States s:allstates) {
		System.out.print(s+";");
		}
	}
}

 enum Fruits{
	 apple,pineapple,mango,banana,papaya;
 }