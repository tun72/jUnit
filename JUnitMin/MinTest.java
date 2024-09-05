import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MinTest {
    private List<String> list;

    // Test fixture
    // Set up - Called before every test method.
    @Before
    public void setUp() {
        System.out.println("setUp()");
        list = new ArrayList<String>();
    }

    // Test fixture
    // Tear down-Called after everytestmethod.
    @After
    public void tearDown() {
        System.out.println("tearDown()");
        list = null; // Redundant in this example
    }

    @Test
    public void testForNullList() {
        System.out.println("Inside testForNullList()");
        list = null;
        try {
            Min.min(list);
        } catch (NullPointerException e) {
            return;
        }
        fail("NullPointerException expected");
    }

    @Test(expected = NullPointerException.class)
    public void testForNullElement() {
        System.out.println("Inside testForNullElement()");
        list.add(null);
        list.add("cat");
        Min.min(list);
    }

    @Test(expected = NullPointerException.class)
    public void testForSoloNullElement() {
        System.out.println("Inside testForSoloNullElement()");
        list.add(null);
        Min.min(list);
    }

    @Test(expected = ClassCastException.class)
    @SuppressWarnings("unchecked")
    public void testMutuallyIncomparable() {
        System.out.println("Inside testMutuallyIncomparable()");
        List list = new ArrayList();
        list.add("cat");
        list.add("dog");
        list.add(1);
        Min.min(list);
    }

    @Test
    public void testSingleElement() {
        System.out.println("Inside testSingleElement()");
        list.add("cat");
        Object obj = Min.min(list);
        assertTrue("Single Element List",
                obj.equals("cat"));
    }

    @Test
    public void testDoubleElement() {
        System.out.println("Inside testDoubleElement()");
        list.add("dog");
        list.add("cat");
        Object obj = Min.min(list);
        assertTrue("Double Element List",
                obj.equals("cat"));
    }
}
