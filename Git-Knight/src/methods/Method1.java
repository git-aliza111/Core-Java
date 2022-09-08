package methods;

public class Method1 {

	public static void main(String[] args) {
		Method1 obj=new Method1();
		obj.met();
        obj.met(10);   //Data changes behavior changes--POLYMORPHISM
	    obj.met("Knights",20);
	    obj.met(100,"batchess");
	    int arr[]= {32,62,72,727};
	    obj.call(arr);
	    System.out.println("\n................\n");
	    obj.call(new int[]{3,743,81,53});
	    System.out.println("\n................\n");
	    obj.varmet(13,4,5156,626);
	    System.out.println();
	    obj.met(1452151251252l);
	}

	void met() {
		System.out.println("met method called..");
	}
	
	void met(int i) {
		System.out.println("met method called.."+i);
	}
	
	void met(String s,int m) {
		System.out.println(s+" "+m);
	}
	
	void met(int n,String s) {
		System.out.println(n+" "+s);
	}
	
	void call(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		for(int n:a) {       //extended for loop
			System.out.print(n+"\t");
		}
	}
	
	void varmet(int...a) {       //VARARGS
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		for(int n:a) {       //extended for loop
			System.out.print(n+"\t");
		}
	}
	
	void met(long l) {
		System.out.println("longgggggggg");
	}
	
}
