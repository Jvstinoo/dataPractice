/*
 * LeetCode Question: 
 * 225. Implement Stack using Queues
 * 
 */

package problems;

import interfaces.Queue;
import queues.*;

public class StackFromQueue<E> {
	
	private Queue<E> queue;
	private Queue<E> emptyQueue; 
	
    public StackFromQueue() {
		// TODO Auto-generated constructor stub
    	queue = new ListQueue<>();
    	emptyQueue = new ListQueue<>();
    }
    
    public void push(E x) {
    	emptyQueue.enqueue(x);
    	while(!queue.isEmpty()) {
    		emptyQueue.enqueue(queue.dequeue());
    	}
    	queue = emptyQueue;
    	emptyQueue = new ListQueue<>();
    }
    
    public E pop() {
    	return queue.dequeue();
    }
    
    public E top() {
        return queue.front();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}