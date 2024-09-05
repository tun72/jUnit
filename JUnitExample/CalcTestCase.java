import org.junit.*;
import static org.junit.Assert.*;
public class CalcTestCase {
    @Test
    public void testAdd() {
        assertEquals("Number adding should word", 5, Calc.add(2,-3));
    }
}
