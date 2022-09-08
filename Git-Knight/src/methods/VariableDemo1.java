package methods;

public class VariableDemo1 {

	public static void main(String[] args) {
		Laddu laddu=new Laddu();   //complex variable-- Work with original
		int i;  //Primitive type-- Work with copies
        VariableDemo1 obj=new VariableDemo1();
        System.out.println("value before passing:"+laddu.size);
        obj.pbv(laddu.size); //--Pass By Value-Copies are made 
        System.out.println("value after passing:"+laddu.size);
        
        System.out.println("Reference value before passing:"+laddu.size);
        obj.pbr(laddu); //--Pass By Reference- Original is passed 
        System.out.println("Reference value after passing:"+laddu.size);
	}
	void pbv(int size) {
		size=5;
	}
	void pbr(Laddu Ladu) {
		Ladu.size=5;
	}
}

class Laddu{
	int size=10;
}
