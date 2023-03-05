package exam;
import lists.*;

/*
 * Given a Linked List, modify it in a way that only the Nodes at even
 * indexes are kept.
 */
public class keepEvenProblem {
	public static <E> int keepEven(SinglyLinkedList<E> ls) {
		int count = 0;
		int i = 0;
		
		if(ls.size() % 2 == 0)
			i = ls.size()-1;
		else
			i = ls.size()-2;
		
		while(i > 0) {
			ls.remove(i);
			count++;
			i-=2;
		}
		return count;
	}
}
