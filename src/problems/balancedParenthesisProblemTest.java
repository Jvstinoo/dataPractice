package problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class balancedParenthesisProblemTest {
	
	String s1;
	String s2; // For postfix

	@BeforeEach
	void setUp() throws Exception {
		s1 = "((6*9)-8)";
		s2 = "43*2+";
	}

	@Test
	void test() {
		assertTrue(balancedParenthesisProblem.balancedParenthesis(s1) == true, "Failed!");
	}
	
	@Test
	void testPostfix() {
		System.out.println(balancedParenthesisProblem.evalPostfix(s2));
		assertTrue(balancedParenthesisProblem.evalPostfix(s2) == 14);
	}

}
