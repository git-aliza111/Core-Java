package level1;

public class Lambdass {

	public static void main(String[] args) {
	System.out.println(JDKinterface.pi);
    JDKinterface.met5();
	
	Dominos ilhamDominos=new ilhamDominos();
	ilhamDominos.sellpizza();
	
	}

}

interface JDKinterface{
	public void met();
	public final static float pi=3.14f;
	private void met2() {
		System.out.println("private met2 called");
	}
	private void met4() {
		System.out.println("private met4 called");
	}
	public default void met3() {
		met2();
		met4();
	}
	public static void met5() {
		System.out.println("met5 static met called");
	}
}

interface Dominos{
	public void getpayment();
	public void delivery();
	private void makingdough() {
		System.out.println("making dough as per dominos secret");
	}
	private void addingredients() {
		System.out.println("adding ingredients as per dominos secret logic");
	}
	private void baking() {
		System.out.println("baking as per dominos secret receipe");
	}
	private void makepizza() {
		makingdough();
		addingredients();
		baking();
	}
	public default void sellpizza() {
		getpayment();
		makepizza();
		delivery();
	}
}

class ilhamDominos implements Dominos{
	@Override
	public void delivery() {
	System.out.println("india me bike hi deleivery king hai");
	}
	 @Override
	public void getpayment() {
	System.out.println("payment do pizza lo...in rupesss...");
		
	}
}



