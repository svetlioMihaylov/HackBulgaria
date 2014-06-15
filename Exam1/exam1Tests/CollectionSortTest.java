package exam1Tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import exam1.CollectionSort;

public class CollectionSortTest {
    private CollectionSort cs;
    @Before
    public void setUp() throws Exception{
        cs= new CollectionSort();
    }
    @After
    public void tearDown() throws Exception{
        
    } 
    @Test
    public void test() {
        
        assertEquals(Arrays.asList(1,26,32,42,51,63,72), cs.sort(Arrays.asList(72,63,51,42,32,26,1)));
        assertEquals(Arrays.asList(1,2,3,4,5,6,7), cs.sort(Arrays.asList(4,3,2,5,1,6,7)));
    }

}
