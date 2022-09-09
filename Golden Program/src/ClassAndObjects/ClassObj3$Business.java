package classesAndObjects;

public class ClassObj3$Business {

	public static void main(String[] args) {
	Business obj=new Business();
	obj.met();
	int n=obj.met1();
	System.out.println(n);

	obj.met2("holaa",2020);
	n=obj.met3(1780);
	System.out.println(n);
	
	obj.met4(new String[] {"holaa","hoiii","buiee"});
	}

}

class Business
{
	void met() {
		System.out.println("met method called...");
	}
	int met1(){
		System.out.println("met1 method called..");
		return 0;
	}
	void met2(String s,int i) {
		System.out.println("values areee...."+s+":"+i);
	}
	int met3(int i) {
		return i+10;
	}
	void met4(String s[]) {
		for(String str:s) {   //enhanced for loop
		System.out.print(str+ "\t");
		}
	}
	
	
}