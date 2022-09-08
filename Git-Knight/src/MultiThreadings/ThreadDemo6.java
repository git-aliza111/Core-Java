package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo6 {

	public static void main(String[] args)throws Exception {
		System.out.println("main thread is teaching");
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{new Worker1().Breakfast();});
		Future<String> future=es.submit(()->{
			try {Thread.sleep(2000);}catch(Exception e) {}
			return new Worker2().Paybill();});
		String str=future.get();
		System.out.println(str);
		es.shutdown();

		System.out.println("main thread still teaching");
	}

}

class Worker1{
public void Breakfast() {
	try {Thread.sleep(1000);}catch(Exception e) {}
	System.out.println("breakfast done jii..");
	
}
}
class Worker2{
	public String Paybill() {
		return "bill payed sir jiii";
	}
}
