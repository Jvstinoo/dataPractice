package problems;

import interfaces.Queue;
import queues.*;

public class copyQueueProblem {
	Queue<Integer> copyQueue(Queue<Integer> que){
		Queue<Integer> out = new ListQueue<Integer>();
		
		int count = 0;
		while(count < que.size()) {
			Integer currElement = que.dequeue();
			que.enqueue(currElement);
			out.enqueue(currElement);
			count ++;
		}
		return out;
	}
}
