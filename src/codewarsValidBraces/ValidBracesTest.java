package codewarsValidBraces;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidBracesTest {
	
	private static ValidBraces test = new ValidBraces();
	
	@Test
	public void validBracesCheck_openClosedBraces_returnTrue() {
		assertEquals(true, test.validBracesCheck("[]"));
		assertEquals(true, test.validBracesCheck("{}"));
		assertEquals(true, test.validBracesCheck("()"));
	}
	
	@Test
	public void validBracesCheck_openSquareBrace_returnFalse() {
		assertEquals(false, test.validBracesCheck("["));
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
	
	// Acceptance Criteria Four [(])
	
	@Test
	public void validBracesCheck_acceptanceCriteriaFour_returnFalse() {
		assertEquals(false, test.validBracesCheck("[(])"));
	}
	
	// Acceptance Criteria Five [({})](]
	
		@Test
		public void validBracesCheck_acceptanceCriteriaFive_returnFalse() {
			assertEquals(false, test.validBracesCheck("[({})](]"));
		}
}
