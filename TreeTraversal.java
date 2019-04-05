import java.util.*;

public class TreeTraversal {
    void inOrderTraversal(TreeToDll.TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            visit(node);
            inOrderTraversal(node.right);
        }
    }

    void preOrderTraversal(TreeToDll.TreeNode node) {
        if (node != null) {
            visit(node);
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
        }
    }

    void postOrderTraversal(TreeToDll.TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
            visit(node);
        }
    }

    private void visit(TreeToDll.TreeNode node) {
        //Prints the required Node
    }
}
