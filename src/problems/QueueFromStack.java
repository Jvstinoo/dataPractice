package problems;

import interfaces.*;
import stacks.*;
/*
 * LeetCode Question: 
 * 232. Implement Queue using Stacks
 * 
 * https://leetcode.com/problems/implement-queue-using-stacks/
 * 
 */

//Solution adapted to DS
class QueueFromStack {
    private Stack<Integer> stack;
    private Stack<Integer> emptyStack;

    public QueueFromStack() {
	    stack = new LinkedStack<Integer>();
	    emptyStack = new LinkedStack<Integer>();    
    }
    
    public void push(int x) {
        while(!stack.isEmpty())
            emptyStack.push(stack.pop());
        emptyStack.push(x);
        while(!emptyStack.isEmpty())
            stack.push(emptyStack.pop());
    }
    
    public int pop() {
        return stack.pop();
    }
    
    public int peek() {
        return stack.top();
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}
/*
 * LeetCode Solution
class MyQueue {
    private Stack<Integer> stack;
    private Stack<Integer> emptyStack;

    public MyQueue() {
    stack = new Stack<Integer>();
    emptyStack = new Stack<Integer>();    
    }
    
    public void push(int x) {
        while(!stack.isEmpty())
            emptyStack.push(stack.pop());
        emptyStack.push(x);
        while(!emptyStack.isEmpty())
            stack.push(emptyStack.pop());
    }
    
    public int pop() {
        return stack.pop();
    }
    
    public int peek() {
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */