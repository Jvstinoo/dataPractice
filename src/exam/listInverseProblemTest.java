package exam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import lists.*;

class listInverseProblemTest {

	SinglyLinkedList<String> LL = new SinglyLinkedList<String>();
	SinglyLinkedList<String> copyToExpect = new SinglyLinkedList<String>();
	
	SinglyLinkedList<String> shittyInverse(SinglyLinkedList<String> input) {
		for(int i = 0; i < input.size()/2; i++) {
			String temp = input.get(i);
			input.set(i, input.get(input.size()-1));
			input.set(input.size()-1, temp);
		}
		return input;
	}
	
	@BeforeEach
	void setUp() throws Exception {
		LL.add("polar");
		LL.add("spam");
		LL.add("ASTRO");
		LL.add("tent");
		copyToExpect = LL;
	}

	@Test
	void testInverse() {
		SinglyLinkedList<String> result = (SinglyLinkedList<String>) listInverseProblem.inverseList(LL);
		SinglyLinkedList<String> expected = shittyInverse(copyToExpect);
		//System.out.println(expected.get(0) + LL.get(0));
		assertTrue(expected.equals(LL), "Failed to inverse the list.");
	}

}
