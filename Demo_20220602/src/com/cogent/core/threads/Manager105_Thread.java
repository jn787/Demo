package com.cogent.core.threads;

class MyThread105 extends Thread{
	@Override
	public void run() {
		for(int i =1000;i<2000;i++) {
			System.out.println("Loop 2: "+i);
		}
	}
}

public class Manager105_Thread {
	public static void main(String[] args) {
		MyThread105 mt1 = new MyThread105();
		mt1.start();
		
		for(int i =0;i<1000;i++) {
			System.out.println("Loop 1: "+i);
		}
	}
}
