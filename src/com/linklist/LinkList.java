package com.linklist;

public class LinkList<T> {
    static Node head;

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertAtLast(56);
        list.insertAtLast(30);
        list.insertAtLast(70);
        System.out.println("before removing last element");
        print(list);
        System.out.println("After removing last element");
        list.deleteLast();
        print(list);
    }

    public static void print(LinkList list) {
        Node currentNode = list.head;
        System.out.println("Linklist: ");
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void insertFirst(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAtLast(T data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void insertByPosition(int index, T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node<T> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void deleteFirst() {
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Linklist is empty");
        } else {
            Node<T> lastNode = head;
            Node<T> previousToLastNode = null;
            while (lastNode.next!=null){
                previousToLastNode=lastNode;
                lastNode=lastNode.next;
            }
            previousToLastNode.next=null;
        }

    }
}
