package classesAndObjects;

/*
 *This pattern is primarily used to eliminate if-else-if conditional blocks.
 * if-else-if should be used only in static conditions and not in dynamic conditions.
 * So to eliminate if-else-if in dynamic condition you can use STRATEGY PATTERN 
 */
public class ClassObj$13StratergyPattern {

	public static void main(String[] args) {
		Goodcolorbrush brush=new Goodcolorbrush();
		
		color P=new Bluecolor();
		color P1=new Redcolor();
		//dependency injection
       brush.P=P;
       
       brush.docolor();
	}

}

/*
 * The below paint brush is open for modification but closed for extension
 * so the solution is to-make this closed for modification and open for extension
 * STEPS for implementing STRATEGY PATTERN
 * 1. Remove the if-else-if statements from the code.
 * 2. Convert the condition to classes
 * 3. Group them under a common hierarchy
 * 4. Create a association between the hierarchial class and the using class
 */

class colorBrush{
	public void docolor(int c) {
		if(c==1) {
			System.out.println("red colorrrr");
		}
		else if(c==2){
			System.out.println("white colorr");
		}
		else {
			System.out.println("green colorrr");
		}
	}
}

class Goodcolorbrush{
	color P;
	public void docolor() {
		System.out.println(P);
	}
}
abstract class color{
	
}
class Redcolor extends color{
	
}
class Bluecolor extends color{
	
}
class Greencolor extends color{
	
}