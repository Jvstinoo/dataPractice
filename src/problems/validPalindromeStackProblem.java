package problems;
import interfaces.*;
import lists.*;
import stacks.*;

public class validPalindromeStack {
	public static boolean isValidPalindrome(String word) {
		ArrayListStack<Character> wordStack = new ArrayListStack<Character>();
		ArrayListStack<Character> halfStack = new ArrayListStack<Character>();
		
		for(int i=0; i<word.length()/2; i++) {
			wordStack.push(word.charAt(i));
		}
		
		int j = word.length()/2;
		
		if(word.length() % 2 != 0)
			j++;
		
		for(int k=j; k<word.length(); k++) {
			if(wordStack.pop() != word.charAt(k))
				return false;
		}
		return true;
	}
}
