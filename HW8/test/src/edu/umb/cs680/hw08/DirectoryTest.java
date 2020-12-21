package edu.umb.cs680.hw08;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.lang.*;
import java.time.LocalDateTime;

	
class DirectoryTest {

    private String[] dirToString(Directory d) {
        String parent = null;
        if(d.getParent() != null) {
            parent = d.getParent().getName();
        }
        String[] dirInfo = {String.valueOf(d.isDirectory()), 
                            d.getName(), 
                            Integer.toString(d.getSize()),
                            d.getCreationTime().toString(), 
                            parent, 
                            Integer.toString(d.getTotalSize()), 
                            Integer.toString(d.countChildren())};
        return dirInfo;
    }

    static private LocalDateTime date1 = LocalDateTime.now();
    static private LocalDateTime date2 = LocalDateTime.now();
    static private LocalDateTime date3 = LocalDateTime.now();
    private static Directory root = new Directory(null, "root", 0, date1);
    private static Directory home = new Directory(root, "home", 0, date3);
    private static Directory app = new Directory(home, "app", 0, date2);
    private static Directory code = new Directory(app, "code", 0, date3);
    private static File a = new File(root, "a", 25, date1);
    private static File b = new File(app, "b", 25, date2);
    private static File c = new File(home, "c", 25, date1);
    private static File d = new File(code, "d", 25, date3);
    private static File e = new File(home, "e", 25, date3);
    private static File f = new File(app, "f", 25, date2);

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
    public void verifyDirectoryEqualityRoot(){
        String[] expected = {"true", "root", "0", date1.toString(), null, "150", "2"};
        Directory dir = root;
        String[] actual = dirToString(dir);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void verifyDirectoryEqualityHome(){
        String[] expected = {"true", "home", "0", date3.toString(), "root", "100", "3"};
        Directory dir = home;
        String[] actual = dirToString(dir);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void verifyDirectoryEqualityApp(){
        String[] expected = {"true", "app", "0", date2.toString(), "root", "50", "2"};
        Directory dir = app;
        String[] actual = dirToString(dir);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void verifyDirectoryEqualityCode(){
        String[] expected = {"true", "code", "0", date3.toString(), "home", "50", "2"};
        Directory dir = code;
        String[] actual = dirToString(dir);
        assertArrayEquals(expected, actual);
    }
    
}
	
	
	
	
	
	
	
	
	
	

