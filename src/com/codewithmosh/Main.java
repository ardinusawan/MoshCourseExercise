package com.codewithmosh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // Stack
        var stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        var top = stack.peek();

        var empty = stack.isEmpty();
        // int[]

        System.out.println(stack.toString());
    }
}
