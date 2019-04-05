import java.util.*;

class sumsLists {
    Node head;

    static class Node {
        double data;
        Node next;

        public Node(double d) {
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

    public Node sumOfLists(Node l1, Node l2) {
        double number1 = 0, number2 = 0, i = 0, j = 0, sum;
        Node head1 = null, prev = null;
        while (l1 != null) {
            number1 = number1 + ((l1.data) * Math.pow(10, i++));
            l1 = l1.next;
        }
        while (l2 != null) {
            number2 = number2 + ((l2.data) * Math.pow(10, i++));
            l2 = l2.next;
        }
        sum = number1 + number2;
        while (sum != 0) {
            double newData = sum % 10;
            Node a = new Node(newData);
            prev = a;
            if (i == 0) {
                head = a;
            } else {
                prev.next = a;
            }
            sum = sum / 10;
            i++;
        }
        return head1;
    }

    public static void main(String args[]) {
        sumsLists ll = new sumsLists();

        sumsLists ll1 = new sumsLists();

        ll.head = new Node(3);

        Node second = new Node(5);
        Node third = new Node(8);

        ll1.head = new Node(5);

        Node second1 = new Node(1);

        Node third1 = new Node(2);

        Node fourth1 = new Node(2);

        ll.head.next = second;

        second.next = third;

        ll1.head.next = second1;

        second1.next = third1;

        third1.next = fourth1;

        System.out.println("List1");

        ll.printList(ll.head);

        System.out.println();

        System.out.println("List2");

        ll1.printList(ll1.head);

        Node h1 = ll.sumOfLists(ll.head, ll1.head);

        ll.printList(h1);

    }

}