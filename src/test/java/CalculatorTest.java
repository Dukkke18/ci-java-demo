
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(8, Calculator.add(5, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, Calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, Calculator.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(1.666, Calculator.divide(5, 3), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator.divide(5, 0);
    }
}
