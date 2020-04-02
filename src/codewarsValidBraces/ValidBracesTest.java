package codewarsValidBraces;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidBracesTest {
	
	private static ValidBraces test = new ValidBraces();
	
	@Test
	public void validBracesCheck_openClosedSquareBraces_returnTrue() {
		assertEquals(true, test.validBracesCheck("[]"));
	}
	
	@Test
	public void validBracesCheck_openBraces_returnFalse() {
		assertEquals(false, test.validBracesCheck("["));
	}

}
