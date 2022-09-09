package classesAndObjects;

public class ClassObj8$Static {

	public static void main(String[] args) {
	ClassRoom nehru=new ClassRoom();
	ClassRoom gandhi=new ClassRoom();

	}

}

//STATIC--- is called as class level variable or object- Static variable, methods are initialized by default by the JVM

class ClassRoom{
	Projector projector=new Projector();   //Instance variable
	static Toilet toilet=new Toilet();     //Class variable
}
class Projector{
	public Projector() {
	System.out.println("projector object created");
	}
}
class Toilet{
	public Toilet() {
	System.out.println("toilet object created");
	}
}