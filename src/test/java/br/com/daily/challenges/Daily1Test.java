package br.com.daily.challenges;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class Daily1Test {
	
	@Test
	public void shouldReturnNullWhenInputIsNull() {
		assertNull(Daily1.formatString(null));
	}
	
	@Test
	public void shouldReturnNullWhenInputIsEmpty() {
		assertNull(Daily1.formatString(""));
	}
	
	@Test
	public void shouldReturnNullWhenInputHaveOneLetter() {
		assertNull(Daily1.formatString("a"));
	}
	
	@Test
	public void shouldReturnNullWhenInputHaveTwoLetters() {
		assertNull(Daily1.formatString("ab"));
	}
	
	@Test
	public void shouldReturnOnlyTheMiddleLetterWhenInputHaveThreeLetters() {
		assertEquals("b", Daily1.formatString("abc"));
	}
	
	@Test
	public void shouldReturnTwoMiddleLettersWhenInputHaveFourLetters() {
		assertEquals("bc", Daily1.formatString("abcd"));
	}
	
	@Test
	public void shouldReturnWithoutTheFirstAndTheLastLetters() {
		assertEquals("he last tes", Daily1.formatString("The last test"));
	}

}
