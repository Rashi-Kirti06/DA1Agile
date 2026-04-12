package java.com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {

    App app = new App();

    @Test
    public void testAdd() {
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, app.multiply(2, 3));
    }

    @Test
    public void testIsEven() {
        assertTrue(app.isEven(4));
        assertFalse(app.isEven(5));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, app.factorial(5));
    }

    @Test
    public void testIsPrime() {
        assertTrue(app.isPrime(7));
        assertFalse(app.isPrime(4));
    }
}