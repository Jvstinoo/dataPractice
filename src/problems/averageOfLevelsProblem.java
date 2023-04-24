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
class averageOfLevelsProblem {
    List<Double> sumOfVals = new ArrayList<Double>();
    List<Integer> levelCount = new ArrayList<Integer>();
    public List<Double> averageOfLevels(TreeNode root) {
        recAvgOfLevels(root, 0);
        for(int i=0; i<sumOfVals.size(); i++){
            sumOfVals.set(i, sumOfVals.get(i)/levelCount.get(i));
        }
        return sumOfVals;
    }
    private void recAvgOfLevels(TreeNode root, int currLevel){
        if(root == null) return;

        if(sumOfVals.size() < currLevel+1){ //Level has not been visited
            sumOfVals.add(Double.valueOf(root.val));
            levelCount.add(1);
        }
        else{ //Level has been visited, we can add to it
            sumOfVals.set(currLevel, sumOfVals.get(currLevel)+root.val);
            levelCount.set(currLevel, levelCount.get(currLevel)+1);
        }
        recAvgOfLevels(root.left, currLevel+1);
        recAvgOfLevels(root.right, currLevel+1);
    }
}