package Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Impl.BracketCorrect;

public class BracketTest {
    private BracketCorrect test;

    @Before
    public void setUp() throws Exception {
        test=new BracketCorrect();
       //
    }
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSize() {
        assertEquals(15, test.size());
        
    }
    @Test 
    public void testLast(){
        assertEquals(")", test.last());
    }
    @Test
    public void testFirst(){
        assertEquals("(", test.checkFirst());
    }
    @Test
    public void testAll()
    {
        assertEquals(false, test.check("()()())))((())("));
    }
}
