package exam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import interfaces.*;
import lists.*;

class keepEvenProblemTest {
	
	SinglyLinkedList<String> lsEvenSize = new SinglyLinkedList<String>();
	
	@BeforeEach
	void setUp() throws Exception {
		lsEvenSize.add("Even");
		lsEvenSize.add("Odd");
		lsEvenSize.add("Even");
		lsEvenSize.add("Odd");
		lsEvenSize.add("Even");
		lsEvenSize.add("Odd");
		lsEvenSize.add("Even");
		lsEvenSize.add("Odd");
	
		
	}

	@Test
	void testEvenSize() {
		int removedCount = keepEvenProblem.keepEven(lsEvenSize);
		for(String j: lsEvenSize) {
			System.out.println(j);
		}
		assertTrue(removedCount == 4 && lsEvenSize.size() == 4, "Failed to keep even index in Linked List");
	}
	
	@Test
	void testOddSize() {
		/*
		 * Can use keepEvenProblem.keepEven() if method is static
		 */
		lsEvenSize.remove(lsEvenSize.size()-1);
		int removedCount = keepEvenProblem.keepEven(lsEvenSize);
		assertTrue(removedCount == 3 && lsEvenSize.size() == 4, "Failed to keep even index in Linked List");
	}

}
