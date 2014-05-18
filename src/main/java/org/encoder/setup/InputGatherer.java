package org.encoder.setup;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

import org.myTrie.Trie;

public class InputGatherer {

	private HashMap<Character, Character> mapOfAlphaToNum;
	private Trie trie = new Trie();
	private HashMap<String, List<String>> mapOfNumToDictWords = new HashMap<String, List<String>>();
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
		StringBuffer tempBuffer  = new StringBuffer();
		
		for(String word : readDictionery.getDictioneryWords())
		{
			
			for(Character character : word.toCharArray())
			{
				
				tempBuffer.append(mapOfAlphaToNum.get(character));
				
			}
			
			String num = tempBuffer.toString();
			if(mapOfNumToDictWords.get(num) == null)
			{
				List<String> words = new ArrayList<String>();
				words.add(word);
				mapOfNumToDictWords.put(num, words );
			}
			else
			{
				List<String> words = mapOfNumToDictWords.get(num);
				words.add(word);
				mapOfNumToDictWords.put(num, words );
			}
		}
		
		addToTrie();
	}

	private void addToTrie() {

		for(String num : mapOfNumToDictWords.keySet())
		{
			trie.put(num, mapOfNumToDictWords.get(num));
		}
		
	}
}
