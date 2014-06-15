package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Implm.Problem2;

public class Problem2Test {
    private ArrayList<Integer > original=new ArrayList<Integer>();
    private ArrayList<Integer> expected=new ArrayList<Integer>();
    @Before
    public void setUp() throws Exception {
        for(int i=0;i<5;i++)
        {
            original.add(i);
            expected.add(4-i);
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
       assertEquals(expected,Problem2.reverse(original));
    }

}
