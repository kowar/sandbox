package janschmidt.hellogit;

import junit.framework.TestCase;

public class PalindromeTest extends TestCase {

	public void testIsPalindrome() {
		System.out.println("Test is Palindrome");
		assertTrue("Ist ein Palindrome", Palindrome.isPalindrome("Otto"));

	}

}
