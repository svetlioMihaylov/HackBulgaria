package Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Impl.OnOffCollection;

public class OnOffTest {
private OnOffCollection test;
    @Before
    public void setUp() throws Exception {
        test=new OnOffCollection() ;
        for(int i=0;i<5;i++)
        test.add(i);
    }
    

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testNull() {
        test.add(null);
       assertEquals(5,test.size());
    }
    @Test
    public void testSecondAdd() {
        test.add(3);
       assertEquals(4,test.size());
    }
    @Test
    public void testAddNormal() {
        test.add(6);
       assertEquals(6,test.size());
    }
}
