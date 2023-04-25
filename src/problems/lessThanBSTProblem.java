package problems;

import javax.management.loading.PrivateClassLoader;

import interfaces.List;
import lists.ArrayList;
import trees.BinaryTreeNode;

public class lessThanBSTProblem {
	public List<BinaryTreeNode<Integer>> lessThanBST(BinaryTreeNode<Integer> root, Integer key){
		List<BinaryTreeNode<Integer>> ls = new ArrayList<>();
		recLessThanBST(root, ls, key);
		return ls;
	}
	
	private void recLessThanBST(BinaryTreeNode<Integer> root, List<BinaryTreeNode<Integer>> ls, Integer key) {
		if(root == null) return;
		
		recLessThanBST(root.getLeftChild(), ls, key);
		if(root.getValue() < key) {
			ls.add(root);
		}
		recLessThanBST(root.getRightChild(), ls, key);
	}
}
