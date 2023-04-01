package problems;

import interfaces.Stack;
import stacks.*;

public class copyStackProblem<E>{
	public Stack<E> copyStack(Stack<E> stack){
		Stack<E> copy = new ArrayListStack<>();
		Stack<E> out = new ArrayListStack<>();
		
		while(!stack.isEmpty()) {
			copy.push(stack.pop());
		}
		while(!copy.isEmpty()) {
			E pop = copy.pop();
			stack.push(pop);
			out.push(pop);
		}
		return out;
	}
}
