import java.util.*;

class linkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data);
            if (n.next != null) {
                System.out.print("->");
            }
            n = n.next;
        }
    }

    public static void main(String args[]) {
        linkedList ll = new linkedList();
        ll.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        ll.head.next = second;

        second.next = third;

        ll.printList();
    }
}