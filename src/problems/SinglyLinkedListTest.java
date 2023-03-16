package problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lists.SinglyLinkedList;

class SinglyLinkedListTest {
	
	SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>(); 

	@BeforeEach
	void setUp() throws Exception {
		linkedList.add(0);
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
	}

	@Test
	void test() {
		linkedList.add(linkedList.getNode(0), 5);
		assertTrue(linkedList.get(linkedList.size()-1) == 5, "Failed to add 5 to the end of list: linkedList.");
	}

}
