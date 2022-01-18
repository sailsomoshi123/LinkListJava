package com.linklist;

public class Node<T> {
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }


    public Node() {

    }

    @Override
    public String toString() {
        return "" + data +
                "";
    }
}

