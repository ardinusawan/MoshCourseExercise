package com.codewithmosh.LinkedList;

import java.util.NoSuchElementException;

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

    public void removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();

        var second = first.next;
        first.next = null;
        first = second;

        size--;
    }

    public void removeLast(){
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last){
            first = last = null;
            size--;
            return;
        }

        last = getPrevious();
        last.next = null;
        size--;
    }

    private Node getPrevious(){
        var current = first;
        while (current.next != last){
            current = current.next;
        }
        return current;
    }

    public int size(){
        return size;
    }

    public int[] toArray() {
        var current = first;
        var result = new int[size];
        for (int i = 0; i < size; i++){
            result[i] = current.value;
            current = current.next;
        }
        return result;
    }

    public void reverse() {
        if (isEmpty()) return;

        var before = first;
        var current = first.next;
        while (current != null){
            var after = current.next;
            current.next = before;
            before = current;
            current = after;
        }
        first = last;
        last = current;
    }

}
