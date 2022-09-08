package methods;

public class VariableDemo2 {

	public static void main(String[] args) {
		A obj=new A();
		obj.s=100;
		obj.ss=2000;
		A.ss=2000;   //right way of initializing this coz its class level
		A obj2=new A();
		obj2.s=200;
		obj2.ss=1000;
		A.ss=1000;  //right way of initializing this coz its class level
		
		System.out.println(obj.s+":"+obj2.s);
		System.out.println(obj.ss+":"+obj2.ss);
		
		A objX=obj;
		obj.met(10);
		objX.met(20);
	}

}

class A{
	int s;  //instance Variable
	static int ss;  //class Variable
	
	public void met(int n) {
		// n is a local variable
		System.out.println(n);
	}
	
	public void met(long ll) {
		// ll is a local variable
	}
	
}