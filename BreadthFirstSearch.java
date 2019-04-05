/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BreadthFirstSearch {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return res;
        //Add the root to the end of the queue
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer> newList = new ArrayList<>();
            for(int i = 0; i < size; i++)
            {
                TreeNode temp = queue.poll();
                if(temp != null)
                {
                    newList.add(temp.val);
                }
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            }
            res.add(newList);
        }
        return res;
    }
}