package hack;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ReducedFilePathTest {

	
	@Test
	public void inputInNotNull()
	{
		ReduceFilePath test=new ReduceFilePath("//////////////");
		Assert.assertTrue(test.getPath()!=null);
	}
	@Test
	public void inputIsString()
	{
		
		ReduceFilePath test=new ReduceFilePath("//////////////");
		Assert.assertTrue(test.getPath() instanceof String);
	}
	@Test
	public void isCorrect()
	{
		ReduceFilePath test=new ReduceFilePath("//////////////");
		Assert.assertEquals("Correct", "/", test.clearPath());
	}
}
