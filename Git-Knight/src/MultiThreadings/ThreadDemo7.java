package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo7 {

	public static void main(String[] args) {
	ReservationCounter RC=new ReservationCounter();
	ExecutorService es=Executors.newFixedThreadPool(2);
	
	es.execute(()->{
		Thread.currentThread().setName("Ramu");
		synchronized(RC) {
		RC.BookTicket(1000);
		RC.GiveChange();
		}
	});
	es.execute(()->{
		Thread.currentThread().setName("samu");
		synchronized(RC) {
		RC.BookTicket(500);
		RC.GiveChange();
		}
	});
	}
}
class ReservationCounter{
	int amt;
	public void BookTicket(int amt){
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+ " is at the counter");
		try {Thread.sleep(2000);}catch(Exception e) {}
		System.out.println(name+" has left the counter to take the change");
	}
	public void GiveChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+ " is at the counter waiting for change");
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println(name+" has left the counter"+ (amt-100));
	}
}