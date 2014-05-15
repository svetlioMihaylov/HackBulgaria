package hack;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class GoldbachConjectureTest {


	@Test 
	public void correctInput()
	{
		GoldbachConjecture test=new GoldbachConjecture(100);
		Assert.assertTrue(test.getNumber()>0);
	}
	@Test
	public void correctSum()
	{
		GoldbachConjecture test=new GoldbachConjecture(100);
	
		test.cuple();
		for (Map.Entry<Integer,Integer> entry : test.getResult().entrySet())
		{
			Assert.assertTrue(entry.getKey()+entry.getValue()==test.getNumber());
		}
			
	}
}
