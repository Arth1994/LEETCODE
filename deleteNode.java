import java.util.*;

class deleteNode {
    Node head; // head of list

    /* Linked list Node */
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
        /*
         * 1 & 2: Allocate the Node & Put in the data
         */
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /*
     * This function prints contents of linked list starting from the given node
     */
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public void delete(int position) {
        Node temp = head;

        if (head == null) {
            System.out.println("There are no nodes");
            return;
        }

        // Check if the Node has data or not and go to the Node at specific position
        for (int i = 0; temp != null && i < position; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;

        Node next = temp.next.next;

        temp.next = next;

    }

    public static void main(String[] args) {
        /* Start with the empty list */
        deleteNode llist = new deleteNode();

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);
        llist.push(9);
        llist.push(6);
        llist.push(55);
        llist.push(11);

        System.out.println("\nCreated Linked list is: ");
        llist.printList();

        llist.delete(8); // Delete node at position 4

        System.out.println("\nLinked List after Deletion: ");
        llist.printList();
    }
}
