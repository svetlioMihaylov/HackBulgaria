package exam1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monotonous {
        public boolean monot(List<Integer> l)
        {
//            boolean boolone=true;
//            boolean booltwo=true;
//            for(int i=0; i<l.size()-1; i++)
//            {
//                if(l.get(i)>l.get(i+1))
//                {boolone=false;
//             //   break;
//                }
//                if(l.get(i)<l.get(i+1))
//                { booltwo=false;
//             //   break;
//                }
//                
//            }
//            return (boolone||booltwo);
        
            return ( CollectionSort.sort(l).equals(l) || Reverse.ListReverse(CollectionSort.sort(l)).equals(l));
        }
       
}
