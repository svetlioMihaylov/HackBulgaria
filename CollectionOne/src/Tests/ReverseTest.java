package Tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Impl.Reverse;

public class ReverseTest {
    Reverse test;
    Integer[] original = { 3, 5, 7 };
    Integer[] result={7,5,3};
    LinkedList<Integer> after=new LinkedList<Integer>();
  
    @Before
    public void setUp() throws Exception {
        test=new Reverse();
       after.addAll(Arrays.asList(result));
    }
    

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        assertEquals(after,test.reverse(Arrays.asList(original)));
    }

}
