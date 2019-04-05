import java.util.*;

class intersectionList {
    Node isIntersectionList(Node head1, Node head2) {
        if (head1 != null || head2 != null) {
            return null;
        }

        // function to get the size of the LinkedList
        int size1 = getSize(head1);
        int size2 = getSize(head2);

        // function to get the tail of the LinkedList
        Node tail1 = getTail(head1);
        Node tail2 = getTail(head2);

        if (tail != tail2)
            return null;

        Node longer = size1 > size2 ? head1 : head2;
        Node shorter = size1 < size2 ? head1 : head2;

        //getting the pointer of the longer list to a common point
        longer = getLongerToCommonPoint(longer, Math.abs(size1 - size2));

        while(shoter != longer ){
            shorter = shorter.next;
            longer = longer.next;
        }

        return shorter;

    }
}