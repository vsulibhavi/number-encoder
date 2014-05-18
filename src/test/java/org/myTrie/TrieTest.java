package org.myTrie;

import java.util.Arrays;

import org.junit.Test;

public class TrieTest {

	@Test
	public void test() {
	       Trie t = new Trie();
	        t.put("APPLES", Arrays.asList(new String[]{"green apples","red apples"}));
	        t.put("APPLE", Arrays.asList(new String[]{"green apple","red apple"}));
	        t.put("APPLESAUCE",Arrays.asList(new String[]{"green applesauce","red applesauce"}));
	        t.put("APPLICATION",Arrays.asList(new String[]{"green appllication","red apple"})); 
	        System.out.println(t.contains("FOO")    + " " + false);
	        System.out.println(t.contains("APPL")   + " " + false);
	        System.out.println(t.contains("APPLES") + " " + false);
	        System.out.println(t.contains("APPLE")  + " " + true);
	        
	        System.out.println(t.get("APPLE")  + " " + true);
	    }
	}


