package br.com.daily.challenges;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Daily46Test {

	@Test
	public void shouldRemoveQuestionMarkAtEndOfPhrase() {
		assertEquals("hello", Daily46.removeQuestionMarks("hello?"));
	}

	@Test
	public void shouldRemoveQuestionMarkAtBeginOfPhrase() {
		assertEquals("hello", Daily46.removeQuestionMarks("?hello"));
	}

	@Test
	public void shouldRemoveQuestionMarkAtMiddleOfPhrase() {
		assertEquals("hello", Daily46.removeQuestionMarks("hel?lo"));
	}

	@Test
	public void shouldRemoveAllQuestionMarks() {
		assertEquals("hello Gustavo", Daily46.removeQuestionMarks("?he?ll?o? Gus?tavo?"));
	}

}
