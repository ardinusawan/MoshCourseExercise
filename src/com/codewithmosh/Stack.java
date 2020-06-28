package com.codewithmosh;

public class Stack {
    private int[]data = new int[5];
    private int size = 0;

    public void push(int value){
       data[size] = value;
       size++;
    }
}
