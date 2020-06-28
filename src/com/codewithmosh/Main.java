package com.codewithmosh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        var queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.dequeue();
        queue.dequeue();
        queue.enqueue(1);
        queue.enqueue(2);

        var front = queue.peek();
        var empty = queue.isEmpty();
        var full = queue.isFull();
    }
}
