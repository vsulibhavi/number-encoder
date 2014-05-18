package org.encoder.algorithm;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class NumberEnocdeTest {

	@Test
	public void testEncode() {

	NumberEnocde enocde = new NumberEnocde();
	enocde.encode("212");
	List<String> enocodedWords = new ArrayList<String>();
	enocodedWords.add("2ac");
	enocodedWords.add("2ad");
	
	assertEquals(enocodedWords, enocde.encode("212"));
	
	}

}
