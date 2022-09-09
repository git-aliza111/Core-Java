package classesAndObjects;

public class ClassObj9$LifeCycle {

	public static void main(String[] args) {
    LifeCycle.met();
    LifeCycle.met2();
    
    new LifeCycle();
	}
}

class LifeCycle{
	static {
		System.out.println("static called....");
	}
	public LifeCycle() {
	System.out.println("cons called.......");
	}
	public static void met() {
		System.out.println("met called...");
	}
	public static void met2() {
		System.out.println("met 2 called....");
	}
}