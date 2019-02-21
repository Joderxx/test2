package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        File file = new File("E:\\git resp\\springboot-lw");
        System.out.println(Arrays.toString(file.list()));
    }


    @Test
    public void a() {
        Arrays.toString(new String[]{});
    }
}
