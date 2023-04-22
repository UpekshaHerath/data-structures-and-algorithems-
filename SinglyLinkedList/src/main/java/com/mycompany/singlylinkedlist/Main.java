package com.mycompany.singlylinkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertFirst(20);
        sll.insertFirst(15);
        sll.insertFirst(53);
        sll.insertFirst(10);
        sll.insertFirst(55);
        sll.insertFirst(32);
        sll.displayList();
        sll.deleteFirst();
        sll.displayList();
        sll.delete(2);
        sll.displayList();
        sll.deleteLast();
        sll.displayList();
        sll.deleteLast();
        sll.displayList();
        sll.insertLast(22);
        sll.displayList();
        sll.insertMiddle(53, 10);
        sll.displayList();
        sll.insertMiddle(55, 13);
        sll.displayList();
        sll.insertMiddle(10, 66);
        sll.displayList();
    }
}

