package problems;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class evaluateTreeProblem {
    public boolean evaluateTree(TreeNode root1) {
        TreeNode root = root1;
        recEvalTree(root);
        return root.val == 1 ? true : false;
    }

    private void recEvalTree(TreeNode root) {
        if(root == null) return;
        
        recEvalTree(root.left);
        recEvalTree(root.right);

        if(root.val == 3) { // AND CASE
            if(root.left.val == root.right.val)
                root.val = root.left.val;
            else
                root.val = 0;
        }
        else if(root.val == 2) { // OR CASE
            if(root.left.val == 1 || root.right.val == 1)
                root.val = 1;
            else
                root.val = 0;
        }
    }
}