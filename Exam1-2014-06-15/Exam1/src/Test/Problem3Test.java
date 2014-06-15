package Test;



import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Implm.Problem3;

public class Problem3Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        assertEquals(true,Problem3.isMonotonus(Arrays.asList(1,2,3,4,5,6)));
        assertEquals(true,Problem3.isMonotonus(Arrays.asList(6,5,4,3,2,1,1,1)));
        assertEquals(false,Problem3.isMonotonus(Arrays.asList(1,2,1,4,5,4)));
        
    }

}
