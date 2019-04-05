import java.util.*;

import linkedListPartition.Node;

class palindromeLinkedList {
    // Driver program and boiler plate funtion implemented for other linkedList
    // codes
    boolean isPalindrome(Node head) {
        Node fast = head;
        deleteMiddleNode.Node slow = head;

        Stack<Integer> s = new Stack<Integer>();

        while (fast != null && fast.next != null) {
            s.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            int top = s.pop().intValue();

            if (top != slow.data)
                return false;

            slow = slow.next;
        }

        return true;

    }
}