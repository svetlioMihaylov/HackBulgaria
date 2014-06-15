package exam1Tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import exam1.Monotonous;

public class MonotonousTest {
    private Monotonous m;
    @Before
    public void setUp() throws Exception{
        m= new Monotonous();
    }
    @After
    public void tearDown() throws Exception{
        
    } 
    @Test
    public void test() {
        assertEquals(true, m.monot(Arrays.asList(1,2,3,4,5,6)));
        assertEquals(true, m.monot(Arrays.asList(6,5,4,3,2,1,1,1)));
        assertEquals(false, m.monot(Arrays.asList(1,2,1,4,5,4)));
    }

}
