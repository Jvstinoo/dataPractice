package exam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class addBeforeProblemTest {
	
	@BeforeEach
	void setUp() {
	}
	
	@Test
	void testHeadOnly() {
		addBeforeProblem<Integer> sol = new addBeforeProblem<Integer>();
		sol.defineHead(1);
		sol.addBefore(0, 1);
		
        assertEquals(Integer.valueOf(0), sol.getHead().getElement());
	}
	
	@Test 
	void testMultipleNodes() {
		addBeforeProblem<Integer> sol = new addBeforeProblem<Integer>();
		sol.defineHead(1);
		sol.getHead().setNext(new Node<Integer>(2));
		sol.getHead().getNext().setNext(new Node<Integer>(1));
		sol.addBefore(-1, 1);
		
		Node<Integer> head = sol.getHead();
		
		Integer[] expected = {-1,1,2,-1,1};
		int i = 0;
		
		while(head != null) {
			if(head.getElement() != expected[i])
				fail("Failed to add -1 before each 1");
			i++;
			head = head.getNext();
		}
		assertTrue(true);
		
	}

}
