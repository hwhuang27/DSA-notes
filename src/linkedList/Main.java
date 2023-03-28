package linkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(69);
        list.insert(55, 4);
        list.display();
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();


    }
}
