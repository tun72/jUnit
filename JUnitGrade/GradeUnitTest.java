import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class GradeUnitTest extends TestCase {
    public GradeUnitTest(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testTypical() {
        // test a typical value in partitions
        assertEquals("wrong grade1", 'A', Grade.getLetterGrade(95));
        assertEquals("wrong grade2", 'B', Grade.getLetterGrade(72));
        assertEquals("wrong grade3", 'C', Grade.getLetterGrade(55));
        assertEquals("wrong grade4", 'F', Grade.getLetterGrade(30));
    }

    public void testBoundaries() {
        // test the boundaries of the partitions
        assertEquals("wrong grade5", 'A', Grade.getLetterGrade(75));
        assertEquals("wrong grade6", 'A', Grade.getLetterGrade(100));
        assertEquals("wrong grade7", 'B', Grade.getLetterGrade(60));
        assertEquals("wrong grade8", 'B', Grade.getLetterGrade(74));
        // the following test (50) will fail
        assertEquals("wrong grade9", 'C', Grade.getLetterGrade(50));
        assertEquals("wrong grade10", 'C', Grade.getLetterGrade(59));
        assertEquals("wrong grade11", 'F', Grade.getLetterGrade(0));
        assertEquals("wrong grade12", 'F', Grade.getLetterGrade(49));
    }
}
