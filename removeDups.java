import java.util.*;

class removeDups {
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

    public void removeDuplicates(Node n) {
        n = head;
        HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
        Node prev = null;
        while (n != null) {
            if (h1.containsKey(n.data)) {
                prev.next = n.next;
            } else {
                h1.put(n.data, 1);
                prev = n;
            }
            n = n.next;
        }
    }

    public static void main(String args[]) {
        removeDups ll = new removeDups();
        ll.head = new Node(4);
        Node second = new Node(2);
        Node third = new Node(1);
        Node fourth = new Node(3);
        Node fifth = new Node(2);

        ll.head.next = second;

        second.next = third;

        third.next = fourth;

        fourth.next = fifth;

        ll.removeDuplicates(ll.head);
        ll.printList();
    }

}