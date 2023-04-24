package testers;

import trees.BinaryTree;
import trees.BinaryTreeNode;

public class TreeBuilder {

	public static void main(String[] args) {
		/*
		 * Individual nodes
		 */
		// Tree of single node. Root is Gil
		BinaryTree<String> T1 = new BinaryTree<String>(new BinaryTreeNode<String>("Gil"));
		// Tree of single node. Root is Ben.
		BinaryTree<String> T2 = new BinaryTree<String>(new BinaryTreeNode<String>("Ben"));
		// Tree of single node. Root is Amy
		BinaryTree<String> T3 = new BinaryTree<String>(new BinaryTreeNode<String>("Amy"));
		// Tree of single node. Root is Apu.
		BinaryTree<String> T4 = new BinaryTree<String>(new BinaryTreeNode<String>("Apu"));
		// Tree of single node. Root is Ned
		BinaryTree<String> T5 = new BinaryTree<String>(new BinaryTreeNode<String>("Ned"));
		
		/*
		 * Building the Tree
		 */
		// Tree of 3 nodes. Root is Jan, left child is Gil and right child us Ben
		BinaryTree<String> T6 = new BinaryTree<String>(new BinaryTreeNode<String>("Jan"), T1, T2);
		// Tree of 2 nodes. Root is Mel, left child is Amy, no right child
		BinaryTree<String> T7 = new BinaryTree<String>(new BinaryTreeNode<String>("Mel"), T3, null);
		// Tree of 2 nodes. Root is Bob, no left child, right child is Apu
		BinaryTree<String> T8 = new BinaryTree<String>(new BinaryTreeNode<String>("Bob"), null, T4);
		
		// Tree of 4 nodes. Root is Bil, left child is the Mel sub-tree and right child is Ned.
		BinaryTree<String> T9 = new BinaryTree<String>(new BinaryTreeNode<String>("Bil"), T7, T5);
		// Tree of 6 nodes. Root is Rob, left child is the Jan sub-tree and right child Bob
		BinaryTree<String> T10 = new BinaryTree<String>(new BinaryTreeNode<String>("Rob"), T6, T8);
		// Tree of 10 nodes. Root is Tim, left child is the Bob sub-tree and the right child is the Bil sub-tree
		BinaryTree<String> T11 = new BinaryTree<String>(new BinaryTreeNode<String>("Tim"), T10, T9);

		
		T11.print();
	}

}
