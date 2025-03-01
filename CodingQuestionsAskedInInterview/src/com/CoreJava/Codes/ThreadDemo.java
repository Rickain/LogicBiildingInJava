package com.CoreJava.Codes;

public class ThreadDemo extends Thread {

	@Override
	public void run(){
		
		try {
			Thread.sleep(10000);
			System.out.println("Hello in side run");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
		
		t.start();
	}

}
