package codewarsValidBraces;

public class ValidBraces {

	public boolean validBracesCheck(String input) {
		boolean curlyClosed = true;
		boolean squareClosed = true;
		boolean parenthesesClosed = true;
		for(int i = 0; i < input.length(); i++) {
			switch(input.charAt(i)) {
			case '[':
				squareClosed = !squareClosed;
				break;
			case ']':
				squareClosed = !squareClosed;
				break;
			case '{':
				curlyClosed = !curlyClosed;
				break;
			case '}':
				curlyClosed = !curlyClosed;
				break;
			case '(':
				parenthesesClosed = !parenthesesClosed;
				break;
			case ')':
				parenthesesClosed = !parenthesesClosed;
				break;
			}
		}
		if(curlyClosed == true && squareClosed == true && parenthesesClosed == true) {
			return true;
		}
		return false;
	}
	
}
