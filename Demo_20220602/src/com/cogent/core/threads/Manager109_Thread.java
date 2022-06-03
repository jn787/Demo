package com.cogent.core.threads;

class Thread1091 extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

class Thread1092 extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}


public class Manager109_Thread {
	public static void main(String[] args) {
		Thread1091 t1 = new Thread1091();
		t1.setName("Jack");
		Thread1092 t2 = new Thread1092();
		t2.setName("Jamie");
		
		t1.run();
		t2.run();
		//when we use .run on a thread from main, it's not going to be scheduled
		//	by the ThreadScheduler
		//	which means that the thread is going to be run by main like a normal method
		//if we use .start, it will become a distinct userthread scheduled by the
		//	threadscheduler, and so it will be run by its own thread
		
		System.out.println(Thread.currentThread().getName());
	}
}
