package com.linklist;

public class LinkList<T> {
     static Node head;

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertFirst(70);
        list.insertFirst(30);
        list.insertFirst(56);
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

    public void insertFirst(T data){
        Node <T> node = new Node<>();
        node.data=data;
        node.next=null;
        node.next=head;
        head=node;
    }
}
