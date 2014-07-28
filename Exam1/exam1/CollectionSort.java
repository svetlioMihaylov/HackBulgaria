package exam1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
    public static List<Integer> sort(List<Integer> l){
        List<Integer> c= new ArrayList<Integer>(l.size());
        c = new ArrayList(l);
        //Collections.copy(c, l);
//        for(int i=0; i<c.size()-1; i++)
//        {
//           int min=c.get(i);
//           for(int j=i+1; j<c.size(); j++)
//           {
//               if(min>c.indexOf(j))
//               {
//                   min =c.get(j);
//                   c.set(j, c.get(i));
//                   c.set(i, min);
//               }
//           }
//        }
        Collections.sort(c);
        return c;
    }
  
   
}
