package linkedList;

import oop.notes4.Parent;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value){
        head = new Node(value, head);
        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node temp = new Node(value);
        tail.next = temp;
        tail = temp;
        size++;
    }

    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node curr = head;
        for (int i = 0; i < index-1; i++) {
            curr = curr.next;
        }
        curr.next = new Node(value, curr.next);
        size++;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        Node temp = get(size-2);
        int ans = tail.value;
        tail = temp;
        tail.next = null;
        size--;
        return ans;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int ans = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return ans;
    }

    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
           temp = temp.next;
        }

        return temp;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node node) {
            this.value = value;
            this.next = node;
        }
    }


}
