package problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import interfaces.Queue;
import queues.CircularArrayQueue;

class countQueueProblemTest {

	Queue<String> que = new CircularArrayQueue<String>(); //{Apu, Ned, Apu, Jil, Ned, Apu}
	
	@BeforeEach
	void setUp() throws Exception {
		que.enqueue("Apu");
		que.enqueue("Ned");
		que.enqueue("Apu");
		que.enqueue("Jil");
		que.enqueue("Ned");
		que.enqueue("Apu");
	}

	@Test
	void testApuCount() {
		assertTrue(countQueueProblem.count(que, "Apu") == 3, "Failed to count occurrences of Apu in que.");
	}
}
