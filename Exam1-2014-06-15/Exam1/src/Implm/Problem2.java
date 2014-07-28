package Implm;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static List<Integer> reverse (List<Integer> what)
    {
        ArrayList<Integer> copy=new ArrayList<Integer>();
        
      for(int i=what.size();i!=0;i--)
      {
          copy.add(what.get(i-1));
      }
      return (ArrayList<Integer>)copy;
    }

}
