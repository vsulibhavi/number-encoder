package org.encoder.algorithm;

import java.util.List;

import org.encoder.setup.InputGatherer;

public class NumberEnocde {

	private InputGatherer gatherer = new InputGatherer();
	
	public List<String> encode(String phoneNumber)
	{
		gatherer.initializeNumberToDictWordsLookup();
		
		for(Character digit : phoneNumber.toCharArray())
		{
			
		}
		
		return null;
		
		
	}
}
