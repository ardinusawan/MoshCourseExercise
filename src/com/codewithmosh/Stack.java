package com.codewithmosh;

public class Stack {
    private int[]data = new int[5];
    private int size = 0;

    public void push(int value){
       data[size++] = value;
    }

    public int pop() {
        var top = data[size-1];
        data[size-1] = 0;
        size--;
        return top;
    }

    public int peek() {
       return data[size-1];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
