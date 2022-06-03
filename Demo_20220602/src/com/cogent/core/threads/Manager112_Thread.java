package com.cogent.core.threads;

class HealthClubT extends Thread{
	@Override
	public void run() {
		System.out.println("healthclub open");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Healthclub close");
	}
}

class MovieTheatreT extends Thread{
	@Override
	public void run() {
		System.out.println("Movie open");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Movie close");
	}
}

public class Manager112_Thread {
	public static void main(String[] args) {
		System.out.println("mall open");
		MovieTheatreT t1 = new MovieTheatreT();
		HealthClubT t2 = new HealthClubT();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			//with the joins, main thread will wait until these two threads
			//finish until main can continue
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("mall closed");
	}
}
