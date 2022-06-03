package com.cogent.core.threads;

public class Manager104_Thread {
	public static void main(String[] args) {
		for(int i =0;i<1000;i++) {
			System.out.println("Loop 1: "+i);
		}
		for(int i =1000;i<2000;i++) {
			System.out.println("Loop 2: "+i);
		}
	}
}
