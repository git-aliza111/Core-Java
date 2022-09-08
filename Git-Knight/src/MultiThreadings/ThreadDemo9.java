package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo9 {

	public static void main(String[] args) {
	new MakeBiryani().BiryaniMaking();

	}
}

class MakeBiryani{
	void BiryaniMaking() {
		
		ExecutorService es=Executors.newFixedThreadPool(3);
		
		es.execute(()->{
			Thread.currentThread().setName("Sanjeev chief");
			new CookRice().BoilingRice();
			new MixAndMakeBiryani().mixing();
		});
		es.execute(()->{
			Thread.currentThread().setName("Helper 1");
			new Cutveg().cutting();
		});
		es.execute(()->{
			Thread.currentThread().setName("Helper 2");
			new CookCurry().MakingCurry();
		});
		
		es.shutdown();
	}
}
class Cutveg{
	public void cutting() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		 System.out.println(name+" is cutting the veggies");
		 try {Thread.sleep(5000);}catch(Exception e) {}
		 System.out.println(name+" has done cutting");
		}
}
class CookRice{
	public void BoilingRice() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		 System.out.println(name+" has kept rice to boil");
		 try {Thread.sleep(8000);}catch(Exception e) {}
		 System.out.println(name+" has left the kitchen putting rice on gas");
		}
}
class CookCurry{
	public void MakingCurry() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		 System.out.println(name+" is cooking curry");
		 try {Thread.sleep(10000);}catch(Exception e) {}
		 System.out.println(name+" has kept curry on gas and left the kitchen");
		}

}
class MixAndMakeBiryani{
	public void mixing() {
	Thread t=Thread.currentThread();
	String name=t.getName();
	 try {Thread.sleep(5000);}catch(Exception e) {}
	 System.out.println(name+ " is mixing both curry and rice");
	 try {Thread.sleep(5000);}catch(Exception e) {}
	 System.out.println("biryani is ready");
	}
}