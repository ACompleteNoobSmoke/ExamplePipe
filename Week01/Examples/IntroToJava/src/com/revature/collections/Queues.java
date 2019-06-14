package com.revature.collections;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Queues {

	public static void main(String[] args) {
		Queue<String> q = new PriorityBlockingQueue();
		
		q.add("This");
		q.add("is");
		q.add("a");
		q.add("queue!");
		
		System.out.println(q);
		
		/*
		 * The poll() method is similar to the remove() method; it
		 * removes an object from your queue AND returns that object.
		 */
		q.poll();
		
		System.out.println(q);
		
	}
}
