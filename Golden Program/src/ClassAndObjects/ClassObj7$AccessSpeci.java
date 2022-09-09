package classesAndObjects;

public class ClassObj7$AccessSpeci {
	private int pri;
	protected int pro;
	int nomod;
	public int pub;
	
	public void met() {
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(nomod);
		System.out.println(pub);
	}
}
//same package same class.
class AccessDemo{
	
}
	


//same package sub class
class AccessDemo2 extends ClassObj7$AccessSpeci{
	public void met() {
//		System.out.println(pri);  //private cannot be accessed outside the class---Private is class scope
		System.out.println(pro);
		System.out.println(nomod);
		System.out.println(pub);
	}	
}

//Same package Non sub class
class AccessDemo3 {
	ClassObj7$AccessSpeci obj=new ClassObj7$AccessSpeci();
	public void met2() {
//		System.out.println(obj.pri);  //private cannot be accessed outside the class---Private is class scope
		System.out.println(obj.pro);
		System.out.println(obj.nomod);  //Nomod is a Package scope
		System.out.println(obj.pub);
	}	
}

