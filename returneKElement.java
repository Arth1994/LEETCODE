import java.util.*;

import deleteMiddleNode.Node;

class returnKElement{
    public Node nthElement(Node head, int k){
        Node p1 = head;
        Node p2 = head;

        for(int i = 0; i < n; i++)
        {
            if(p1 == null)
            {
                return null;
            }
        }

        while(p1 != null)
        {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;

    }
}