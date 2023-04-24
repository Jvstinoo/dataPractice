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
class goodNodesProblem {
    int count = 0;
    public int goodNodes(TreeNode root) {
        recGoodNodes(root, root.val);
        return count;
    }

    private void recGoodNodes(TreeNode root, int maxNode){
        if(root == null) return;
        int newMax = maxNode;
        if(root.val >= maxNode) {
            newMax = root.val;
            count++;
        }

        recGoodNodes(root.left, newMax);
        recGoodNodes(root.right, newMax);
    }
}