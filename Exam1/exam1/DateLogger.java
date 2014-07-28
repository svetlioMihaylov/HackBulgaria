package exam1;

import java.util.Date;

public class DateLogger extends Logger{
        public void log(String massage)
        {
            Date date=new Date();
            
            System.out.println(date.toString()+" "+this.level+" "+massage);

        }
   
        
}
