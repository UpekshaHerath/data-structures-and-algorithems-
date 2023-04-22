package com.mycompany.singlylinkedlist;

public class SinglyLinkedList {
    private Node head;
    
    public void SinglyLinkedList() {
        head = null;
    }
    
    public boolean isEmpty() {
        return (head == null);
    }
    
    public void insertFirst(int i) {
        Node newNode = new Node(i);
        newNode.next = this.head;
        this.head = newNode;
    }
    
    public Node deleteFirst() {
        if (isEmpty()) {
            System.out.println("Linked list is empty.");
            return null;
        } else {
            Node deletedValue = this.head;
            this.head = this.head.next;
            System.out.println("Deleted first value.");
            return deletedValue;
        }
    }
    
    public void displayList() {
        if (isEmpty()) {
            System.out.println("Nothing to display. Linked list is empty.");
            return;
        }
        Node temp = this.head;
        while (temp != null) {
            temp.displayNode();
            temp = temp.next;
        }
        System.out.println("");
    }
    
    public Node find(int key) { // 1, 2, 3, 4 like indexes are the keyes
        if (isEmpty()) {
            System.out.println("Linked list is empty.");
            return null;
        }
        Node temp = this.head;
        int count = 1;
        while (temp != null) {
            if (count == key) {
                return temp;
            }
            temp = temp.next;
            count++;
        }
        System.out.println("The relevent key is outOfBound.");
        return null;
    }
    
    public void delete(int key) {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Nothing to delete.");
            return;
        } 
        Node previous = this.head;
        Node current = this.head;
        int count = 1;
        while (current != null) {
            if (key == count) {
                if (key == 1) {
                    this.deleteFirst();
                } else {
                    previous.next = current.next;
                }
                System.out.println("Item deleted.");
                return;
            }
            previous = current;
            current = current.next;
            count++;
        }
        System.out.println("Not is the list for deletion.");
    }
    
    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("List is empty. Do not have a last value.");
            return;
        }
        Node previous = this.head;
        Node current = this.head;
        while (current != null) {
            if (current.next == null) {
                previous.next = null;
                System.out.println("Last value deleted");
            }
            previous = current;
            current = current.next;
        }
    }
    
    public void insertLast(int data) {
        Node newNode = new Node(data);
        Node current = this.head;
        while (current != null) {
            if (current.next == null) {
                current.next = newNode;
                System.out.println("Value inserted at last.");
                return;
            }
            current = current.next;
        }
    }
    
    public void insertMiddle(int after, int data) {
        Node newNode = new Node(data);
        Node current = this.head.next;
        Node previous = this.head;
        while (current != null) {
            if (previous.data == after) {
                newNode.next = current;
                previous.next = newNode;
                System.out.println("Value inserted.");
                return;
            }
            previous = current;
            current = current.next;
        }
        System.out.println("Such value called " + after + " is not in the list");
    }
}
