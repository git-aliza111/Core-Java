package classesAndObjects;

//Pass by reference and Pass by value
public class ClassObj4$Laddu {

	public static void main(String[] args) {
		Laddu laddu=new Laddu();
		PBV pbv=new PBV();
		PBR pbr=new PBR();
		
		System.out.println("laddu size before PBV"+laddu.size);
		pbv.get(laddu.size);
		System.out.println("laddu size after PBV"+laddu.size);
		
		System.out.println("laddu size before PBR"+laddu.size);
		pbr.get(laddu);
		System.out.println("laddu size after PBR"+laddu.size);
	}

}

class Laddu{
	int size=10;
	
}
class PBV{
	public void get(int size) {
		size =size-5;
	}
}
class PBR{
	public void get(Laddu laddu) {
		laddu.size=laddu.size-5;
	}
}