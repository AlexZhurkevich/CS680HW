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

	
public class PriceComparatorTest {

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
    public void milComparatorTest(){
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(toyota);
        cars.add(suzuki);
        cars.add(nissan);
        cars.add(honda);
        Car[] expected = {toyota, nissan, suzuki, honda};
        Collections.sort(cars, new PriceComparator());
        Car[] actual = cars.toArray(new Car[cars.size()]);
        assertArrayEquals(actual, expected);
    }
}
	
	
	
	
	
	
	
	
	
	
