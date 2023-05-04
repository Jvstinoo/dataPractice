package problems;

import java.util.Queue;
import java.util.ArrayDeque;
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
class minDepthProblem {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new ArrayDeque<TreeNode>();
        int depth = 1;
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();

            for(int i = 0; i < size; i++) {
                TreeNode top = q.remove();
                if(top.left == null && top.right == null)
                    return depth;
                if(top.left != null)
                    q.add(top.left);
                if(top.right != null)
                    q.add(top.right);
            }
            depth++;
        }
        return depth;        
    }
}