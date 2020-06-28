package com.codewithmosh;

public class Queue {
    private int[]data = new int[5];
    private int size = 0;
    private int front = 0;
    private int rear = 0;

    public void enqueue(int value) {
        if (size == data.length) throw new StackOverflowError();

        rear++;
        data[size++] = value;
    }

    public int dequeue() {
        var first = data[front];

        for (int i = front+1; i < size; i++){
           data[i-1] = data[i];

           if(rear >= size){
              data[i] = 0;
            }
        }

        size--; rear--;
        return first;
    }

    public int peek(){
        return data[front];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull() {
        return data.length == size;
    }
}
