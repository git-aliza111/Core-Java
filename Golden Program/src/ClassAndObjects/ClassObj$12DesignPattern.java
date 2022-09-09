package classesAndObjects;


/*
 *
 * There are three principles by which you can instantiate an object:
 * 1. SingleTon
 * 2. MultiTon
 * 3. Prototype
 */
public class ClassObj$12DesignPattern {

	public static void main(String[] args) {
	MySingleTon mys=MySingleTon.getinstance();	
	MySingleTon mys2=MySingleTon.getinstance();
	}

}

class MySingleTon{
	private static MySingleTon obj;
	private MySingleTon() {
		System.out.println("SIngle obj created");
	}
	public static MySingleTon getinstance() {
		if(obj==null) {
			obj=new MySingleTon();
			obj=new MySingleTon();
		}
		return obj;
	}
}