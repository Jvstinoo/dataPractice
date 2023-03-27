package problems;

import interfaces.*;
import stacks.*;

public class balancedParenthesisProblem {
	public static boolean balancedParenthesis(String expr) {
		Stack<Character> leftParen = new ArrayListStack<>();
		
		for(int i = 0; i < expr.length(); i++) {
			if(expr.charAt(i) == ')') {
				if(leftParen.isEmpty())
					return false;
				else
					leftParen.pop();
			}
			else if(expr.charAt(i) == '(')
				leftParen.push(expr.charAt(i));
		}
		return leftParen.isEmpty();
	}
	
	public static int evalPostfix(String expr) {
		Stack<Integer> operand = new ArrayListStack<>();
		String operator = "+-*/";
		
		
		for(int i = 0; i < expr.length(); i++) {
			if(operand.size() != 2)
				operand.push(Character.getNumericValue(expr.charAt(i)));
			else {
				Integer operandOne = operand.pop();
				Integer operandTwo = operand.pop(); 
				switch (expr.charAt(i)) {
					case '*':
						operand.push(operandOne * operandTwo);
						break;
					case '/':
						operand.push(operandTwo / operandOne);
						break;
					case '+':
						operand.push(operandTwo + operandOne);
						break;
					case '-':
						operand.push(operandTwo - operandOne);
						break;
				}
			}
		}
		return operand.pop();
	}
}
