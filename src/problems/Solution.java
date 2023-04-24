package problems;

import java.util.HashMap;
import java.util.Map;
import problems.TreeNode;

 //Definition for a binary tree node./

class Solution {
	
	int deepestlevel = 0;
	int sum = 0; // Sum of nodes at deepestLevel.
    public int deepestLeavesSum(TreeNode root) {
        return recDeepestLeavesSum(root, 0);
    }
    
    private int recDeepestLeavesSum(TreeNode root, int depth) {
    	if(root == null) return 0;
    	
    	if(root.left == null && root.right == null) {
	    	if(depth == deepestlevel) {
	    		sum += root.val;
	    	}
	    	else if(depth > deepestlevel) {
	    		deepestlevel = depth;
	    		sum = root.val;
	    	}
    	}
    	recDeepestLeavesSum(root.left, depth+1);
    	recDeepestLeavesSum(root.right, depth+1);
    	return sum;
    }
}