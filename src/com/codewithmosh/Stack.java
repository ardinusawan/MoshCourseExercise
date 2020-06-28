package com.codewithmosh;

import java.util.Arrays;

public class Stack {
    private int[]data = new int[5];
    private int size = 0;

    public void push(int value){
        if (size == data.length) throw new StackOverflowError();

        data[size++] = value;
    }

    public int pop() {
        if (size == 0) throw new IllegalStateException();

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

    @Override
    public String toString(){
        var content = Arrays.copyOfRange(data, 0, size);
        return Arrays.toString(content);
    }

}
