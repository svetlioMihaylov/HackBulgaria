package exam1Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import exam1.Reverse;

public class ReverseTest {
    private Reverse r;
    @Before
    public void setUp() throws Exception{
        r= new Reverse();
    }
    @After
    public void tearDown() throws Exception{
        
    } 
    @Test
    public void test() {
        
        assertEquals(Arrays.asList(6,5,2,3,4,7), r.ListReverse(Arrays.asList(7,4,3,2,5,6)));
                
      
        assertEquals(Arrays.asList(1,2,3,4,5,6,7), r.ListReverse(Arrays.asList(7,6,5,4,3,2,1)));
    }
        
    

}
