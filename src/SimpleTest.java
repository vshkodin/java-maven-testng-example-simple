package src.SimpleTest;


import org.testng.annotations.*;

 

public class SimpleTest {

	 @Test(groups = { "Smoke" })
	 public void aFastTest() {

	  System.out.println("Fast test");
	 
	 }
	 
	 @Test(groups = { "Regression" })
	 public void aSlowTest() {

	    System.out.println("Slow test");
	    
	 }
 
}
