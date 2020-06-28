package com.codewithmosh.LinkedList;

public class Main {
    public static void main(String[] args){
        var linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addFirst(9);
        linkedList.addFirst(8);
        linkedList.indexOf(30);
        boolean contains = linkedList.contains(7);
        linkedList.removeFirst();
        linkedList.removeLast();
        var size = linkedList.size();

        System.out.println(size);
    }
}
