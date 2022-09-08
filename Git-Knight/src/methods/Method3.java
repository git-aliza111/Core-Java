package methods;

public class Method3 {

	public static void main(String[] args) {
		Hall hall=new BirthdayHall();
        hall.feast();
        
		MarriageHall mh=new MarriageHall();
		mh.feast();
	}

}

/*
 * OVERRIDING
 * 1. THE NAME OF THE METHOD SHOULD BE SAME
 * 2. PARAMETERS SHOULD BE SAME
 * 3. RETURN TYPE SHOULD BE SAME
 * 4. ACCESS SPECIFIER SHOULD NOT BE MORE PRIVATE(you cannot reduce the visibility but you can increase the visibility)
 */


class Hall{           //Super Class
	public void feast() {
		System.out.println("General royal menu...");
	}
}

class MarriageHall extends Hall{           //Sub class
	public void feast() {
		System.out.println("bengal royal feast");
		super.feast();
	}
}

class BirthdayHall extends Hall{
	public void feast() {
		System.out.println("Rajasthani royal feast");
	}
}