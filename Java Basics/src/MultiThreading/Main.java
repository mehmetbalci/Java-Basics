package MultiThreading;

public class Main {

	public static void main(String[] args) {
		//Threads
		/*System.out.println(Thread.activeCount());
		Thread.currentThread().setName("First Thread");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(10);//10 is highest prior
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isAlive());
		myThread thread2=new myThread();
		thread2.start();
		System.out.println(thread2.isAlive());
		System.out.println(thread2.getName());
		System.out.println(thread2.getPriority());
		thread2.setPriority(9);
		System.out.println(thread2.getPriority());
		thread2.setDaemon(true);//we made thread2 a deamon thread
		System.out.println(thread2.isDaemon());*/
		//Multithreading
		//1st way
		myThread thread1= new myThread();
		//2nd way
		MyRunnable runnable1= new MyRunnable();
		Thread thread2= new Thread(runnable1);
		thread1.start();
		thread2.start();
		
		
		
		
		

	}

}
