package LinkedListBasic;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String [] args){
        LinkedList <Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(12);
        l1.add(45);
        l1.add(10);
        l1.add(15);
        l1.add(16);
        l1.add(12);
        l1.add(15);
        System.out.println(l1);
        System.out.println(l1.peek());
        System.out.println(l1.peekFirst());
        System.out.println(l1.peekLast());
    }
}
