package multiThreading;

public class ThreadDemo1 {

	public static void main(String[] args) {
	Thread t=Thread.currentThread();
	System.out.println(t);
	met1();
	met2();
	met3();
		}

	static void met1() {
		System.out.println("met 1 called");
	}
	static void met2() {
		System.out.println("met 2 called");
		try {
		Thread.sleep(5000);
		}catch(Exception e) {}
		System.out.println("met 2 finished");
	}
	static void met3() {
		System.out.println("met 3 called");
	}
}
