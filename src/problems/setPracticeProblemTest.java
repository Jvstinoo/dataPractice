package problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import interfaces.*;
import junit.runner.BaseTestRunner;
import set.*;

class setPracticeProblemTest {
	
	Set<Integer> set = new ArraySet<>();
	Set<Integer>set2 = new ArraySet<>(); 

	@BeforeEach
	void setUp() throws Exception {
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);	
	
		set2.add(6);
		set2.add(7);	
	}

	@Test
	void test() {
		setPracticeProblem.setPractice(set);
	}
	
	@Test
	void disjointTest() {
		assertTrue(setPracticeProblem.isDisjointed(set, set2) == false);
	}

}
