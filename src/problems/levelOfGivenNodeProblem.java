package problems;

public class levelOfGivenNodeProblem {
	public int levelOfGivenNode(TreeNode root, TreeNode find) {
		return recLevelOfGivenNode(root, find, 1);
	}
	private int recLevelOfGivenNode(TreeNode root, TreeNode find, int level) {
		if(root == null) return -1;
		
		if(root.val == find.val) return level;
		
		int leftLevel = recLevelOfGivenNode(root.left, find, level+1);
		int rightLevel = recLevelOfGivenNode(root.right, find, level+1);
		return leftLevel != -1 ? leftLevel : rightLevel;
	}
}
