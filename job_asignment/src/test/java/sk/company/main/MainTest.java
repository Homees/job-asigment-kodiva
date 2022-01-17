package sk.company.main;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testMainClass() {
        Main main = new Main();
        String result = main.buildResult(100);

        Assert.assertTrue(result.contains("foo"));
        Assert.assertTrue(result.contains("fuu"));
    }
}
