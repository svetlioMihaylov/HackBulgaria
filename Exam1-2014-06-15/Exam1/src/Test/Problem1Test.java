package Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Implm.Problem1;

public class Problem1Test {
    
    private ArrayList<Integer> unsorted;
    

    @Before
    public void setUp() throws Exception {
     
        unsorted=new ArrayList<Integer>();
        unsorted.addAll(Arrays.asList(3,4,6,2,10,1,1,5));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCopy() {
       ArrayList<Integer> afterCopy=(ArrayList<Integer>) Problem1.copy(unsorted);
       assertEquals(afterCopy,unsorted);
       
    }
    @Test
    public void TestSort()
    {
      Integer[] what=new Integer[unsorted.size()];
     what= unsorted.toArray(what);
      Arrays.sort(what);
        ArrayList<Integer> afterSort=new ArrayList<Integer>(Arrays.asList(what) );
        
        

      
        assertEquals(afterSort,Problem1.sortCopy(unsorted));
    }
    

}
