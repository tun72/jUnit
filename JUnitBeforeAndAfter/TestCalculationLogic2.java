import static org.junit.Assert.assertEquals; 
import org.junit.After; 
import org.junit.AfterClass; 
import org.junit.Before; 
import org.junit.BeforeClass; 
import org.junit.Test;  
public class TestCalculationLogic2 { 
@BeforeClass 
 public static void setUpBeforeClass() throws Exception { 
System.out.println("before class"); 
} 
 @Before 
public void setUp() throws Exception { 
System.out.println("before"); 
}  
@Test 
public void testFindMax(){ 
System.out.println("test case find max"); 
assertEquals("Wrong Max", 4,Calculation.findMax(new int[]{1,3,4,2})); 
assertEquals("Wrong Max", -2,Calculation.findMax(new int[]{-12,-3,-4,-2})); 
} 
@Test 
public void testCube(){ 
System.out.println("test case cube"); 
assertEquals("Wrong Cube", 27,Calculation.cube(3)); 
} 
@Test 
public void testReverseWord(){ 
System.out.println("test case reverse word"); 
assertEquals("WrondReverse", "ym eman si nahk", Calculation.reverseWord("my name is khan")); 
} 
@After 
public void tearDown() throws Exception { 
System.out.println("after"); 
}  
@AfterClass 
public static void tearDownAfterClass() throws Exception { 
System.out.println("after class"); 
}  
}

