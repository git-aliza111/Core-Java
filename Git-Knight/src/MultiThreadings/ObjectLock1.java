package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObjectLock1 {

	public static void main(String[] args) {
	ExecutorService es=Executors.newFixedThreadPool(2);
	Building lic=new Building();
//	Building lic2=new Building();
	es.execute(()->{
		Thread.currentThread().setName("Ramu");
		synchronized(Building.class){
		Building.sulab.useToilet();
		
		}
		lic.Mr.useManagerRoom();
	});
	es.execute(()->{
		Thread.currentThread().setName("samu");
		synchronized(Building.class) {
		Building.sulab.useToilet();
		
		}
		lic.Mr.useManagerRoom();
	});

	es.shutdown();
	}

}

class Building{
 static Toilet sulab=new Toilet();
 ManagerRoom Mr=new ManagerRoom();

}
class Toilet{
	public void useToilet() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is in the toilet");
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println(name+" has left the toilet");
	}
}
class ManagerRoom{
	public void useManagerRoom() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is inside the manager room");
		try {Thread.sleep(4000);}catch(Exception e) {}
		System.out.println(name+" has left the room");
	}
}