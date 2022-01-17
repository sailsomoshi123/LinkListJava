package com.linklist;

public class LinkList<T> {
     static Node head;

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertAtLast(56);
        list.insertAtLast(30);
        list.insertAtLast(70);
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

    public  void insertAtLast(T data){
        Node node = new Node();
        node.data=data;
        node.next=null;
        if (head==null){
            head=node;
        }
        else {
            Node temp = head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
}
