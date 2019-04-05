import java.util.*;

public class BinarySearchTree {

    static class Node {

        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }

        public Node() {

        }

        public int compareTo(Node node) {
            return 1;
        }
    }

    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int key) {
        root = insertBinary(root, key);
    }


    private Node insertBinary(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (root.key > key)
            root.left = insertBinary(root.left, key);
        else
            root.right = insertBinary(root.right, key);

        return root;
    }

    public void print() {
        printInorder(root);
    }

    private void printInorder(Node root) {
        if (root != null) {
            printInorder(root.left);
            System.out.println(root.key);
            printInorder(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(100);
        bst.insert(20);
        bst.insert(30);
        bst.insert(500);
        bst.insert(10);
        bst.insert(40);
        bst.print();
    }
}
