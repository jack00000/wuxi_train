package org.whgc.test;

public class MyThread extends Thread {
	
	public MyThread() {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
	}
	
	

}
