import java.util.*;

class simpleLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
        }
    }

    public static void main(String args[]) {

        simpleLinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        linkedList.head.next = second;

        second.next = third;

    }

}