package classesAndObjects;
/*
 * Abstract Class
 * 1. Whenever u have a classification,the classifier class will be abstract class.
 * 2. wherever you find common noun,then that is a classifier class
 * 3. we declare common nouns as abstract classes,because we cannot create objects for abstract classes
 * 4. Abstract classes can have abstract methods as well as non abstract methods
 * 5. Non abstract methods will be always declared as final  
 * 
*/

public class ClassObj$11Abstract {

	public static void main(String[] args) {
		paint rang=new redpaint();
       rang.sticky();
		rang.color();
	}

}

abstract class paint{
	abstract public void color() ;	
	public void sticky() {
		System.out.println("sticky liquid...");
	}	
}

class redpaint extends paint{
	@Override
	public void color() {
		System.out.println("red colorrr...");
	}
}
