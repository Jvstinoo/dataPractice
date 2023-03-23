package problems;

import interfaces.*;
import stacks.*;

/*
 * LeetCode Question: 
 * 155. Min Stack
 * 
 * https://leetcode.com/problems/min-stack/
 * 
 * Solution adapted to DS class. Not most efficient since using two stacks, and not creating the DS itself. 
 * A more optimal solution below!
 */
class MinStack {
    private Stack<Integer> s;
    private Stack<Integer> min;

    public MinStack() {
        s = new LinkedStack<Integer>();
        min = new LinkedStack<Integer>();
    }
    
    public void push(int val) {
        s.push(val);
        if(min.isEmpty() || val <= getMin())
            min.push(val);
    }
    
    public void pop() {
        if(getMin() == s.top())
            min.pop();
        s.pop();
    }
    
    public int top() {
        return s.top();
    }
    
    public int getMin() {
        return min.top();
    }
}


/*LeetCode solution
class MinStack {
    private Stack<Integer> s;
    private Stack<Integer> min;

    public MinStack() {
        s = new Stack<Integer>();
        min = new Stack<Integer>();
    }
    
    public void push(int val) {
        s.push(val);
        if(min.isEmpty() || val <= getMin())
            min.push(val);
    }
    
    public void pop() {
        if(getMin() == s.peek())
            min.pop();
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 * 
 * 
 * More optimal solution: This solution actually creates the DS itself with the use of nodes.
 * For each node it adds, it determines if the last value is greater than the one to be added and assigns the min value
 * to the node itself.
 * 
 * class MinStack {
	private Node head;
        
    public void push(int x) {
        if (head == null) 
            head = new Node(x, x, null);
        else 
            head = new Node(x, Math.min(x, head.min), head);
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
        
    private class Node {
        int val;
        int min;
        Node next;
            
        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
 */