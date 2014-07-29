package impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    private Problem1()
    {
        
    }
    public static String readAll(File file) throws IOException
    {
        List<String> content=new ArrayList<String>();
       content= Files.readAllLines(file.toPath(),Charset.defaultCharset());
        StringBuilder builder =new StringBuilder();
       for(String s:content)
       {
           builder.append(s).append(System.lineSeparator());
       }
      // builder.deleteCharAt(builder.length());
       return builder.toString();
    }
    public static void writeToFile(File file,String s) throws IOException
    {
        BufferedWriter writer=new BufferedWriter(new FileWriter(file));
        writer.write(s);
        writer.close();
    }
}
