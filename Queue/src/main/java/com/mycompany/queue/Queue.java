package com.mycompany.queue;

public class Queue {
    private int maxSize; // maximum size of the array
    private int[] queArray; // que data
    private int nItems; // number of values in the queue
    
    public Queue(int maxSize) {
        this.queArray = new int[maxSize];
        this.maxSize = maxSize;
        this.nItems = 0;
    }
    
    public void enqueue(int value) {
        if (this.isFull()) {
            System.out.println("Queue is full. Can't enter values...");
            return;
        }
        this.queArray[this.nItems++] = value;
        System.out.println("Value entered");
    }
    
    public void dequeue() {
        for (int i = 0; i < this.nItems; i++) {
            this.queArray[i] = this.queArray[i+1];
        }
        this.nItems--;
    }
    
    public int peek() throws Exception {
        if (this.isEmpty()) {
            System.out.println("No peek value. Queue is empty.");
            throw new Exception("Working");
        }
        return this.queArray[0];
    }
    
    public boolean isEmpty() {
        return (this.nItems == 0);
    }
    
    public boolean isFull() {
        return (this.nItems == this.maxSize);
    }
    
    public int size() {
        return this.nItems;
    }
    
    public void displayQue() {
        if (this.isEmpty()) {
            System.out.println("Nothing to display");
            return;
        }
        for (int i = 0; i < this.nItems; i++) {
            System.out.print(this.queArray[i] + " ");
        }
        System.out.println("");
    }
}
