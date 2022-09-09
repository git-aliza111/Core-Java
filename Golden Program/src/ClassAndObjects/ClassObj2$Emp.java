package classesAndObjects;

public class ClassObj2$Emp {

	public static void main(String[] args) {
		Emp emp=new Emp("rahim");    //What is needed for the mere survival of the object is initialized during construction time.
		System.out.println(emp.name);

	}

}

class Emp{
	String name;  //Instance variable
	public Emp(String name)  //local variable
	{
	this.name=name;  //this-keyword refers to the instance variable
	}
}