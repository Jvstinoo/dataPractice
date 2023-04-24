package interfaces;


public interface Tree<E> {
	public TreeNode<E> root();
	public TreeNode<E> left(TreeNode<E> p);
	public TreeNode<E> right(TreeNode<E> p);
	public TreeNode<E> sibling(TreeNode<E> p); 
	public boolean isEmpty();
	public int size();
}	
