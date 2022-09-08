package methods;

public class Throw_and_throws2 {

	public static void main(String[] args) {
	Dog tommy=new Dog();
	try {
	tommy.play("stick");
	}catch(DogBiteException dbe) {
		System.out.println(dbe);
	}catch(DogBarkException dbee) {
		System.out.println(dbee);
	}

	}

}

class Dog{
	public void play(String item) throws DogBiteException,DogBarkException{
		if(item.equals("stick")) {
			throw new DogBiteException("uh beat I bite");
		}
		else if(item.equals("stone")){
			throw new DogBarkException("uh throw I bow boww..");
		}
	}
}

class DogBiteException extends Exception{
	String msg;
	public DogBiteException(String msg) {
	this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is:- " + msg;
	}
}

class DogBarkException extends Exception{
	String msg;
	public DogBarkException(String msg) {
	this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is:- " + msg;
	}
}