package methods;

public class Method2 {

	public static void main(String[] args) {
		Method2 obj=new Method2();
		String ret=obj.met(100);
		System.out.println(ret);
		
		System.out.println(obj.met(100l));

		System.out.println(obj.getname(500));
	}

	int met() {
		return 90;
	}
	
	String met(int i) {
		return "helloo";
	}
	boolean met(long l) {
		if(l==100) {
			return true;
		}
		else {
			return false;
		}
	}
	
	String getname(int rollno) {
		switch(rollno){
		case 100:{
			return "rahim..";
		    }
		case 200:{
			return "ramo";
		    }
		default:{
			return "dont know";
		    }
		}
	}
	
	
}
