package methods;

public class InnerClasses2 {

	public static void main(String[] args) {
		new outer2().met();
	}

}

class outer2{
	void met() {
		//Local inner class--private to the method
		class local{
			void mett() {
				System.out.println("metttt called");
				
			}
		}
		new local().mett();
	}
}