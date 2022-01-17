package com.linklist;

public class LinkList {
     static Node head;

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.head = new Node(57);
        Node mySecondNode = new Node(30);
        Node myThirdNode = new Node(70);
        head.next=mySecondNode;
        mySecondNode.next=myThirdNode;
        print(list);
    }
    public static void print(LinkList list){
        Node currentNode = list.head;
        System.out.println("Linklist: ");
        while (currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }

    }
}
