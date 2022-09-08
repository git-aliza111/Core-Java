package methods;

public class InnerClasses {

public static void main(String[] args) {
	
	outer.inner ins=new outer.inner();
	ins.met();
	
	outer.innernonstatic in=new outer().new innernonstatic();
	in.met();
}

}

class outer{
	void outmet() {
		System.out.println("non static out met called");
	}
	static void staticoutmet() {
		System.out.println("static out met called");
	}
	static class inner{
		public void met() {
			System.out.println("static inner class called");
		//	outmet(); - non static cannot be acessed
			staticoutmet();
		}
	}
	
	class innernonstatic{
		public void met() {
			System.out.println("non static inner class called");
			outmet();
			outer.staticoutmet();
		}
	}
}