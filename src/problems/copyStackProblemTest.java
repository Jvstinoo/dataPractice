package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.StandardWatchEventKinds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import interfaces.*;
import stacks.*;
class copyStackProblemTest {

	Stack<Integer> stack = new ArrayListStack<>(); 
	Stack<Integer> copyStack = new ArrayListStack<>(); 
	
	@BeforeEach
	void setUp() throws Exception {
		stack.push(1);
		stack.push(2);
		
		copyStack.push(1);
		copyStack.push(2);
	}

	@Test
	void test() {
		copyStackProblem<Integer> sol = new copyStackProblem<>();
		Stack<Integer> ssStack = sol.copyStack(stack);
		
		while (!ssStack.isEmpty()) {
			System.out.println(ssStack.pop());
		}
		assertTrue(sol.copyStack(stack).equals(copyStack));
	}

}
