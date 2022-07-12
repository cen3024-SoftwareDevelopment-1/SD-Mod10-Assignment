package com.musersoft.mod08.v0;

/**
* Program Name: Lee_module8_unit_test
* Purpose: Unit Testing of Text Analyzer with JUnit.
* @author James Lee
* @since 7/10/2022
*/

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;

public class Lee_module8_unit_test {

	@Test
	public void testGoodWord() {
		boolean wordFlag = Text_Analyzer_App.goodWord("hello");
		assertTrue(wordFlag);
	}

	@Test
	public void testEmptyString() {
		boolean wordFlag = Text_Analyzer_App.goodWord("");
		assertFalse(wordFlag);
	}

	@Test
	public void testNonWord() {
		boolean wordFlag = Text_Analyzer_App.goodWord("s");
		assertEquals(false, wordFlag);
	}

	@Test
	public void testMacbethText() throws IOException {
		Text_Analyzer_App.analyzeText("C:\\JavaProjects\\SD-Week03-Assignment\\tragedy_of_macbeth.txt");
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testBadText() {
		try {
			Text_Analyzer_App.analyzeText("C:\\JavaProjects\\SD-Module-08-JUnit\\badText.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testMain() throws IOException {
		String[] args = null;
		Text_Analyzer_App.main(args);
	}

}
