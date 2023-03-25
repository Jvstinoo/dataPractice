package MockExam2;

import java.util.EmptyStackException;

import org.junit.internal.matchers.StacktracePrintingMatcher;

public class QueueStackWrapper {
	
	public static interface Stack<E> {
		
		public int size();
		public boolean isEmpty();
		public void push(E e);
		public E pop();
		public E top();
		public void clear();
	}
	
	public static interface Queue<E> {

		public void enqueue(E e);
		public E dequeue();
		public E front();
		public boolean isEmpty();
		public void clear();
		public int size();
	}
	
	public static class DoublyLinkedQueue<E> implements Queue<E> {

		@SuppressWarnings("unused")
		private class Node {
			private E value;
			private Node next, prev;
			
			public Node(E value, Node next, Node prev) {
				this.value = value;
				this.next = next;
				this.prev = prev;
			}
			
			public Node(E value) {
				this(value, null, null); // Delegate to other constructor
			}
			
			public Node() {
				this(null, null, null); // Delegate to other constructor
			}

			public E getValue() {
				return value;
			}

			public void setValue(E value) {
				this.value = value;
			}

			public Node getNext() {
				return next;
			}

			public void setNext(Node next) {
				this.next = next;
			}
			
			public Node getPrev() {
				return prev;
			}

			public void setPrev(Node prev) {
				this.prev = prev;
			}
			
			public void clear() {
				value = null;
				next = prev = null;
			}				
		} // End of Node class

		// private fields
		int currentSize;
		Node header, trailer;
		
		public DoublyLinkedQueue() {
			currentSize = 0;
			header = new Node();
			trailer = new Node(null, null, header);
			header.setNext(trailer);
		}
		
		@Override
		public void enqueue(E e) {
			if (e == null)
				throw new IllegalArgumentException("Parameter cannot be null");
			/* Elements are added at the rear of the queue */
			Node newNode = new Node(e, trailer, trailer.getPrev());
			trailer.getPrev().setNext(newNode);
			trailer.setPrev(newNode);
			currentSize++;
		}

		@Override
		public E dequeue() {
			/* Elements are removed from the front of the queue */
			if (isEmpty())
				return null;
			Node rmNode = header.getNext();
			E result = rmNode.getValue();
			header.setNext(rmNode.getNext());
			rmNode.getNext().setPrev(header);
			rmNode.clear();
			currentSize--;
			return result;
		}

		@Override
		public E front() {
			if (isEmpty())
				return null;
			return header.getNext().getValue();
		}

		@Override
		public boolean isEmpty() {
			return size() == 0;
		}

		@Override
		public void clear() {
			while (!isEmpty())
				dequeue();
		}

		@Override
		public int size() {
			return currentSize;
		}

	}
	
	public static class QueueStack<E> implements Stack<E> {
		
		/*TODO ADD YOUR CODE HERE*/
		private QueueStackWrapper.Queue<E> q ;
		
		public QueueStack() {
			/*TODO ADD YOUR CODE HERE*/
			q = new QueueStackWrapper.DoublyLinkedQueue<E>();
		}

		@Override
		public int size() {
			/*TODO ADD YOUR CODE HERE*/
			return q.size();
		}

		@Override
		public boolean isEmpty() {
			/*TODO ADD YOUR CODE HERE*/
			return q.isEmpty();
		}

		@Override
		public void push(E e) {
			/*TODO ADD YOUR CODE HERE*/
			q.enqueue(e);
			for(int i = 0; i < q.size()-1; i++) {
				q.enqueue(q.dequeue());
			}
		}

		@Override
		public E pop() {
			/*TODO ADD YOUR CODE HERE*/
			return q.dequeue();
		}

		@Override
		public E top() {
			/*TODO ADD YOUR CODE HERE*/
			return q.front();
		}

		@Override
		public void clear() {
			/*TODO ADD YOUR CODE HERE*/
			while(!q.isEmpty())
				q.dequeue();
		}
		
	}
	
	
	
}