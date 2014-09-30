package com.hack.bulgaria.glob.test;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hack.bulgaria.glob.Glob;

public class TestGlob {
	private Glob glob;
	@Before
	public void setUp() throws Exception {
		glob = new Glob("*.java");
	}

	@After
	public void tearDown() throws Exception {
	}

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	/*@Test
	public void testFileInCurrentDir(){
		assertTrue(glob.matches("D:\\talentboost\\Glob\\src\\com\\hack\\bulgaria\\glob"));
	}
	@Test
	public void testFileInCurrentDirWithWihldCardSymbol(){
		glob.setExpresion("?*.java");
		assertTrue(glob.matches("D:\\talentboost\\Glob\\src\\com\\hack\\bulgaria\\glob"));
	}*/
/*	@Test
	public void testFileInCurrDirAndDecendant(){
		glob.setExpresion("**.java");
		assertTrue(glob.matches("D:\\talentboost\\Glob\\src\\com\\hack\\bulgaria"));
		assertFalse(glob.matches("D:\\8 mix"));
	}*/
	/*@Test
	public void testExactMatch(){
		glob.setExpresion("a.java");
		assertTrue(glob.matches("D:\\talentboost\\Glob\\src\\com\\hack\\bulgaria\\glob"));
		assertFalse(glob.matches("D:\\8 mix"));
	}*/
	@Test 
	public void testContaind(){
		glob = new Glob("Di{nko,mitur}");
		 assertTrue(glob.matches("Dimitur"));
		    assertTrue(glob.matches("Dinko"));
		    assertFalse(glob.matches("Divna"));
	}
	@Test
	public void testWildCardInString(){
		glob = new Glob("a*d");
		 assertTrue(glob.matches("abcd"));
		    assertTrue(glob.matches("abcujawiohtguahwuthawitthawuithawuthaithawtawutd"));
		    assertFalse(glob.matches("abcdej"));
		    assertFalse(glob.matches("abcujawiohtguahwuthawitthawuithawuthaithawtawutd1"));
	}
	@Test
	public void testWithMultipleWildCardsInString(){
		glob = new Glob("a*b*c");
		assertTrue(glob.matches("afbcujawiohtguahwuthawitthawuithawuthaithawtawutdc"));
		 assertFalse(glob.matches("abcujawiohtguahwuthawitthawuithawuthaithawtawutd"));
		 assertFalse(glob.matches("abcdej"));
	}
	@Test
	public void testWithStartingWildCArd(){
		glob = new Glob("*ab");
		 assertFalse(glob.matches("abcdej"));
		 assertTrue(glob.matches("rab"));
	}
	@Test
	public void testSingleWildCard(){
		glob = new Glob("abc?");
		assertFalse(glob.matches("abc")); //false => ? means exactly one character
	    assertTrue(glob.matches("abcd")); //true
	    assertFalse(glob.matches("abcde"));
	}

}
