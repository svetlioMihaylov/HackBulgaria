package Impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reverse {
    Collection <Integer> collection;
    public Reverse(){
   
    }
      public Collection<Integer> reverse (Collection<Integer> collection)
   {
      
       for(int i=0;i<collection.size()/2;i++)
               Collections.swap((List<?>) collection, i, collection.size()-i-1);
       return collection;
   }
      public  Collection <Integer> getresult()
      {
          return this.collection;
      }
    public static void main(String[] args) {
        Integer[] nums = new Integer[5];
        nums[0] = 2;
        nums[1] = 4;
        Integer[] nm = { 3, 5, 7 };
        LinkedList<Integer> arg=new LinkedList<Integer>();
        arg.addAll(Arrays.asList(nums));
        Reverse test=new Reverse();
        test.reverse(arg);
        for(Integer o:arg)
            if(o!=null)
            System.out.println(o.toString());
        
    }
}
