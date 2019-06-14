package com.revature.threads;

public class ThreadExtension extends Thread{
	
	/*
	 * We've defined a constructor and chosen to call
	 * the super class' constructor, which allows us to
	 * give our thread a name. This is, of course,
	 * optional.
	 */
	public ThreadExtension(String name) {
		super(name);
	}

	@Override
	public void run() {
		super.run();
		while(ThreadImplementation.x <= 100) {
			ThreadImplementation.incrementX();
			System.out.println(this.getName() + " has incremented x to " + ThreadImplementation.x);
		}
	}

}
