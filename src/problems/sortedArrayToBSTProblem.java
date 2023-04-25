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
class sortedArrayToBSTProblem {
    public TreeNode sortedArrayToBST(int[] nums) {
        return recSortedArrayToBST(nums, 0, nums.length-1);
    }

    private TreeNode recSortedArrayToBST(int[] nums, int left, int right){
        if(left > right) return null;

        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = recSortedArrayToBST(nums, left, mid-1);
        root.right = recSortedArrayToBST(nums, mid+1, right);
        return root;
    }
}