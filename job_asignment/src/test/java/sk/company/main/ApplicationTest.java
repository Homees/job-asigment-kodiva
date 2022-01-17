package sk.company.main;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

    @Test
    public void testResultCalculator() {
        CalculateResult calculator = new CalculateResult();
        String result = calculator.buildResult(100);

        Assert.assertTrue(result.contains("foo"));
        Assert.assertTrue(result.contains("fuu"));
    }
}
