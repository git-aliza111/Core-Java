package classesAndObjects;

public class Classobj6$OverRide {

	public static void main(String[] args) {
		
		MySuperClass obj=new MySuperClass();
		obj.met();
		
		MySubClass obj2=new MySubClass();
		obj2.met();
		
		MySuperClass obj3=new MySubClass();   // Child --> SubClass object can replace the Parent/Superclass reference
		obj3.metparentonly();
		obj3.met();
		
		Employee Em=new Engineer();
		Em.work();
		
	}

}

//Parent class and child class-- Little misleading way
//Super class and Sub class-- Correct way to address 

class MySuperClass{
public void metparentonly() {
	System.out.println("met parent only is called");
}
	public void met() {
	System.out.println("superclass met called");
 }
}
class MySubClass extends MySuperClass{    // By using the keyword EXTENDS--we make a inheritance/Generalization Relationship
	public void met()
	{
		System.out.println("subclass met is called");
	}
}

//rules of overriding
	//1. Can u change the parameter - You cannot change, because that will become another method
	//2. Can u change the method name - You cannot change, because that will become another method
	//3. Can u change the return type - No You cannot change....
	//4. Can u change the public/private/protected access specifiers - you cannot change (you cannot reduce the visibility)

class Employee{
	public void work() {
		System.out.println("works normally");
	}
}

class Engineer extends Employee{
	public void work() {
		System.out.println("works efficiently");
	}
	
}
