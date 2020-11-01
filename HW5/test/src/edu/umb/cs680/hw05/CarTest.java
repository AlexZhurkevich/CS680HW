package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CarTest {
    //carToStringArray
    private String[] carToStringArray(Car car) {
        String[] carInfo = {car.getMake(),car.getModel(),Integer.toString(car.getYear())};
        return carInfo;
    }

    @Test
    public void verifyCarEqualityWithMakeModelYear() {
    	 try {
    		String[] expected = {"Toyota", "RAV4", "2018"}; 
         	Car actual = new Car("Toyota", "RAV4", 1000, 2018, 20000f); 
         	assertArrayEquals(expected, carToStringArray(actual));
         } 
         catch(RuntimeException e) {
			fail();
	 }
    }
    
    @Test
    public void verifyCarEqualityWithMakeModelYearTwo() {
    	try {
        	String[] expected = { "Mercedes", "S501", "2017" };
        	Car actual = new Car("Mercedes", "S501", 2000, 2017, 70000f);
        	assertArrayEquals(expected, carToStringArray(actual));
        }
        catch(RuntimeException e) {
			fail();
	}
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	

