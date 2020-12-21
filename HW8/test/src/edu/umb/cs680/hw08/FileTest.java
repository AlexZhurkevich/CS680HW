package edu.umb.cs680.hw08;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.*;
import java.time.LocalDateTime;
import java.util.LinkedList;
import org.junit.jupiter.api.BeforeAll;

class FileTest {

    private String[] fileToString(File f) {
        String[] fileInfo = {String.valueOf(f.isDirectory()), 
                            f.getName(), 
                            Integer.toString(f.getSize()),
                            f.getCreationTime().toString(),
                            f.getParent().getName()};
        return fileInfo;
    }

    static private LocalDateTime date1 = LocalDateTime.now();
    static private LocalDateTime date2 = LocalDateTime.now();
    static private LocalDateTime date3 = LocalDateTime.now();
    private static Directory root = new Directory(null, "root", 0, date1);
    private static Directory home = new Directory(root, "home", 0, date3);
    private static Directory app = new Directory(home, "app", 0, date2);
    private static Directory code = new Directory(app, "code", 0, date3);
    private static File a = new File(root, "a", 25, date1);
    private static File b = new File(app, "b", 13, date2);
    private static File c = new File(home, "c", 16, date1);
    private static File d = new File(code, "d", 19, date3);
    private static File e = new File(home, "e", 70, date3);
    private static File f = new File(app, "f", 41, date2);

    @BeforeAll
    public static void initalization(){
        root.appendChild(home);
        root.appendChild(app);
        app.appendChild(a);
        app.appendChild(b);
        home.appendChild(code);
        home.appendChild(c);
        home.appendChild(d);
        code.appendChild(e);
        code.appendChild(f);
    }


    @Test
    public void ATest(){
        String[] expected = {"false", "a", "25", String.valueOf(date1), "app"};
        String[] actual = fileToString(a);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void BTest(){
        String[] expected = {"false", "b", "13", String.valueOf(date2), "app"};
        String[] actual = fileToString(b);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void CTest(){
        String[] expected = {"false", "c", "16", String.valueOf(date1), "home"};
        String[] actual = fileToString(c);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void DTest(){
        String[] expected = {"false", "d", "19", String.valueOf(date3), "home"};
        String[] actual = fileToString(d);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void ETest(){
        String[] expected = {"false", "e", "70", String.valueOf(date3), "code"};
        String[] actual = fileToString(e);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void FTest(){
        String[] expected = {"false", "f", "41", String.valueOf(date2), "code"};
        String[] actual = fileToString(f);
        assertArrayEquals(expected, actual);
    }

    @Test
	public void checkInstanceOfFSElement() {
		assertTrue(root instanceof FSElement);
		assertTrue(home instanceof FSElement);
		assertTrue(app instanceof FSElement);
		assertTrue(code instanceof FSElement);
		assertTrue(a instanceof FSElement);
		assertTrue(b instanceof FSElement);
		assertTrue(c instanceof FSElement);
		assertTrue(d instanceof FSElement);
		assertTrue(e instanceof FSElement);
		assertTrue(f instanceof FSElement);
    }
    
}
	
	
	
	
	
	
	
	
	
	
	
	

