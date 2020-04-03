package codewarsValidBraces;

import java.util.Stack;

public class ValidBraces {
	
	//[]{}
	public boolean validBracesCheck(String input) {
		Stack<Character> braceStack = new Stack<Character>();
		if(input.charAt(0) != '{' && input.charAt(0) != '[' && input.charAt(0) != '(') {
			return false;
		}
		braceStack.push(input.charAt(0));
		for(int i = 1; i < input.length(); i++) {
			switch(input.charAt(i)) {
			case ']':
				if(braceStack.peek() == '(' || braceStack.peek() == '{') {
					return false;
				}
				braceStack.pop();
				break;
			case '}':
				if(braceStack.peek() == '(' || braceStack.peek() == '[') {
					return false;
				}
				braceStack.pop();
				break;
			case ')':
				if(braceStack.peek() == '{' || braceStack.peek() == '[') {
					return false;
				}
				braceStack.pop();
				break;
			default:
				braceStack.push(input.charAt(i));
			}
		}
		if(braceStack.empty()) {
			return true;
		}
		return false;
	}
	
}
