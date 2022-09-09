package classesAndObjects;

public class ClassaObj5$OverLoad {

	public static void main(String[] args) {
		overload Ol=new overload();
		Ol.met();
        Ol.met(10);
        Ol.met(18, 0);
        Ol.met(45.0);
        
        
	}

}

class overload{
	public void met() {
		System.out.println("met with no param called");
	}
	public void met(int i) {
		System.out.println("met with int param called:" +" "+i);
	}
	public void met(byte b) {
		System.out.println("met with byte param called"+b);
	}
	public void met(long l) {
		System.out.println("met with long param called"+l);
	}
	public void met(int i,int j) {
		System.out.println("met with two param called"+i+":"+j);
	}
	public void met(int i,float j ) {
		System.out.println("met with two param int and float called"+i+":"+j);
	}


//Rules Pertaining to overloading
//can u change the return type-? => Yes you can have a different return type for a overloaded method.

 public long met(double d) {
	System.out.println("met with return type long,returns double type "+d);
	 return 10;
	
	
  }
 
}  

