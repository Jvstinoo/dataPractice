package problems;

import interfaces.Queue;

public class countQueueProblem {
	static int count(Queue<String> que, String str) {
		int out = 0;
		while(!que.isEmpty()) {
			if(que.dequeue() == str)
				out++;
		}
		return out;
	}
}
