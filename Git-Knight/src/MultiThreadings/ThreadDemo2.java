package multiThreading;

public class ThreadDemo2 {
	public ThreadDemo2() {
	Thread t=new Thread(new MyRunnable());
	t.start();
	}
  public static void main(String[] args) {
	new ThreadDemo2();
    System.out.println("main thread");
  }
}

class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("logic of child thread will be written here");
		
	}
}