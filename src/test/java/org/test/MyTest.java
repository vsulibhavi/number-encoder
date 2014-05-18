package org.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class MyTest {

	private HashMap<Character, Character> mapOfAlphaToNum;

	@Before
	public void test() {

		
		mapOfAlphaToNum = new HashMap<Character, Character>();
		mapOfAlphaToNum.put('a', '1');
		mapOfAlphaToNum.put('b', '1');
		
		mapOfAlphaToNum.put('c', '2');
		mapOfAlphaToNum.put('d', '2');
		
		mapOfAlphaToNum.put('x', '3');
		mapOfAlphaToNum.put('z', '3');
		
		mapOfAlphaToNum.put('g', '2');
		mapOfAlphaToNum.put('h', '2');
		
	
	}

}
