package problems;

import java.util.*;
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
class binaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> out = new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new ArrayDeque<TreeNode>();
        if(root == null) return out;
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> newList = new LinkedList<Integer>();
            for(int i = 0; i < size; i++) {
                TreeNode top = q.remove();
                if(top.left != null)
                    q.add(top.left);
                if(top.right != null)
                    q.add(top.right);
                newList.add(top.val);
            }
            out.add(0, newList);
        }
        return out;
    }
}