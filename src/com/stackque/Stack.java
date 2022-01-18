package com.stackque;

import com.linklist.LinkList;
import com.linklist.Node;

public class Stack <T>{
    LinkList<Node<T>> linkList;

    public Stack(){
        linkList=new LinkList<>();
    }

    public void push(Node<T> element) {
        linkList.insertAtLast(element);
    }

    public Node<T> peak(){
        return linkList.head;
    }

    public void print(){
        linkList.print(linkList);
    }

    public static void main(String[] args) {
        Node<Integer> myFirstNode= new Node<>(70);
        Node<Integer> mySecondNode= new Node<>(30);
        Node<Integer> myThirdNode= new Node<>(56);
        Stack stack=new Stack();
        stack.push(myFirstNode);
        stack.push(mySecondNode);
        stack.push(myThirdNode);
        stack.print();
    }
}
