package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrimeGeneratorTest {
	
	
	@Test
	public void IsEvenWith10LBeTrue() {
		PrimeGenerator prime = new PrimeGenerator(1L, 10L);
		assertTrue(prime.isEven(10L));
	}
	
	
	@Test
	public void IsPrimeWith1LBeFalse() {
		PrimeGenerator prime = new PrimeGenerator(1L, 10L);
		assertFalse(prime.isPrime(1L));
	}
	
	@Test
	public void IsPrimeWithNegative10LBeFalse() {
		PrimeGenerator prime = new PrimeGenerator(1L, 10L);
		assertFalse(prime.isPrime(-10L));
	}
	
	@Test
    	public void from100to1(){
        	assertThrows(RuntimeException.class, ()-> new PrimeGenerator(100,1) );
    	}
	
	@Test
	public void IsPrimeWith2L() {
		PrimeGenerator prime = new PrimeGenerator(1L, 10L);
		assertTrue(prime.isPrime(2L));
	}
	
	@Test
	public void IsEvenWith1LBeFalse() {
		PrimeGenerator prime = new PrimeGenerator(1L, 10L);
		assertFalse(prime.isEven(1L));
	}
	
	@Test
	public void IsPrimeWith97L() {
		PrimeGenerator prime = new PrimeGenerator(1L, 10L);
		assertTrue(prime.isPrime(97L));
	}
	
	@Test
	public void generatePrimesWith1Land10L() {
		PrimeGenerator prime = new PrimeGenerator(1L, 10L);
		prime.generatePrimes();
		Long[] expected = {2L, 3L, 5L ,7L};
		assertArrayEquals(expected, prime.getPrimes().toArray());
	}
	
	@Test
	public void IsPrimeWith4LBeFalse() {
		PrimeGenerator prime = new PrimeGenerator(1L, 10L);
		assertFalse(prime.isPrime(4L));
	}
	
	@Test
    public void from2to100(){
        PrimeGenerator gen = new PrimeGenerator(2,100);
        gen.generatePrimes();
        Long[] expetedPrimes = {2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L, 31L, 37L, 41L, 43L, 47L, 53L, 59L, 61L, 67L, 71L, 73L, 79L, 83L, 89L, 97L};
        assertArrayEquals(expetedPrimes, gen.getPrimes().toArray());
    }
	

	@Test
	public void fromMinus10to10() {
		try {
			PrimeGenerator prime = new PrimeGenerator(-10L, 10L);
			prime.generatePrimes();
			fail("from < 1");
		}
		catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=-10 to=10", ex.getMessage());
		}
	}
	
	@Test
	public void generatePrimesWith100Land1LRunTimeException() {
		try {
			PrimeGenerator prime = new PrimeGenerator(100L, 1L);
			prime.generatePrimes();
			fail("from > to");
		}
		catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=100 to=1", ex.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
