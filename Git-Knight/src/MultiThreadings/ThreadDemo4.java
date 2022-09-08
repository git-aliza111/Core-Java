package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo4 {
	public ThreadDemo4() {
	ExecutorService es=Executors.newFixedThreadPool(1);
	 es.execute(()->{System.out.println("child logic here...");});
	 es.shutdown();
}
  public static void main(String[] args) {
	new ThreadDemo4();
	for(int i=0;i<5;i++) {
    System.out.println("main thread");
    try {
		Thread.sleep(100);
		}catch(Exception e) {}
	}
  }
}

