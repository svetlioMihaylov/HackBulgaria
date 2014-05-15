package hack;
import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.Test;


public class MagicSquareTest {


	@Test
	public void isSquare()
	{
		 int [] [] test= { { 16, 23, 17 }, { 78, 32, 21 }, { 17, 16, 15 } };
		 MagicSquare a = new MagicSquare(test);

		 Assert.assertTrue(a.getSizeLine()==a.getSizeRow() );
	}
	@Test
	public void isCorrect()
	{
		 int [] [] asd= { { 16, 23, 17 }, { 78, 32, 21 }, { 17, 16, 15 } };
		 MagicSquare a = new MagicSquare(asd);

		 Assert.assertTrue( ! a.check());
	}
}
