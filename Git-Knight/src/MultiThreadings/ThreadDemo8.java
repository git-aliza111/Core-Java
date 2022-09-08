package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo8 {

	public static void main(String[] args) {
	AddmissionHall newcollege=new AddmissionHall();
	ExecutorService es=Executors.newFixedThreadPool(4);
	
	es.execute(()->{
		Thread.currentThread().setName("Ramu");
		
		newcollege.Table1();
		newcollege.Table2();
		newcollege.Table3();
		
	});
	es.execute(()->{
		Thread.currentThread().setName("samu");
		
		newcollege.Table1();
		newcollege.Table2();
		newcollege.Table3();
		
	});
	es.execute(()->{
		Thread.currentThread().setName("jamu");
		newcollege.DrinkWater();
	});
	}
}
 class AddmissionHall{
	synchronized public void Table1(){
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+ " is at the Table 1");
		try {Thread.sleep(2000);}catch(Exception e) {}
		System.out.println(name+" has left the Table 1");
	}
	synchronized  public void Table2() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+ " is at the table 2");
		try {Thread.sleep(2000);}catch(Exception e) {}
		System.out.println(name+" has left the table 2");
	}
	synchronized public void Table3() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+ " is at the table 3");
		try {Thread.sleep(2000);}catch(Exception e) {}
		System.out.println(name+" has left the table 3");
	}
	public void DrinkWater() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+ " is drinking water");
		try {Thread.sleep(4000);}catch(Exception e) {}
		System.out.println(name+" has done drinking");
	}
}
 
 