package LinkedListBasic;

public class MyLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
        Node head;
    }
    Node head;

    public void printLinkedList(){
        Node n = head;
        while(n != null){
            System.out.print(n.data+ "->");
            n = n.next;
        }
        System.out.print("null");
    }

    public static void main(String [] args) {
        MyLinkedList ll = new MyLinkedList();
        Node first = ll.new Node(10);
        ll.head = first;

        Node second = ll.new Node(12);
        first.next = second;

        Node third = ll.new Node(14);
        second.next = third;

        ll.printLinkedList();
    }
}
