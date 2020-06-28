package com.codewithmosh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        var linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.reverse();

        var array = linkedList.toArray();
        System.out.println(Arrays.toString(array));
    }
}
