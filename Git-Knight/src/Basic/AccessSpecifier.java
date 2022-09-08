package Basics;

public class AccessSpecifier {

		private int pri;  // CLASS SCOPE
		public int pub;  //GLOBAL SCOPE
		protected int pro;  //RELATION SCOPE
		int nomod; //PACKAGE SCOPE
		
		void met() {
			System.out.println(pri);
			System.out.println(pub);
			System.out.println(nomod);
			System.out.println(pro);
		}
}	
class AcsessSpecifierSamePackSubClass extends AccessSpecifier{
	void met() {
	//	System.out.println(pri);
		System.out.println(pub);
		System.out.println(nomod);
		System.out.println(pro);
	
	}
}

class AcsessSpecifierSamePackNonSubClass{
	
	void met() {
		AccessSpecifier obj=new AccessSpecifier();
	//	System.out.println(obj.pri);
		System.out.println(obj.pub);
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
	
	}
	
}


