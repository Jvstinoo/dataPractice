package problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import interfaces.Queue;
import queues.ListQueue;

class copyQueueProblemTest {

	Queue<Integer> input = new ListQueue<Integer>();
	Queue<Integer> out = new ListQueue<Integer>();

	@BeforeEach
	void setUp() throws Exception {
		for(int i = 0; i < 10; i++) {
			input.enqueue(i);
		}
		copyQueueProblem sol = new copyQueueProblem();
		out = sol.copyQueue(input);
	}

	@Test
	void testCopy() {
		for(int i = 0; i < input.size(); i++) {
			if(input.dequeue() != out.dequeue())
				fail("Failed to copy queue successfully!");
		}
		assertTrue(true);
	}
}
