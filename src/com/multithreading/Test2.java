package com.thread;
import java.util.concurrent.locks.ReentrantLock;

public class Test2 {

	public static void main(String[] args) {

		Display2 d = new Display2();

		MyThread2 t1 = new MyThread2(d, "A");
		MyThread2 t2 = new MyThread2(d, "B");
		MyThread2 t3 = new MyThread2(d, "C");
		t1.start();
		t2.start();
		t3.start();
	}

}

class MyThread2 extends Thread {
	Display2 d;
	String name;

	MyThread2(Display2 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

class Display2 {

	ReentrantLock l = new ReentrantLock();

	public void wish(String name) {
		l.lock();
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello: " + name);
		}
		l.unlock();
	}
}