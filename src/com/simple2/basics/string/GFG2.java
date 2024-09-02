package com.simple2.basics.string;
 
public class GFG2 {
 
    // Starting counter
    int counter = 0;
 
    static int N;
 
    // Function to print odd numbers
    public void printIsGreat()
    {
        synchronized (this)
        {
            // Print number till the N
            for (int i=0;i < N;i++) {
 
                // If count is even then print
                while (counter   == 0) {
 
                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
 
                // Print the number
                System.out.println(  " is great ");
 
                // Increment counter
                counter =0;
                 
 
                // Notify to second thread
                notify();
            }
        }
    }
 
    // Function to print even numbers
    public void printIndia()
    {
        synchronized (this)
        {
            // Print number till the N
        	for (int i=0;i < N;i++){
 
                // If count is odd then print
                while (counter == 1) {
 
                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
 
                // Print the number
                System.out.print(
                     " India ");
 
                // Increment counter
                counter =1;
 
                // Notify to 2nd thread
                notify();
            }
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        // Given Number N
        N = 10;
 
        // Create an object of class
        GFG2 mt = new GFG2();
 
        // Create thread t1
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                mt.printIndia();
            }
        });
 
        // Create thread t2
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                mt.printIsGreat();
            }
        });
 
        // Start both threads
        t1.start();
        t2.start();
    }
}