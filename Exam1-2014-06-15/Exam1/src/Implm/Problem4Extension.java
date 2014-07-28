package Implm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map.Entry;

public class Problem4Extension extends Problem4{
    @Override
    public void print()
    {
        Calendar cal = new GregorianCalendar();
        SimpleDateFormat date_format = new SimpleDateFormat("HH:mm:ss MMM dd,yyyy ");
        for(Entry<Integer, ArrayList<String>> entry:map.entrySet())
        {
            for(String s:entry.getValue())
            {
                
                Date creationDate = cal.getTime();
            System.out.println(date_format.format(creationDate)+"/"+entry.getKey()+"=>"+s);
            }
            
        }
        
       
        
      
       
        
    }

}
