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
class getMinimumDifferenceProblem {
    Integer lastVal = null;
    Integer minDiff = null;
    public int getMinimumDifference(TreeNode root) {
        recHelper(root);
        return minDiff;
    }
    private void recHelper(TreeNode root){
        if(root == null) return;

        recHelper(root.left);
        if(lastVal != null) {
            if(minDiff == null || root.val - lastVal < minDiff)
                minDiff = root.val - lastVal; 
        }
        lastVal = root.val;
        recHelper(root.right);        
    }
}