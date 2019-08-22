package br.com.daily.challenges;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class Daily38Test {
	
	@Test
	public void shouldReturnNullWhenNameIsNull() {
		assertNull(Daily38.formatName(null));
	}
	
	@Test
	public void shouldReturnStringEmptyWhenNameIsStringEmpty() {
		assertEquals("", Daily38.formatName(""));
	}
	
	@Test
	public void shouldReturnTheSameNameWhenHaveOneOnlyName() {
		assertEquals("gustavo", Daily38.formatName("gustavo"));
	}
	
	@Test
	public void shouldReturnTheSameNameWhenHaveOneOnlyNameAndLastName() {
		assertEquals("gustavo bezerra", Daily38.formatName("gustavo bezerra"));
	}
	
	@Test
	public void shouldReturnAbbreviatedMiddleName() {
		assertEquals("gustavo S. bezerra", Daily38.formatName("gustavo souza bezerra"));
	}
	
	@Test
	public void shouldReturnAbbreviatedMiddleNames() {
		assertEquals("gustavo D. S. bezerra", Daily38.formatName("gustavo de souza bezerra"));
	}
	
}