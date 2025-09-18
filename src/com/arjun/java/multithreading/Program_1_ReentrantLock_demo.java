package com.arjun.java.multithreading;

import java.util.concurrent.locks.ReentrantLock;

// Program effectively demonstrates the use of ReentrantLock to manage concurrent access to a method, 
// ensuring that threads can safely print messages without interfering with each other.

public class Program_1_ReentrantLock_demo {

	public static void main(String[] args) {

		Display d = new Display();
		MyThread t1 = new MyThread(d, "A");
		MyThread t2 = new MyThread(d, "B");
		MyThread t3 = new MyThread(d, "C");

		t1.start();
		t2.start();
		t3.start();

	}

}

class MyThread extends Thread {
	Display d;
	String name;

	MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}

}

class Display {

	ReentrantLock l = new ReentrantLock();

	public void wish(String name) {
		l.lock();

		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning: ");

			try {
				Thread.sleep(0);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
		l.unlock();
	}
}