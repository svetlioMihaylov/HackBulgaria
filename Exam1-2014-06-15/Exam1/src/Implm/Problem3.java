package Implm;

import java.util.List;

public class Problem3 {
    public static boolean isMonotonus(List<Integer> list)
    {
        int check=1;
        if(list.size()==1)
            return true;
       if(list.get(0)<list.get(1))
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)<=list.get(i+1))
                check++;
        }
       else 
           for(int i=0;i<list.size()-1;i++)
           {
               if(list.get(i)>=list.get(i+1))
                   check++;
           }
       return list.size()==check;
    }
}
