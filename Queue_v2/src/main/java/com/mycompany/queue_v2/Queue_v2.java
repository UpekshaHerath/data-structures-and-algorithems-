package com.mycompany.queue_v2;

public class Queue_v2 {
    private int maxSize; // maximum size of the array
    private int[] queArray; // que data
    private int front; // position of the last value
    private int rear; // position of the first value
    private int nItems; // number of values in the queue
    
    public Queue_v2(int maxSize) {
        this.queArray = new int[maxSize];
        this.maxSize = maxSize;
        this.nItems = 0;
        this.front = 0;
        this.rear = -1;
    }
    
    public void enqueue(int value) {
        if (this.isFull()) {
            System.out.println("Que is full.");
            return;
        }
        
        if (this.rear == this.maxSize - 1) {
            this.rear = 0;
        } else {
            this.rear++;
        }
        
        this.nItems++;
        this.queArray[rear] = value;
        System.out.println("Value inserted");
    }
    
    public int dequeue() throws Exception {
        if (this.isFull()) {
            throw new Exception("Queue is full.");
        }
        
        int temp = this.queArray[this.front];
        
        if (this.front == this.maxSize - 1) {
            this.front = 0;
        } else {
            this.front++;
        }
        
        this.nItems--;
        System.out.println("Value deleted.");
        return temp;
    }
    
    public int peek() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Que is empty. No peek value.");
        }
        return this.queArray[this.front];
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
        int i = this.front;
        while (i != this.rear) {
            System.out.print(this.queArray[i] + " ");
            if (i == this.maxSize - 1) {
                i = 0;
            } else {
                i++;
            }
        }
        System.out.println(this.queArray[this.rear] + " ");
        System.out.println("");
    }
}
