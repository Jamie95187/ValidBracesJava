package codewarsValidBraces;

public class ValidBraces {

	public boolean validBracesCheck(String input) {
		if(input.contains("[]") || input.contains("()")) {
			return true;
		}
		return false;
	}
	
}
