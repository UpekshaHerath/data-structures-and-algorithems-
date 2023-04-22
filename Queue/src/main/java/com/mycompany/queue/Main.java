package com.mycompany.queue;

/**
 *
 * @author Upeksha
 */
public class Main {
    public static void main(String[] args) {
        Queue que = new Queue(4);
        que.enqueue(20);
        que.enqueue(11);
        que.displayQue();
        que.enqueue(30);
        que.displayQue();
        que.dequeue();
        que.displayQue();
    }
}
