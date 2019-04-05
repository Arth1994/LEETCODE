import java.util.*;

class deleteMiddleNode {

    Node head;

    static class Node {
        char data;
        Node next;

        public Node(char d) {
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

    public void deleteMiddle(Node c) {
        Node ahead = head;
        Node prev = head;

        if (c == head || c.next == null) {
            System.out.println("I see what you did there :|");
            return;
        }

        while (c.data != ahead.data) {
            prev = ahead;
            ahead = ahead.next;
        }

        if (ahead.data == c.data) {
            prev.next = ahead.next;
            ahead.next = null;
        }

    }

    public static void main(String args[]) {
        deleteMiddleNode ll = new deleteMiddleNode();
        ll.head = new Node('a');
        Node second = new Node('b');
        Node third = new Node('c');
        Node fourth = new Node('d');
        Node fifth = new Node('e');
        Node sixth = new Node('f');

        ll.head.next = second;

        second.next = third;

        third.next = fourth;

        fourth.next = fifth;

        fifth.next = sixth;

        System.out.println("Before Deleting We Get");
        ll.printList();
        System.out.println("\n");
        ll.deleteMiddle(fourth);
        ll.printList();

    }

}