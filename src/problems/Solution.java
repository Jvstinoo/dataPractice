package problems;

import java.util.HashMap;
import java.util.Map;
import problems.TreeNode;

 //Definition for a binary tree node./

class Solution {
	 
    Map<Integer, Integer> map = new HashMap<>();
    public int deepestLeavesSum(TreeNode root) {
        int max = 0;
        recDeepestLeavesSum(root, 0);
        for(Integer i: map.keySet()){
            if(map.get(i) > max)
                max = map.get(i);
        }
        return max;
    }

    private void recDeepestLeavesSum(TreeNode root, int count){
        if(root == null) return;

        if(root.left == null && root.right == null) {
            if(map.containsKey(count)){
                Integer c = map.get(count);
                map.put(count, root.val + c);
            }
            else
                map.put(count, root.val);
        }
        recDeepestLeavesSum(root.left, count+=1);

        recDeepestLeavesSum(root.right, count+=1);

    }
}