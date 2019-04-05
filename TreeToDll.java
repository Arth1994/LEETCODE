import sun.reflect.generics.tree.Tree;

import java.util.*;

/*
 *
 * Program to Convert A  Binary Tree to LinkedList
 *
 * */
class TreeToDll {
    public class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public TreeNode root, head, tail;

    public void treeToDll(TreeNode node) {
        if (node == null)
            return;

        treeToDll(node.left);

        if (head == null) {
            head = tail = node;
        } else {
            tail.left = node;
            node.right = tail;
            tail = node;
        }

        treeToDll(node.right);
    }

    public void printList(TreeNode node) {
        while (node != null) {
            System.out.println(node.val);
        }
    }

}