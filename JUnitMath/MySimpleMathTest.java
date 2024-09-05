
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class MySimpleMathTest {
    @Test
    public void testCheckSignShouldReturnPositive() {
        MySimpleMath sm = new MySimpleMath();
        Assert.assertEquals("positive", sm.checkSign(5));
        Assert.assertEquals("positive", sm.checkSign(0));
    }

    @Test
    public void testCheckSignShouldReturnNegative() {
        MySimpleMath sm = new MySimpleMath();
        Assert.assertEquals("negative", sm.checkSign(-5));
    }

    @Test
    public void testDivisionShouldReturnPositiveQuotient() {
        MySimpleMath sm = new MySimpleMath();
        Assert.assertEquals(2.0, sm.divide(10, 5), 0);
        Assert.assertEquals(0.0, sm.divide(0, 5), 0);
    }

    @Test
    public void testDivisionShouldReturnNegativeQuotient() {
        MySimpleMath sm = new MySimpleMath();
        Assert.assertEquals(-2.0, sm.divide(10, -5), 0); // Pass
        Assert.assertNotEquals("error in div(9/3)", 1, sm.divide(9, 3));
        // Fail
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionShouldThrowArithmeticException() {
        MySimpleMath sm = new MySimpleMath();
        sm.divide(10, 0); // expect an IllegalArgumentException
    }

    @Test
    public void testDivisionReal() {
        MySimpleMath sm = new MySimpleMath();
        assertEquals("error in div(1/3)", 0.333333, sm.divide(1, 3), 1e-6);
        assertEquals("error in div(1/9)", 0.111111, sm.divide(1, 9), 1e-6);
    }
}
