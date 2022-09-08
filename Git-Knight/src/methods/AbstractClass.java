package methods;

public class AbstractClass {

	public static void main(String[] args) {
		
       Hall1 hall;
     //hall.new Hall(); // cannot instantiate Abstract class
       Hall1.metS();
       hall=new PartyHall();
       hall.met();
       
       if(hall instanceof PartyHall) {
    	   System.out.println("Yes this is a party hal now");
       }
       else {
    	   System.out.println("no this is not a party hall");
       }
       
       hall=new MeetingHall();
       hall=new PartyHall();
       
       if(hall instanceof MeetingHall) {
    	   System.out.println("Yes this is a meeting hal now");
       }
       else {
    	   System.out.println("no this is not a meeting hall");
       }
       
       accept(hall);
       accept(new MeetingHall());
	}

	static void accept(Hall1 hall) {
		System.out.println("party......."+hall);
	}
	
	static void accept(MeetingHall hall) {
		System.out.println("meetinggggggg......."+hall);
	}
}
abstract class Hall1{
	public Hall1() {
		System.out.println("cons of abs called...");
	}
	static {
		System.out.println("static block of abs called...");
	}
	public void met() {
		System.out.println("abtract class met ....");
	}
	public static void metS() {
		System.out.println("static met of abs called...");
	}
}

class PartyHall extends Hall1{
	public PartyHall() {
	System.out.println("cons of partyhall called");
	}
	
}

class MeetingHall extends Hall1{
	public MeetingHall() {
	System.out.println(" meeting hallll");
	}
}