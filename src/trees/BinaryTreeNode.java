package trees;

import interfaces.TreeNode;

public class BinaryTreeNode<E> implements TreeNode<E>{
	private E value;
	private BinaryTreeNode<E> leftChild;
	private BinaryTreeNode<E> rightChild;
	private BinaryTreeNode<E> parent;

	
	public BinaryTreeNode(E value) {
		super();
		this.value = value;
		this.leftChild = null;
		this.rightChild = null;
		this.parent = null;

	}

	
	public BinaryTreeNode(E value, BinaryTreeNode<E> parent, BinaryTreeNode<E> leftChild, BinaryTreeNode<E> rightChild) {
		super();
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.parent = parent;
	}

	@Override
	public E getValue() {
		return this.value;

	}


	public BinaryTreeNode<E> getLeftChild() {
		return leftChild;
	}


	public void setLeftChild(BinaryTreeNode<E> leftChild) {
		this.leftChild = leftChild;
	}


	public BinaryTreeNode<E> getRightChild() {
		return rightChild;
	}


	public void setRightChild(BinaryTreeNode<E> rightChild) {
		this.rightChild = rightChild;
	}


	public void setValue(E value) {
		this.value = value;
	}


	public BinaryTreeNode<E> getParent() {
		return parent;
	}


	public void setParent(BinaryTreeNode<E> parent) {
		this.parent = parent;
	}

}
