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
	public void validBracesCheck_openSquareBraces_returnFalse() {
		assertEquals(false, test.validBracesCheck("["));
	}

	@Test
	public void validBracesCheck_openClosedCurlyBraces_returnTrue() {
		assertEquals(true, test.validBracesCheck("{}"));
	}
	
	@Test
	public void validBracesCheck_openClosedSquareAndCurlyBraces_returnTrue() {
		assertEquals(true, test.validBracesCheck("[]{}"));
	}
	
	// Acceptance Criteria One (){}[]
	
	@Test
	public void validBracesCheck_acceptanceCriteriaOne_returnTrue() {
		assertEquals(true, test.validBracesCheck("(){}[]"));
	}
	
	// Acceptance Criteria Two ({[]})
	
	@Test
	public void validBracesCheck_acceptanceCriteriaTwo_returnTrue() {
		assertEquals(true, test.validBracesCheck("({[]})"));
	}
	
	// Acceptance Criteria Three (}
	
	@Test
	public void validBracesCheck_acceptanceCriteriaThree_returnFalse() {
		assertEquals(false, test.validBracesCheck("(}"));
	}
	
}
