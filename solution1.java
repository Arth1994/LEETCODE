/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */


import java.util.*;
import java.io.*;


class Solution1 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int number1 = 0, number2 = 0, i = 0, sum = 0, j = 0;
        if (l1 == null || l2 == null)
            return null;
        while (l1 != null) {
            number1 += l1.val * (int) Math.pow(10, i++);
            l1 = l1.next;
        }
        while (l2 != null) {
            number2 += l2.val * (int) Math.pow(10, j++);
            l2 = l2.next;
        }
        sum = number1 + number2;
        ListNode head = new ListNode(sum % 10);
        ListNode curr = head;
        while (sum >= 0) {
            sum = sum / 10;
            int num = sum % 10;
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return head;
    }
}

class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for (int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        while (node != null) {
            result += node.val + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode l1 = stringToListNode(line);
            line = in.readLine();
            ListNode l2 = stringToListNode(line);

            ListNode ret = new Solution1().addTwoNumbers(l1, l2);

            String out = listNodeToString(ret);

            System.out.print(out);
        }
    }
}