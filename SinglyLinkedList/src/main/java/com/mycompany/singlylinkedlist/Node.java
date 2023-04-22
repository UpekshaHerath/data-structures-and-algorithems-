package com.mycompany.singlylinkedlist;

public class Node {
    int data;
    Node next;
    
    Node(int item) {
        this.data = item;
        this.next = null;
    }
    
    void displayNode() {
        System.out.print(this.data + " ");
    }
}
