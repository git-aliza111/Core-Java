package methods;

public class VariableDemo3 {

	public static void main(String[] args) {
		TrainingRoom netaji=new TrainingRoom();
		TrainingRoom betaji=new TrainingRoom();
		
		System.out.println(netaji.sanyo+":"+betaji.sanyo);
		System.out.println(netaji.loo+":"+betaji.loo);
		System.out.println(TrainingRoom.loo+":"+TrainingRoom.loo);     //Right way to write
	}

}

class TrainingRoom{
	Projector sanyo=new Projector();  //Instance Variable
	static Toilet loo=new Toilet();   //class Variable
}

class Projector{
	
}

class Toilet{
	
}