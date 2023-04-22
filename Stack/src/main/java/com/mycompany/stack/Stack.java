package com.mycompany.stack;

/**
 *
 * @author Upeksha
 */
public class Stack {
    private int maxSize; // size of stack array 
    private int[] stackData;
    private int top; // index of the top value in stack
   
    public Stack(int s) {
        this.maxSize = s;
        this.stackData = new int[s];
        this.top = -1;
    }
    
    public boolean isEmpty() {
        return (this.top == -1);
    }
    
    public boolean isFull() {
        return (this.top == (this.maxSize - 1));
    }
    
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full. Can not push.");
            return;
        }
        this.stackData[++this.top] = item; // because after inserting the value need to increment top by 1
        System.out.println("Value inserted");
    }
    
    public int pop() throws MyStackEmptyException {
        if (isEmpty()) {
            throw new MyStackEmptyException("Stack is empty. Can not pop the value");
        }
        int topValue = this.stackData[top];
        this.top--;
        return topValue;
    }
    
    public int peek() throws MyStackEmptyException {
        if (this.isEmpty()) {
            throw new MyStackEmptyException("Stack is empty. No peek found.");
        }
        return this.stackData[top];                                                                       
    }
    
    public void display() throws MyStackEmptyException {
        if (this.isEmpty()) {
            throw new MyStackEmptyException("Stack is empty. No peek found.");
        }
        for (int i = 0; i < this.top + 1; i++) {
            System.out.print(stackData[i] + " ");
        }
        System.out.println("");
    }
}
