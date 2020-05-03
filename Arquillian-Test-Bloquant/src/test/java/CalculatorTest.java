import static org.junit.Assert.*;

import org.junit.Test;

public final class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(30, Calculator.add(1, 29));
    }

    @Test
    public void testDiv() {
        assertEquals(1, Calculator.div(3, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivParZero() {
        //assertEquals(1, Calculator.divParZero(5, 0));
        Calculator.divParZero(5, 0);
    }

}
