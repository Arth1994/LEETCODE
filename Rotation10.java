import java.util.*;

public class Rotation10 {

    /**
     * Left Rotation
     */
    public BinarySearchTree.Node leftRotation(BinarySearchTree.Node node) {
        BinarySearchTree.Node temp = node.right;
        temp = node.right;
        node.right = temp.left;
        temp.left = node;
        return temp;
    }


    /*
     * Right Rotation
     * */
    public BinarySearchTree.Node rightRotation(BinarySearchTree.Node node) {
        BinarySearchTree.Node temp;
        temp = node.left;
        node.left = temp.right;
        temp.right = node;
        return temp;
    }

    /*
     * Right-Left Rotate
     * */
    public BinarySearchTree.Node rightLeftRotate(BinarySearchTree.Node node) {
        node.right = rightRotation(node.right);
        return leftRotation(node);
    }

    /*
     * Left-Right Rotate
     * */
    public BinarySearchTree.Node leftRightRotate(BinarySearchTree.Node node) {
        node.left = leftRotation(node.left);
        return rightRotation(node);
    }
}
