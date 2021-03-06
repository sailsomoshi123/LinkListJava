package com.linklist;

public class LinkList<T> {
    public static Node head;

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertAtLast(56);
        list.insertAtLast(30);
        list.insertAtLast(40);
        list.insertAtLast(70);
        print(list);
        list.sortList();
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
            while (lastNode.next != null) {
                previousToLastNode = lastNode;
                lastNode = lastNode.next;
            }
            previousToLastNode.next = null;
        }
    }

    public int search(T data) {
        Node<T> temp = head;
        int i=1;
        boolean flag=false;
        if (head == null) {
            System.out.println("list is empty");
        } else {
            while (temp != null) {
                if (temp.data == data) {
                    System.out.println("element is present");
                    flag=true;
                    break;
                }
                temp = temp.next;
                i++;
            }
        }return i;
    }
    
    public void addAfterSearch(T searchData,T data){
        int index=search(searchData);
        insertByPosition(index,data);
    }

    public void delete(T data){
        Node<T> current = head;
        Node<T> temp = null;
        while (current!=null && current.data!=data) {
            temp = current;
            current = current.next;
        }
        if (current==null) {
            return;
        }
        temp.next = current.next;
    }

    public static int size(){
        Node temp = head;
        int count = 0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public  <T extends Comparable> void  sortList() {
        Node<T> current = head, temp = null;
        T index;
        if (head == null) {
            System.out.println("LinkedList is Empty");
        }
        else {
            while (current != null) {
                temp = current.next;

                while (temp != null) {
                    if (temp.data.compareTo(current.data)<0){
                        index =  current.data;
                        current.data = temp.data;
                        temp.data = index;
                    }
                    temp = temp.next;
                }
                current = current.next;
            }
        }
    }
}
