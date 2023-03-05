package exam;

import interfaces.*;
import lists.*;

/*
 * Given a List, invert the list. 
 * Algorithm should be O(n).
 */

public class listInverseProblem {
	public static <E> List<E> inverseList(List<E> ls){		
		List<E> out = new SinglyLinkedList<E>();
		
		for(E node: ls) {
			out.add(0, node);
		}
		
		return out;
	}
}
