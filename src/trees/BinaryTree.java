package trees;


import interfaces.List;
import interfaces.Tree;
import interfaces.TreeNode;
import queues.ListQueue;
import lists.*;

public class BinaryTree<E> implements Tree<E>{
	
	private BinaryTreeNode<E> root;
	
	/**
	 * Creates a Binary Tree with just one node (its root)
	 * @param root - node that will be the root of the Tree. Can be null if it's an empty Tree.
	 */
	public BinaryTree(BinaryTreeNode<E> root) {
		super();
		this.root = root;
	}
	/**
	 * BinaryTree where we assign a root and its two children.
	 * @param root - node that will be the root of this tree. If null, then the children should also be null, otherwise a NullPointerException will occur. Can you tell why??
	 * @param T1 - Left sub tree (child)
	 * @param T2 - Right sub-tree (child)
	 */
	public BinaryTree(BinaryTreeNode<E> root, BinaryTree<E> T1, BinaryTree<E> T2) {
		super();
		this.root = root;
		if (T1 != null) {
			BinaryTreeNode<E> temp = (BinaryTreeNode<E>)T1.root();
			this.root.setLeftChild(temp);
			temp.setParent(this.root);
			
		}
		if (T2 != null) {
			BinaryTreeNode<E> temp = (BinaryTreeNode<E>)T2.root();

			this.root.setRightChild(temp);
			temp.setParent(this.root);

		}

	}

	@Override
	/**
	 * Returns the root of the Binary Tree
	 * @returns The TreeNode that is root to this Binary Tree
	 */
	public TreeNode<E> root() {
		return this.root;
	}


	/**
	 * Check whether p is a valid TreeNode. Valid means it's not null. There are methods where we want to avoid null nodes.
	 * @param p - Existing TreeNode from the BinaryTree that we want to confirms its validity.
	 */
	private void check(TreeNode<E> p) {
		if (p==null) {
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * Returns the left child of the Tree
	 * @param p -  Existing TreeNode from the BinaryTree that we want to return it's left child. The node needs to be valid.
	 */
	@Override
	public TreeNode<E> left(TreeNode<E> p) {
		this.check(p);
		BinaryTreeNode<E> temp = (BinaryTreeNode<E>)p;
		return temp.getLeftChild();
	}
	
	
	/**
	 * Returns the right child of the Tree.
	 * @param p -  Existing TreeNode from the BinaryTree that we want to return it's left child. The node needs to be valid.
	 */
	@Override
	public TreeNode<E> right(TreeNode<E> p) {
		this.check(p);
		BinaryTreeNode<E> temp = (BinaryTreeNode<E>)p;
		return temp.getRightChild();

	}

	/**
	 * Returns the sibling of the given node p. 
	 * If p is the left child it returns the right child and if p is the right child it returns the left child.
	 * The sibling could be null if p is an only child.
	 * 
	 * @param p -  Existing TreeNode from the BinaryTree that we want to return it's sibling. p needs to be valid.
	 */
	@Override
	public TreeNode<E> sibling(TreeNode<E> p) {
		this.check(p);
		BinaryTreeNode<E> temp = (BinaryTreeNode<E>)p;
		if (temp.getParent().getLeftChild() != temp) {
			return temp.getRightChild();
		}
		else {
			return temp.getLeftChild();
		}

	}
	
	/**
	 * Returns whether the Tree is empty.
	 * 
	 * @return - True if Tree is empty (no root), false otherwise.
	 */
	@Override
	public boolean isEmpty() {
		return this.size() == 0;
	}

	/**
	 * Returns the size of the Tree.
	 * 
	 * @return The size of the Tree (number of nodes it has)
	 */
	@Override
	public int size() {
		return this.sizeAux(this.root);
	}

	private int sizeAux(BinaryTreeNode<E> N) {
		if (N == null) {
			return 0;
		}
		else {
			return 1 + this.sizeAux(N.getLeftChild()) + this.sizeAux(N.getRightChild());
		}
		
	}

	/**
	 * Prints the Tree from left to right. 
	 * 
	 * Example: For a Tree of 3 nodes,
	 *     A
	 *    / \
	 *   B   C
	 *   
	 * Will be printed as:
	 * 
	 *     C
	 * A    
	 *     B
	 */
	public void print() {
		this.printAux(this.root, 0);
	}

	private void printAux(BinaryTreeNode<E> N, int i) {
		if (N != null) {
			this.printAux(N.getRightChild(), i + 8);
			System.out.println();
			for (int j=0; j < i; ++j) {

				System.out.print(" ");
			}
			System.out.println(N.getValue());
			this.printAux(N.getLeftChild(), i + 8);
		}
		
	}
	
	/**
	 * Finds and returns the node in the BinaryTree that has value e. Runs in pre-order. Preferable if Tree has no duplicates.
	 * @param e - Value of the node we want to find.
	 * @param N - Starting point for the search. If this is not the node with e, we proceed to search its sub-trees.
	 * @return - The TreeNode that has the value e. If more than one node has e returns the first on it finds.
	 */
	private BinaryTreeNode<E> find(E e, BinaryTreeNode<E> N) {
		if (N == null) {
			return null;
		}
		else if (N.getValue().equals(e)) {
			return N;
		}
		else {
			BinaryTreeNode<E> temp = find(e, N.getLeftChild());
			if (temp != null) {
				return temp;
			}
			else {
				return find(e, N.getRightChild());
			}
 		}
	}
	
	public List<E> inOrderTraversal(){
		List<E> ls = new SinglyLinkedList<>();
		recInOrderTraversal(root, ls);
		return ls;
		
	}
	private void recInOrderTraversal(BinaryTreeNode<E> node, List<E> ls) {
		if(node == null) return;
		ls.add(node.getValue());
		recInOrderTraversal(node.getLeftChild(), ls);
		recInOrderTraversal(node.getRightChild(), ls);
	}
	
}
