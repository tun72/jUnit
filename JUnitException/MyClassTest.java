// // Create a new JUnit test class. 
// import static org.junit.Assert.*; 
// import static org.junit.Assert.assertEquals; 
// import static org.junit.Assert.assertThrows; 
// //import org.junit.BeforeEach; 
// import org.junit.Test; 
// class MyClassTest {  
// @Test 
// void testExceptionIsThrown() { 
// MyClass tester = new MyClass(); 
// assertThrows(IllegalArgumentException.class, () -> tester.multiply(1000, 5)); 
// }  
//  @Test
// void testMultiply() { 
// MyClass tester = new MyClass(); 
// assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5)); 
// } 
// }

// import static org.junit.Assert.*;
// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertThrows;
// // import org.junit.BeforeEach;
// import org.junit.Test;

// public class MyClassTest {
//     @Test
//     public void testExceptionIsThrown() {
//         MyClass tester = new MyClass();
//         assertThrows(IllegalArgumentException.class, () -> tester.multiply(1000, 5));
//     }

//     @Test
//     public void testMultiply() {
//         MyClass tester = new MyClass();
//         assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
//     }
// }

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.*;

public class MyClassTest {
    private MyClass tester;

    @Before
    public void setup() {
        System.out.println("Before each method: Initialize the variable: tester");
        tester = new MyClass();
    }

    @Test
    public void testExceptionIsThrown() {
        // MyClass tester = new MyClass(); //this is moved to @Before method
        assertThrows(IllegalArgumentException.class, () -> tester.multiply(1000, 5));
    }

    @Test
    public void testMultiply() {
        // MyClass tester = new MyClass();//this is moved to @Before method
        assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
        System.out.println("Expected: X should be less than 1000 Actual: " + tester.multiply(1000, 5));
    }
}
