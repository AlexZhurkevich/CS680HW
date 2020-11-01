package edu.umb.cs680.hw04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class StudentTest {
	
	//In-state
	@Test
	public void testCreateInStateTuition() {
		try {
			Student s1 = Student.createInStateStudent("Alex", "Boston");
			Student s2 = Student.createInStateStudent("Oliver", "Anaheim");
			assertEquals(s1.getTuition(), s2.getTuition());
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void testCreateInState() {
		try {
			Student s = Student.createInStateStudent("Alex", "Boston");
			String[] expected = {"Alex", "Boston"};
			String[] actual = {s.getName(), s.getUsAddr()};
			assertArrayEquals(expected, actual);
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void testInStateUsAddrNullFail() {
		try {
			Student s = Student.createInStateStudent("Alex", null);
			fail();
		}
		catch (RuntimeException e) {
			assertEquals("bad name or usAddr", e.getMessage());
		}
	}
	
	@Test
	public void testInStateNameNullFail() {
		try {
			Student s = Student.createInStateStudent(null, "Boston");
			fail();
		}
		catch (RuntimeException e) {
			assertEquals("bad name or usAddr", e.getMessage());
		}
	}
	
	//International Student
	@Test
    	public void Intl_testStatus(){
    		try {
        		Student actual = Student.createIntlStudent("Andrew","Chicago", 5716, "Moscow");
        		StudentStatus expected = StudentStatus.INTL;
        		assertEquals(expected, actual.getStatus());
        	}
        	catch (RuntimeException e) {
			fail();
		}
    	}

    	@Test
    	public void Intl_testI20num(){
    		try {
        		Student actual = Student.createIntlStudent("Andrew","Chicago", 5716, "Moscow");
        		int expected = 5716;
        		assertEquals(expected, actual.getI20num());
        	}
        	catch (RuntimeException e) {
			fail();
		}
    	}

    	@Test
    	public void Intl_testForeignAddr(){
    		try {
        		Student actual = Student.createIntlStudent("Andrew","Chicago", 5716, "Moscow");
        		String expected = "Moscow";
        		assertEquals(expected, actual.getForeignAddr());
        	} 
        	catch (RuntimeException e) {
			fail();
		}
    	}
    	
    	//Out-State Student
	@Test
	public void testCreateOutStateTuition() {
		try {
			Student s1 = Student.createOutStateStudent("Alex", "Boston", 2);
			Student s2 = Student.createOutStateStudent("Oliver", "Anaheim", 3);
			assertEquals(s1.getTuition(), s2.getTuition());
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void testCreateOutState() {
		try {
			Student s = Student.createOutStateStudent("Alex", "Boston", 2);
			String[] expected = {"Alex", "Boston"};
			String[] actual = {s.getName(), s.getUsAddr()};
			assertArrayEquals(expected, actual);
			assertEquals(2, s.getYrsInState());
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	@Test
	public void testOutCityNullFail() {
		try {
			Student s = Student.createOutStateStudent("Alex", null, 2);
			fail();
		}
		catch (RuntimeException e) {
			assertEquals("bad name, usAddr or yrsInState", e.getMessage());
		}
	}
	
	@Test
	public void testOutNameNullFail() {
		try {
			Student s = Student.createOutStateStudent(null, "Boston", 2);
			fail();
		}
		catch (RuntimeException e) {
			assertEquals("bad name, usAddr or yrsInState", e.getMessage());
		}
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

