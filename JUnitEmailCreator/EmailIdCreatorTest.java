import org.junit.Test; 
import org.junit.experimental.theories.DataPoint; 
import org.junit.experimental.theories.DataPoints; 
import org.junit.experimental.theories.Theories; 
import org.junit.experimental.theories.Theory; 
import org.junit.runner.RunWith; 
import org.junit.runners.Parameterized; 
import java.util.Arrays; 
import static org.hamcrest.CoreMatchers.*; 
import static org.hamcrest.CoreMatchers.containsString; 
import static org.junit.Assert.*; 
import static org.junit.Assume.assumeNotNull; 
import static org.junit.Assume.assumeThat;
@RunWith(Theories.class) 
public class EmailIdCreatorTest { 
@DataPoints 
public static String[] names() { 
return new String[] 
{"first","second","abc","123",null}; 
} 
@DataPoint 
public static String name="mary";
@Theory
public void testCreateEmailID(String firstPart, String secondPart) throws Exception { 
System.out.println( String.format("Testing with %s and %s", firstPart, secondPart));
assumeNotNull(firstPart, secondPart); 
assumeThat(firstPart, notNullValue()); 
assumeThat(secondPart, notNullValue()); 
String actual= EmailIdUtility.createEmailID(firstPart,secondPart); 
System.out.println( 
String.format("Actual: %s \n", actual));
assertThat(actual, is(allOf(containsString(firstPart), 
containsString(secondPart)))); 
} 
}
