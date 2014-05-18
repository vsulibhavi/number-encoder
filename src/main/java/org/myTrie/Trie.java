package org.myTrie;

/** 
 *  Copyright (C) 2012 Kyle Gorman
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice, 
 *     this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright 
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 * 
 *  THIS SOFTWARE IS PROVIDED BY KYLE GORMAN ''AS IS'' AND ANY EXPRESS OR 
 *  IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN
 *  NO EVENT SHALL KYLE GORMAN BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 *  SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 *  TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 *  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 *  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 *  Trie.java: a prefix trie for Strings
 *  @author Kyle Gorman <kgorman@ling.upenn.edu>
 */
 
import java.util.*;
 
public class Trie {
 
    TrieNode root;
 
    /**
     *  Default contructor
     */
    public Trie() {
       root = new TrieNode();
    }
 
    /**
     *  Contructor that takes a String[] of words to add
     *
     *  @param sa a String[] of words to be added
     */
    public Trie(String[] sa) {
        this(); 
    }
 
    
    public List<String> get(String s)
    {
    	 TrieNode curr_node = root;
         for (int i = 0, n = s.length(); i < n; i++) {
             Character c = s.charAt(i);
             if (curr_node.getChildNodeMaps().containsKey(c)){
             	
             	System.out.println(c);
                 curr_node = curr_node.getChildNodeMaps().get(c);
             	}
             else 
            	 return new ArrayList<String>(); 
         }
         if (curr_node.getChildNodeMaps().containsKey('\0'))
             return curr_node.getEncoders();
         else 
             return new ArrayList<String>(); 
    }
    /**
     *  Adds a string to the trie
     * 
     *  @param s String to add to the trie
     */
    public void put(String s, List<String> dictWords) {
       TrieNode curr_node = root;
        for (int i = 0, n = s.length(); i < n; i++) {
            Character c = s.charAt(i);
            if (curr_node.getChildNodeMaps().containsKey(c))
                curr_node = curr_node.getChildNodeMaps().get(c);
            else {
                curr_node.getChildNodeMaps().put(c, new TrieNode());
                curr_node = curr_node.getChildNodeMaps().get(c);
            }
        }
        curr_node.getChildNodeMaps().put('\0', new TrieNode()); // term
        curr_node.setEncoders(dictWords);
    }
 
    /**
     *  Adds a String[] of words to the trie
     * 
     *  @param sa String[] to add to the trie
     */
    
 
    /**
     *  Adds a Collection<String> of words to the trie
     * 
     *  @param sc Collection<String> to add to the trie
     */
    
 
    /** 
     *  Returns true iff the String is in the trie
     *
     *  @param s query
     *  @return true if the query is in the trie
     */
    public boolean contains(String s) {
        TrieNode curr_node = root;
        for (int i = 0, n = s.length(); i < n; i++) {
            Character c = s.charAt(i);
            if (curr_node.getChildNodeMaps().containsKey(c)){
            	
            	System.out.println(c);
                curr_node = curr_node.getChildNodeMaps().get(c);
            	}
            else 
                return false;
        }
        if (curr_node.getChildNodeMaps().containsKey('\0'))
            return true;
        else 
            return false; 
    }
 
    public static void main(String[] args) {
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

class TrieNode
{
	HashMap<Character, TrieNode> childNodeMaps = new HashMap<Character, TrieNode>();
	public HashMap<Character, TrieNode> getChildNodeMaps() {
		return childNodeMaps;
	}
	public void setChildNodeMaps(HashMap<Character, TrieNode> childNodeMaps) {
		this.childNodeMaps = childNodeMaps;
	}
	List<String> encoders;
	public List<String> getEncoders() {
		return encoders;
	}
	public void setEncoders(List<String> list) {
		this.encoders = list;
	}
}