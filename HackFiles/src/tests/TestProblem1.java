package tests;

import static org.junit.Assert.assertEquals;
import impl.Problem1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestProblem1 {
    private static final Path pathToIn=Paths.get("D:\\","junk","testIn.txt");
    private static final Path pathToOut=Paths.get("D:\\","junk","testOut.txt");
    private static final String stringToWrite="sdjdskjdsf";
    @Before
    public void setUp() throws Exception {
       
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws IOException {
        String control=new String("ds"+System.lineSeparator()+"d"+System.lineSeparator());
       assertEquals(control,Problem1.readAll(pathToIn.toFile()));
    }

}
