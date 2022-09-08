package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo10 {

	public static void main(String[] args) {
		Gun revolver=new Gun();
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(()->{
			for(int i=0;i<5;i++) {
				revolver.LoadGun();
			}
		});
		es.execute(()->{
			for(int i=0;i<5;i++) {
				revolver.ShootGun();
			}
		});

		es.shutdown();
	}

}
class Gun{
	boolean flag;
 synchronized public void LoadGun() {
		if(flag) {
			try {
				wait(1000);
		    }catch(Exception e) {}
		}		
		System.out.println("fill the gun");
		flag=true;
	}
  synchronized public void ShootGun() {
		if(!flag) {
			try {
				wait();
		    }catch(Exception e) {}
		}	
		System.out.println("shoot the gun");
		flag=false;
	}
	
}
