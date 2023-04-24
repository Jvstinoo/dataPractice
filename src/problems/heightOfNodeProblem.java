package problems;

public class heightOfNodeProblem {
	public int heightOfNode(TreeNode root, Integer val) {
		findNode(root, val);
		return recHeightOfNode(findNode(root, val))-1;
	}
	
	private TreeNode findNode(TreeNode root, Integer find) {
		if(root == null) return root;
		
		if(root.val == find)
			return root;
		TreeNode lefTreeNode = findNode(root.left, find);
		TreeNode rightTreeNode = findNode(root.right, find);
		return lefTreeNode != null ? lefTreeNode : rightTreeNode;
	}
	
	private int recHeightOfNode(TreeNode root) {
		if(root == null) return 0;
		
		int leftMax = recHeightOfNode(root.left);
		int rightMax = recHeightOfNode(root.right);
		//leftMax+=1; Can either add to both like this or call the max of them
		//rightMax+=1;
		return leftMax > rightMax ? leftMax + 1 : rightMax + 1;
		
	}

}
