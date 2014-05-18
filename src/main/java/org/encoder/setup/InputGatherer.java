package org.encoder.setup;

import java.util.Dictionary;
import java.util.HashMap;

public class InputGatherer {

	private HashMap<Character, Character> mapOfAlphaToNum;
	
	private ReadDictionery readDictionery = new ReadDictionery();
	
	public InputGatherer() {

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
	
	public void initializeNumberToDictWordsLookup()
	{
		
	}
}
