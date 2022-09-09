package classesAndObjects;

public class ClassObj10$SingleTon {

	public static void main(String[] args) {
	SingleTon single=SingleTon.getInstance();
	SingleTon.getInstance();
	SingleTon.getInstance();
	SingleTon.getInstance();
	SingleTon.getInstance();
	}
}

class SingleTon{
	private SingleTon() {
		System.out.println("singleton obj created....");
	}
	private static SingleTon single;
	
	//Factor method--A method which creates an obj of its own class.
	
	public static SingleTon getInstance() {
		if(single==null) {
			single=new SingleTon();
			new SingleTon();
			new SingleTon();
			new SingleTon();
		}
		return single;
	}
	
	
}