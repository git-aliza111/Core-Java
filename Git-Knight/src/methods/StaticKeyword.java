package methods;

class Parent {
int i=20;	
static void met(int i) {
	System.out.println("Parent met called");
}
}
public class StaticKeyword extends Parent{
	public StaticKeyword() {
	System.out.println("cons called");
	}

	static {
		System.out.println("code common for all static methods is written here....");
	}
	public static void main(String[] args) {
		//new StaticKeyword().met2();
		StaticKeyword.met(100);	
		StaticKeyword.met22();
		
	}
	
	int i=12;
	static void met(int i) {
		// Keyword - this, super cannot be used
		// Non static variables and methods cannot be referred here
		System.out.println("static method called."+i); // cannot use this in static context
		System.out.println(i);
	//	System.out.println(this.i);   // cannot use this in static context
	//	System.out.println(super.i);   // cannot use super in static context
		new StaticKeyword().i=20;
		i=10;
	//	met2();   // non static methods cannot be used in static methods
	}

	static void met22() {
		System.out.println("static met 22called");
	}
	
	void met2(int i) {
		System.out.println("non static method called");
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	
}
