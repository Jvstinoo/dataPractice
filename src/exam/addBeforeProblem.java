package exam;
/*
 * Given two parameters x and y, every time y is found, add x before y.
 */

public class addBeforeProblem<E> {
	private Node<E> head;
	
	public void defineHead(E val) { head = new Node<E>(val);}
	
	public Node<E> getHead(){ return head;}
	
	public void addBefore(E addThis, E beforeThis) {
		Node<E> prevNode = null;
		Node<E> currNode = head;

		while(currNode != null) {
			if(currNode.getElement() == beforeThis) {
				Node<E> newNode = new Node<E>(currNode, addThis);
				// Means head's value is the one we are looking for in which case we would just set newNode's next to previous header and newNode is now the new header. 
				if(prevNode == null) 
					head = newNode;
				else
					prevNode.setNext(newNode);
			}
			prevNode = currNode;
			currNode = currNode.getNext();
		}
	}	
}
