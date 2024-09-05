import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DataDrivenCalcTest {

    public int a, b, sum;

    public DataDrivenCalcTest(int a, int b, int sum) {
        this.a = a;
        this.b = b;
        this.sum = sum;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> calcValues() {
        return Arrays.asList(new Object[][] {
                { 1, 1, 2 },
                { 2, 3, 5 },
                { 3, 3, 7 }, { 4, 6, 11 }
        });
    }

    @Test
    public void additionTest() {
        System.out.println("Parameterized Numbers: num1 = " + a + " , num2 = " + b +
                " Sum= " + Calc.add(a, b) + " == Expected " + sum);
        assertEquals("Addition Test", sum, Calc.add(a, b));
    }
}
