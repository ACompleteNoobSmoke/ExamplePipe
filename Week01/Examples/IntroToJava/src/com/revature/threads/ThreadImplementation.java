package com.revature.threads;

public class ThreadImplementation implements Runnable{

	/*
	 * The volatile modifier ensures that we only ever access this
	 * resource's value via main memory.
	 */
	public volatile static int x = 0;
	
	/*
	 * The run() method DOES NOT actually start a thread. It
	 * simply executes in the current thread.
	 * 
	 * NOTE: The method that actually starts a thread is the
	 * start() method.
	 */
	@Override
	public void run() {
		while(x <= 100) {
			System.out.println("x has been incremented to: " + x);
		}
	}
	
	public static void main(String[] args) {
		
		ThreadExtension te = new ThreadExtension("Thread 1");
		ThreadImplementation ti = new ThreadImplementation();
		/*
		 * The ThreadImplementation class implements the runnable
		 * interface, so we can't simply call the start() method
		 * on it. We must instead pass this instance of the class
		 * to a thread constructor as a argument.
		 */
		Thread t = new Thread(ti);
		
		
		//This method is what actually starts our thread. It won't
		//begin execution until we call this method.
		t.start();
		
		/*
		 * If we use the join() method, the program will wait for
		 * the thread to die before continuing execution. "Death"
		 * is the equivalent of the thread being terminated.
		 */
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		te.start();
	}

	public static void incrementX() {
		
		x++;
		/*
		 * You can't use the "this" keyword with static members
		 * because static members don't belong to any instance
		 * of the class. They belong to the class itself.
		 */
//		this.x++;
	}
	
}
