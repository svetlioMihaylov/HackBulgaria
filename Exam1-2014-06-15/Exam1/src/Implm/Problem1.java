package Implm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1 {
    public static List<Integer> sortCopy(List<Integer> list)
    {
        ArrayList <Integer> copy=new ArrayList <Integer>();
        copy=(ArrayList<Integer>) copy(list);
        Integer [] arrayCopy=new Integer[copy.size()];
              arrayCopy=  copy.toArray(arrayCopy); 
        Arrays.sort(arrayCopy);
        copy.clear();
        copy.addAll(Arrays.asList(arrayCopy));
        return copy;
        
    }
    public static List<Integer> copy(List<Integer> list)
    {
        ArrayList <Integer> copy=new ArrayList <Integer>();
        copy.addAll(list);
        return copy;
        
    }
 
}
