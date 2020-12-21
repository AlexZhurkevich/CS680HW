package edu.umb.cs680.hw11;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.lang.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

	
public class CarTest {

    private static Car toyota = new Car("toyota", "Corolla", 2000, 2019, 4000);
    private static Car suzuki = new Car("suzuki", "Vitara", 15000, 1999, 5778);
    private static Car nissan = new Car("nissan", "GTR", 58000, 2009, 4948);
    private static Car honda = new Car("honda", "Civic", 57489, 2001, 14157);

    @Test
    public void crawlingTest() {
    	assertTrue(toyota instanceof Car);
        assertTrue(suzuki instanceof Car);	
        assertTrue(nissan instanceof Car);
        assertTrue(honda instanceof Car);
    }

    @Test
	public void getYearTest(){
        int actual = suzuki.getYear();
        String actual1 = suzuki.getModel();
        String actual2 = suzuki.getMake();
        float actual3 = suzuki.getPrice();
        int actual4 = suzuki.getMileage();
        int expected = 1999;
        String expected1 = "Vitara";
        String expected2 = "suzuki";
        float expected3 = 5778;
        int expected4 = 15000;
        assertEquals(actual,expected);
        assertEquals(actual1,expected1);
        assertEquals(actual2,expected2);
        assertEquals(actual3,expected3);
        assertEquals(actual4,expected4);
	}
}
	
	
	
	
	
	
	
	
	
	
