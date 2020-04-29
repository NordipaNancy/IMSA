import static org.junit.Assert.*;

import org.junit.Test;

public final class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(3, Calculator.add(1, 2));
    }

    @Test
    public void testDiv() {
        assertEquals(1, Calculator.div(3, 2));
    }
}
