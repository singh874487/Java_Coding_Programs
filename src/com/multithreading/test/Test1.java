package com.multithreading.test;

public class Test1 {

	private static volatile int counter = 0;
	int limit = 0;

	Test1(int x) {
		this.limit = x;
	}

	public synchronized void printEven() {
		while (counter <= limit) {
			if (counter % 2 == 0) {

				System.out.println("Thread " + Thread.currentThread().getName() + ": " + counter);
				counter++;
				notifyAll();
			} else {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public synchronized void printOdd() {
		while (counter <= limit) {
			if (counter % 2 == 1) {
				System.out.println("Thread " + Thread.currentThread().getName() + ": " + counter);
				counter++;
				notifyAll();
			} else {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {

		Test1 t = new Test1(10);

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				t.printOdd();
			}
		});
		t1.setName("Odd Thread");

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				t.printEven();
			}
		});

		t2.setName("Even Thread");
		
		t1.start();
		t2.start();

	}

}
