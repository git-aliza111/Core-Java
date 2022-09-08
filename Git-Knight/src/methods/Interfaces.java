package methods;

public class Interfaces {

	public static void main(String[] args) {
		Human Aliza=new Human();
		AlopathyMedicineCollege Stanley=new AlopathyMedicineCollege();
		
		UnaniMedicineCollege anna=new UnaniMedicineCollege();

	}

}

//Role or Interface
interface Doctor{
	public void doCure();
}

//Role 2/ interface 2
interface nurse{
	public void doCare();
}
//Role Player or Actor --Subjected
class Human{
	
}

//Implementation Class


class AlopathyMedicineCollege implements Doctor,nurse{
	 @Override
	public void doCure() {
		System.out.println("do cure implemented as alopathy medicine");
		
	}
	 @Override
	public void doCare() {
		System.out.println("do care as alopathy medicine");
		
	}
   }


class UnaniMedicineCollege implements Doctor,nurse{
	@Override
	public void doCure() {
		System.out.println("do cure implemented as unani medicine");
		
	}
	@Override
	public void doCare() {
		System.out.println("do care implemented as unani medicine");
		
	}
}


