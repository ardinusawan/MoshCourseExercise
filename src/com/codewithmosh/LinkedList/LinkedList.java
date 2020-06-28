package com.codewithmosh.LinkedList;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public LinkedList(){
        this.size = 0;
    }

    public void addFirst(int item){
        var node = new Node(item);
        if (isEmpty()){
            first = last = node;
        }
        else{
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty()){
            first = last = node;
        }
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int searchValue){
        for(int i = 0; i < size; i++){
            var current = first;
            int index = 0;
            while (current != null){
               if (current.value == searchValue) return index;
               else {
                   current = current.next;
                   index++;
               }
            }
        }
        return -1;
    }

    public boolean contains(int value){
        return indexOf(value) != -1;
    }

    //deleteFirst
    //deleteLast
}
