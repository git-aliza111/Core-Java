package anotherpack;

import classesAndObjects.ClassObj7$AccessSpeci;

//Different Package Sub Class
public class DiffPackSubClass extends ClassObj7$AccessSpeci {
	public void met() {
//		System.out.println(pri);
		System.out.println(pro);
//		System.out.println(nomod);   //It is a package scope
		System.out.println(pub);
	}
}

//Different Package Non Sub Class
class DiffPackNonSubClass  {
	ClassObj7$AccessSpeci obj=new ClassObj7$AccessSpeci();
	public void met() {
//		System.out.println(pri);
//		System.out.println(obj.pro);   //It is a Generalization scope
//		System.out.println(nomod);
		System.out.println(obj.pub);   //Public is Global scope
	}
}
