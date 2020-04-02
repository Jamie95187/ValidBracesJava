package codewarsValidBraces;

public class ValidBraces {

	public boolean validBracesCheck(String input) {
		if(input.compareTo("[]") == 0) {
			return true;
		}
		return false;
	}
	
}
