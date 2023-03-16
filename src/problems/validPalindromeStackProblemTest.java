package problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class validPalindromeStackTest {

	String validOdd;
	String validEven;
	String nonValidEven;
	String nonValidOdd;
	
	@BeforeEach
	void setUp() throws Exception {
		validOdd = "SOS";
		validEven = "SOOS";
		nonValidEven = "SOOTOS";
		nonValidOdd = "STOPS";
	}

	@Test
	void testValidOdd() {
		assertTrue(validPalindromeStackProblem.isValidPalindrome(validOdd) == true, "Test failed!");
	}
	
	@Test
	void testValidEven() {
		assertTrue(validPalindromeStackProblem.isValidPalindrome(validEven) == true, "Test failed!");
	}
	
	@Test
	void testNonValidEven() {
		assertTrue(validPalindromeStackProblem.isValidPalindrome(nonValidEven) == false, "Test failed!");
	}
	
	@Test
	void testNonValidOdd() {
		assertTrue(validPalindromeStackProblem.isValidPalindrome(nonValidOdd) == false, "Test failed!");
	}

}
