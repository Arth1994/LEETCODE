/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class TrimBST {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null)
            return null;
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        if(L <= root.val && root.val <= R)
            return root;
        if(root.val < L)
            return root.right;
        if(root.val >= R)
            return root.left;
        return null;
    }
}