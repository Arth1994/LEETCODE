import java.util.*;
import java.io.*;

class insertNode {
    Node head;// head of the Linked List

    class Node {

        Node next;
        int data;

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
        }
    }

    public void push(int d1) {

        Node new_node = new Node(d1);

        new_node.next = head;

        head = new_node;

    }

    public void insertAfter(Node tmp, int newData) {
        Node n1 = new Node(newData);

        if (tmp == null) {
            System.out.println("There is no previous node");
            return;
        } else {
            n1.next = tmp.next;
            tmp.next = n1;
        }
    }

    public void append(int data1) {
        Node n2 = new Node(data1);

        if (head == null) {
            head = new Node(data1);
            return;
        }

        n2.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = n2;
        return;

    }

    public static void main(String args[]) {

        System.out.println("Start......");
        insertNode llist = new insertNode();
        llist.append(6);
        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        llist.push(7);
        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        llist.push(1);
        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        llist.append(4);

        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->NUllist
        llist.insertAfter(llist.head.next, 8);

        System.out.println("\nCreated Linked list is: ");
        llist.printList();
    }

}