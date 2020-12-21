package edu.umb.cs680.hw14;
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

    private static Car toyota = new Car("toyota", "Corolla", 2, 2, 2);
    private static Car suzuki = new Car("suzuki", "Vitara", 3, 3, 3);
    private static Car nissan = new Car("nissan", "GTR", 4, 4, 4);
    private static Car honda = new Car("honda", "Civic", 5, 5, 5);
    private static ArrayList<Car> cars = new ArrayList<Car>();
    
    @BeforeAll
    public static void initialize() {
        cars.add(toyota);
		cars.add(suzuki);
		cars.add(nissan);
        cars.add(honda);
        for (Car car : cars){
            car.setDominationCount(cars);
        }
    }

    @Test
    public void crawlingTest() {
    	assertTrue(toyota instanceof Car);
        assertTrue(suzuki instanceof Car);	
        assertTrue(nissan instanceof Car);
        assertTrue(honda instanceof Car);
        assertTrue(cars instanceof ArrayList);
    }

    //Vanilla requirement
    @Test
	public void verify_sortVanillaMileageAscending() {
		Car[] expected = {toyota, suzuki, nissan, honda};
        Car.sortVanillaMileageAscending(cars);
        Car[] actual = cars.toArray(new Car[cars.size()]);
		assertArrayEquals(expected, actual);
    }
    
    @Test
	public void verify_sortVanillaYearAscending() {
        Car[] expected = {toyota, suzuki, nissan, honda};
        Car.sortVanillaYearAscending(cars);
        Car[] actual = cars.toArray(new Car[cars.size()]);
		assertArrayEquals(expected, actual);
    }

    @Test
	public void verify_sortVanillaPriceAscending() {
        Car[] expected = {toyota, suzuki, nissan, honda};
        Car.sortVanillaPriceAscending(cars);
        Car[] actual = cars.toArray(new Car[cars.size()]);
		assertArrayEquals(expected, actual);
    }

    //Vanilla descending
    @Test
	public void verify_sortVanillaMileageDescending() {
		Car[] expected = {honda, nissan, suzuki, toyota};
        Car.sortVanillaMileageDescending(cars);
        Car[] actual = cars.toArray(new Car[cars.size()]);
		assertArrayEquals(expected, actual);
    }
    
    @Test
	public void verify_sortVanillaYearDescending() {
        Car[] expected = {honda, nissan, suzuki, toyota};
        Car.sortVanillaYearDescending(cars);
        Car[] actual = cars.toArray(new Car[cars.size()]);
		assertArrayEquals(expected, actual);
    }

    @Test
	public void verify_sortVanillaPriceDescending() {
        Car[] expected = {honda, nissan, suzuki, toyota};
        Car.sortVanillaPriceDescending(cars);
        Car[] actual = cars.toArray(new Car[cars.size()]);
		assertArrayEquals(expected, actual);
    }


    //Optional Comparator.comparing() 
    @Test
	public void verify_sortOptionalMileageAscending() {
		Car[] expected = {toyota, suzuki, nissan, honda};
        Car.sortOptionalMileageAscending(cars);
        Car[] actual = cars.toArray(new Car[cars.size()]);
		assertArrayEquals(expected, actual);
    }
    
    @Test
	public void verify_sortOptionalYearAscending() {
        Car[] expected = {toyota, suzuki, nissan, honda};
        Car.sortOptionalYearAscending(cars);
        Car[] actual = cars.toArray(new Car[cars.size()]);
		assertArrayEquals(expected, actual);
    }

    @Test
	public void verify_sortOptionalPriceAscending() {
        Car[] expected = {toyota, suzuki, nissan, honda};
        Car.sortOptionalPriceAscending(cars);
        Car[] actual = cars.toArray(new Car[cars.size()]);
		assertArrayEquals(expected, actual);
    }

    //Optional Comparator.comparing() descending
    @Test
	public void verify_sortOptionalMileageDescending() {
		Car[] expected = {honda, nissan, suzuki, toyota};
        Car.sortOptionalMileageDescending(cars);
        Car[] actual = cars.toArray(new Car[cars.size()]);
		assertArrayEquals(expected, actual);
    }
    
    @Test
	public void verify_sortOptionalYearDescending() {
        Car[] expected = {honda, nissan, suzuki, toyota};
        Car.sortOptionalYearDescending(cars);
        Car[] actual = cars.toArray(new Car[cars.size()]);
		assertArrayEquals(expected, actual);
    }

    @Test
	public void verify_sortOptionalPriceDescending() {
        Car[] expected = {honda, nissan, suzuki, toyota};
        Car.sortOptionalPriceDescending(cars);
        Car[] actual = cars.toArray(new Car[cars.size()]);
		assertArrayEquals(expected, actual);
    }

    //Pareto 
    //Vanilla requirement
    @Test
	public void verify_sortVanillaParetoAscending() {
		Car[] expected = {toyota, suzuki, nissan, honda};
        Car.sortVanillaParetoAscending(cars);
        Car[] actual = cars.toArray(new Car[cars.size()]);
		assertArrayEquals(expected, actual);
    }

    //Vanilla descending
    @Test
	public void verify_sortVanillaParetoDescending() {
		Car[] expected = {honda, nissan, suzuki, toyota};
        Car.sortVanillaParetoDescending(cars);
        Car[] actual = cars.toArray(new Car[cars.size()]);
		assertArrayEquals(expected, actual);
    }

    //Optional Comparator.comparing() 
    @Test
	public void verify_sortOptionalParetoAscending() {
		Car[] expected = {toyota, suzuki, nissan, honda};
        Car.sortOptionalParetoAscending(cars);
        Car[] actual = cars.toArray(new Car[cars.size()]);
		assertArrayEquals(expected, actual);
    }

    //Optional Comparator.comparing() descending
    @Test
	public void verify_sortOptionalParetoDescending() {
		Car[] expected = {honda, nissan, suzuki, toyota};
        Car.sortOptionalParetoDescending(cars);
        Car[] actual = cars.toArray(new Car[cars.size()]);
		assertArrayEquals(expected, actual);
    }
}
	
	
	
	
	
	
	
	
	
	
