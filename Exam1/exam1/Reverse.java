package exam1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static List<Integer> ListReverse(List<Integer> l)
    {
        List<Integer> copy=new ArrayList<Integer>(l.size());
        copy=new ArrayList(l);
//        int index=l.size()-1;
////        for(int i=0; i<copy.size(); i++)
////        {
////            copy.set(i, l.get(index));
////            index--;
////        }
        Collections.reverse(copy);
        return copy;
    }
 
}
