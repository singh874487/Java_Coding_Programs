package com.interview.internals;

public class Program_5_Singleton_Class_ThreadSafe {

	 // Volatile variable to ensure changes to this instance are visible to all threads
    private static volatile Program_5_Singleton_Class_ThreadSafe instance = null;

    // Private constructor to prevent instantiation from outside
    private Program_5_Singleton_Class_ThreadSafe() {
        // Initialization code (if any)
    }

    // Method to return the Singleton instance with double-checked locking
    public static Program_5_Singleton_Class_ThreadSafe getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (Program_5_Singleton_Class_ThreadSafe.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new Program_5_Singleton_Class_ThreadSafe();
                }
            }
        }
        return instance;
    }

    // Other Singleton methods and logic can be added here

}




/*


Explanation:
volatile keyword:

The instance variable is marked as volatile to ensure that updates to this variable are visible to all threads. 
Without volatile, there could be situations where a thread might see a partially constructed instance due to reordering by the compiler or the processor.

Double-checked locking:

The getInstance() method first checks if instance is null without acquiring a lock (this reduces overhead).
If instance is null, the synchronized block is entered, and a second check is performed to ensure instance is still null before initializing it. 
This prevents multiple threads from creating separate instances simultaneously.

After the instance is initialized, subsequent calls to getInstance() won't enter the synchronized block, improving performance.

Why Double-Checked Locking?

Double-checked locking minimizes the synchronization overhead by only acquiring the lock the first time the instance is initialized. 
After the instance is created, threads skip the locking, making the pattern more efficient in multi-threaded environments.

This approach ensures that the Singleton instance is created only once, even when multiple threads are trying to access it concurrently.


*/