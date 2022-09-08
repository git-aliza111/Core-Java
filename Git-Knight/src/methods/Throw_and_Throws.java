package methods;

public class Throw_and_Throws {

	public static void main(String[] args) {
		LLRDriver llr=new LLRDriver();
		try {
		llr.drive("gooo");
		}catch(Exception e) {
			System.out.println("road is bumpy");
		}
		System.out.println("Road is clear");
		}
		

}

class LLRDriver{
	public void drive(String road) throws Exception {
		if(road.equals("bumpy")) {
			throw new Exception();
		}
	}
}