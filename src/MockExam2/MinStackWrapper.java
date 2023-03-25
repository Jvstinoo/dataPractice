package MockExam2;

import org.w3c.dom.DOMImplementationSource;

import interfaces.*;

public class MinStackWrapper {
	
	/**
	 * Hint: How does implementing this using object composition with a normal stack 
	 * help us reduce time complexity? 
	 * 
	 * If it were to help us, do we use a LinkedStack or an ArrayStack?
	 */
	
	public static interface MinStack<E> {
		public void push(E e);
		public E pop();
		public E top();
		public E getMin();
		public boolean isEmpty();
		public int size();
		public void clear();
	}
	
	public static class MinStackImp<E extends Comparable<? super E>> implements MinStack<E> {
		
		/*TODO ADD YOUR CODE HERE*/
		private class Node<E>{
			private E val;
			private E min;
			private Node<E> next; 
			
			private Node(E val, E min, Node<E> next) {
				this.val = val;
				this.min = min;
				this.next = next;
			}
		}
		
		Node<E> head;
		int size;		
	
		public MinStackImp() {
			/*TODO ADD YOUR CODE HERE*/
			head = null;
			size = 0;
		}

		@Override
		public void push(E e) {
			/*TODO ADD YOUR CODE HERE*/	
			if(head == null)
				head = new Node<E>(e, e, null); 
			else {
				E newMin = e.compareTo(head.min) > 0? head.min : e;
				head = new Node<E>(e, newMin, head);
			}
			size++;
		}

		@Override
		public E pop() {			
			/*TODO ADD YOUR CODE HERE*/
			E val = head.val;
			head = head.next;
			size--;
			return val;
		}

		@Override
		public E top() {
			/*TODO ADD YOUR CODE HERE*/
			return head.val;
		}

		@Override
		public E getMin() {
			/*TODO ADD YOUR CODE HERE*/
			return head.min;
		}

		@Override
		public boolean isEmpty() {
			/*TODO ADD YOUR CODE HERE*/
			return head == null;
		}

		@Override
		public int size() {
			/*TODO ADD YOUR CODE HERE*/
			return size;
		}

		@Override
		public void clear() {
			/*TODO ADD YOUR CODE HERE*/
			while(head != null)
				head = head.next;
		}
	}
}