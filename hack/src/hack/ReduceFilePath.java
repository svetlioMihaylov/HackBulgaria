package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 
public class ReduceFilePath {
 
	private String path;
	public ReduceFilePath(String pPath)
	{
		this.path=new String(pPath);
	}
	public String getPath()
	{
		return this.path;
	}
	public String clearPath()
	{
		List<String> part = new ArrayList<String>(Arrays.asList(this.path.split("/")));
		for(int i=0;i<part.size();i++)
		{
			if("..".equals(part.get(i)))
					{
				part.remove(i);
				part.remove(i-1);
				i--;
				
				continue;
					}
			if(".".equals(part.get(i)))
			{
				part.remove(i--);
				continue;
			}
		
		}
		
		String result=new String();
	
		if(part.size()>1)
		{
		for(int i=1;i<part.size();i++)
		{
			if(part.get(i).length()!=0)
			result=result.concat("/").concat(part.get(i));
			/*result="/".concat(part.get(i)).concat(result);*/
		}
		return result;
		}
		else return "/";
	}
	public static void main (String [] args)
	{
		ReduceFilePath test=new ReduceFilePath("//////////////");
		System.out.println(test.clearPath());
	}
}