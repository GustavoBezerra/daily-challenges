package br.com.daily.challenges;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class Daily47Test {
	
	@Test
	public void resolutionExpected() {
		String converted = Daily47.convertToNumbers("The sunset sets at twelve o' clock.");
		assertEquals("20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11", converted);
	}
	
	@Test
	public void shouldReturnNull() {
		assertNull(Daily47.convertToNumbers(null));
	}

}
