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
class invertBinaryTreeProblem {
    TreeNode out = null;
    public TreeNode invertTree(TreeNode root) {
        out = root;
        recInvertTree(root);
        return out;        
    }

    private void recInvertTree(TreeNode root) {
        if(root == null) return;

        recInvertTree(root.left);
        recInvertTree(root.right);
        if(root.left != null || root.right != null) {
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
        }
    }
}