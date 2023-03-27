package problems;

import java.util.Iterator;

import org.junit.jupiter.api.extension.ExtendWith;

import interfaces.*;
import set.*;

public class setPracticeProblem{
	public static void setPractice(Set<Integer> set) {
		for(Integer s: set) {
			System.out.println(s);
		}
		
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			Integer currVal = iterator.next();
			System.out.println(currVal); 
		}
		
		Iterator<Integer> iterator2 = set.iterator();
		for(Integer iterator3 = iterator2.next(); iterator2 != null; iterator3 = iterator2.next()) {
			System.out.println(iterator3);
		}
	}
	
	public static <E> boolean isDisjointed(Set<E> s, Set<E> s2) {
		return s.difference(s2).isEmpty();
	}

}
