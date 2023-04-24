package problems;

import lists.SinglyLinkedList;
import trees.BinaryTreeNode;
import interfaces.List;

public class findNodesAtLevelProblem <E> {
	public List<BinaryTreeNode<E>> findNodesAtLevel(BinaryTreeNode<E> root, int levelWanted){
		List<BinaryTreeNode<E>> ls = new SinglyLinkedList<>();
		recFindNodesAtLevel(root, ls, levelWanted, 1);
		return ls;
	}
	
	private void recFindNodesAtLevel(BinaryTreeNode<E> root, List<BinaryTreeNode<E>> ls, int levelWanted, int currLevel) {
		if(root == null) return;
		
		if(currLevel == levelWanted)
			ls.add(root);
		recFindNodesAtLevel(root.getLeftChild(), ls, levelWanted, currLevel+1);
		recFindNodesAtLevel(root.getRightChild(), ls, levelWanted, currLevel+1);
	}
}
