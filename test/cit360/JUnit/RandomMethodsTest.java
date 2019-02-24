package cit360.JUnit;

import cit360.JUnit.RandomMethods;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class RandomMethodsTest {
    
    public RandomMethodsTest() {
    }
    

    @Test //assertArrayEquals
    public void testAddOneToArray() {
        System.out.println("addOneToArray");
        RandomMethods randomTests = new RandomMethods();
        int expResult[] = new int[] {3,4};
        assertArrayEquals(expResult, randomTests.addOneToArray(new int[] {2,3}));
      
    }
    
    @Test //assertEquals
    public void testArea() {
        System.out.println("area");
        RandomMethods randomTests = new RandomMethods();
        double expResult = 8;
        double result = randomTests.areaSquare(2, 4);
        assertEquals(expResult, result, 0.0);
        assertNotNull(expResult);
       
    }
    
    @Test //assertTrue and assertFalse
    public void testCompareString(){
        System.out.println("compareString");
        RandomMethods randomTests = new RandomMethods();
        assertTrue(randomTests.compareString("This is a Test", "This is a Test"));
        assertFalse(randomTests.compareString("This is a Test", "This is a Tests"));
        
    }
    
    
    @Test //assertNull and assertNotNull
    public void testStudent() {
        System.out.println("student");
        RandomMethods randomTests = new RandomMethods();
        assertNotNull(randomTests.student("John"));
        assertNull(randomTests.student(null));

    }
    
    @Test //assertSame and assertNotSame
    public void testfavoriteColor() {
        System.out.println("favoriteColor");
        RandomMethods randomTests = new RandomMethods();
        String myFavColor = "blue";
        String joesFavColor = randomTests.favoriteColor("blue");
        assertSame(myFavColor, joesFavColor);
        String alisonsFavColor = randomTests.favoriteColor("red");
        assertNotSame(myFavColor, alisonsFavColor);
        
    }
    
    @Test //assertThat
    public void testRandomMethods(){
        System.out.println("RandomMethodGetter");
        RandomMethods randomTests = new RandomMethods();
        assertThat(10, is(randomTests.getRandomInteger()));
        assertThat(randomTests.getRandomInteger(), isA(Integer.class));
        assertThat("Howdy", is(randomTests.getRandomString()));
        assertThat(randomTests.getRandomString(), isA(String.class));
        
}
    
}