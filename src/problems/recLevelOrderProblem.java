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
class recLevelOrderProblem {
    List<List<Integer>> outList = new LinkedList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        recLevelOrder(root, 0);
        return outList;
    }
    private void recLevelOrder(TreeNode root, int currLevel) {
        if(root == null) return;

        if(outList.size() < currLevel+1) {
            List<Integer> newList = new LinkedList();
            newList.add(root.val);
            outList.add(newList);
        }
        else{
            outList.get(currLevel).add(root.val);
        }
        recLevelOrder(root.left, currLevel+1);
        recLevelOrder(root.right, currLevel+1);
    }
}