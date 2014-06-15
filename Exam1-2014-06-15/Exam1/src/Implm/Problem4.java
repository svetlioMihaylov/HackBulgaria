package Implm;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Problem4 {
    private final int defaultValue=3;
    private  int level;
    protected LinkedHashMap<Integer,ArrayList<String>> map; 
    public Problem4()
    {
        level=3;
        map=new LinkedHashMap<Integer,ArrayList<String>>(); 
    }
    public Problem4(int pLevel)
    {
        level=pLevel;
        map=new LinkedHashMap<Integer,ArrayList<String>>(); 
    }
    public void setLevel(int pLevel)
    {
        level=pLevel;
    }
    public void log(int pLevel,String msg)
    {
        if(pLevel<=level)
          if(map.containsKey(pLevel))
          {
              map.get(pLevel).add(msg);
          }
          else 
          {
              ArrayList<String> temp=new ArrayList<String>();
              temp.add(msg);
              map.put(pLevel,temp);
          }
    }
    public void log(String msg)
    {
       
        if(map.containsKey(defaultValue))
        {
            map.get(defaultValue).add(msg);
        }
        else 
        {
            ArrayList<String> temp=new ArrayList<String>();
            temp.add(msg);
            map.put(defaultValue,temp);
        }
    }
    public void print()
    {
      
        
        for(Entry<Integer, ArrayList<String>> entry:map.entrySet())
        {
            for(String s:entry.getValue())
            System.out.println(entry.getKey()+"=>"+s);
        }
    }
    public static void main(String[] args) {
        Problem4 logger=new Problem4Extension();
        logger.log(2, "Somewhat important message"); //gets logged as "2 => Somewhat important message"
        logger.log(3, "Less important message"); // also gets logged!
        logger.log(5, "Not important"); //this is less important than LEVEL, so it will **not be logged**.
        logger.log("Meh"); //overload without a LEVEL parameter, use 3 as default.
        logger.print();
    }
}
