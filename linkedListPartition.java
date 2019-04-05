import java.util.*;

class linkedListPartition {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    public void printList(Node h) {
        Node n = h;
        while (n != null) {
            System.out.print(n.data);
            if (n.next != null) {
                System.out.print("->");
            }
            n = n.next;
        }
    }

    public void partitionList(Node start, int x) {

        Node headPtr = start;

        Node tailPtr = start;

        while (start != null) {
            Node newListNode = start.next;
            if (start.data < x) {
                start.next = headPtr;
                headPtr = start;
            } else {
                tailPtr.next = start;
                tailPtr = start;
            }
            start = newListNode;
        }

        tailPtr.next = null;
        printList(headPtr);
    }

    public static void main(String args[]) {
        linkedListPartition ll = new linkedListPartition();
        ll.head = new Node(3);
        Node second = new Node(5);
        Node third = new Node(8);

        Node fourth = new Node(5);

        Node fifth = new Node(10);

        Node six = new Node(2);

        Node seven = new Node(2);

        Node eight = new Node(1);

        ll.head.next = second;

        second.next = third;

        third.next = fourth;

        fourth.next = fifth;

        fifth.next = six;

        six.next = seven;

        seven.next = eight;

        System.out.println("Before Partition");

        ll.printList(ll.head);

        System.out.println();

        System.out.println("After Partition");

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        ll.partitionList(ll.head, x);

        sc.close();

    }

}