package com.codewithmosh;

public class Queue {
    private int[]data = new int[5];
    private int size = 0;

    public void enqueue(int value) {
        if (size == data.length) throw new StackOverflowError();

        data[size++] = value;
    }
}
