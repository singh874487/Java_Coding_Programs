package com.interview.asked;


public class Program_11_Custome_ArrayList {
	
    public static void main(String[] args) {
    	
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        
        System.out.println(a.get(0)); // Output: 1
        System.out.println(a.get(1)); // Output: 2
        
        a.remove(1); // Remove the element at index 1 (which is 2)
        
        System.out.println(a.get(1)); // Output: 3
        System.out.println("Size: " + a.size()); // Output: Size: 2
    }
}




class ArrayList<T> {
	
    private Object[] arr; // Store elements
    private int size; // Current size of the ArrayList
    private int capacity; // Capacity of the ArrayList

    // Default constructor
    public ArrayList() {
    	
        this.capacity = 16;
        this.arr = new Object[capacity];
        this.size = 0;
    }

    // Constructor with a specified size
    public ArrayList(int initialCapacity) {
    	
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }
        this.capacity = initialCapacity;
        this.arr = new Object[capacity];
        this.size = 0;
    }

    // Method to add an element
    public void add(T t) {
    	
        if (size == capacity) {
            // Resize the array if it's full
            resize();
        }
        arr[size++] = t; // Add the element and increment the size
    }

    // Method to get an element
    @SuppressWarnings("unchecked") // Suppress warning for casting
    public T get(int i) {
    	
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return (T) arr[i];
    }

    // Method to remove an element at index x
    public void remove(int x) {
    	
        if (x < 0 || x >= size) {
            throw new IndexOutOfBoundsException("Index: " + x + ", Size: " + size);
        }
        
        // Shift elements to the left
        for (int i = x; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // Clear the last element
    }

    // Method to resize the internal array
    private void resize() {
    	
        capacity *= 2; // Double the capacity
        Object[] newArr = new Object[capacity];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr; // Point to the new array
    }

    // Method to get the current size
    public int size() {
        return size;
    }
}
