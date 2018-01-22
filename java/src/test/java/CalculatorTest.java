import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void shouldReturnSum()
    {
        double result = calculator.sum(3.4, 2.7);
        System.out.println(result);

        assertEquals(6.1, result, 0.1);
    }
}
