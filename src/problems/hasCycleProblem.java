package problems;

import java.util.HashMap;
import java.util.Map;


/*My LeetCode Solution	
/Definition for singly-linked list.*/
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
 }
 }
 
public class hasCycleProblem {
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> myMap = new HashMap<>();
        ListNode tail = head;

        for(int i = 0; tail != null; tail = tail.next, i++){
            if(myMap.get(tail) != null)
                return true;
            myMap.put(tail, i);
        }        
        return false;
    }
}