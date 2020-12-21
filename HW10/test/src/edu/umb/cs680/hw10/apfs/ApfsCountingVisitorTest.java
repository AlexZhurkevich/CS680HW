package edu.umb.cs680.hw10.apfs;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.lang.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class ApfsCountingVisitorTest {

    static private LocalDateTime date1 = LocalDateTime.now();
    static private LocalDateTime date2 = LocalDateTime.now();
    static private LocalDateTime date3 = LocalDateTime.now();
    static ApfsDirectory root = new ApfsDirectory(null, "root", 0, date1, "admin", date2);
    static ApfsDirectory home = new ApfsDirectory(null, "home", 0, date2, "admin", date3);
    static ApfsDirectory app = new ApfsDirectory(null, "app", 0, date1, "admin", date2);
    static ApfsDirectory code = new ApfsDirectory(null, "code", 0, date2, "admin", date3);
    static ApfsFile a = new ApfsFile(null, "a", 1, date3, "admin", date3);
    static ApfsFile b = new ApfsFile(null, "b", 2, date2, "admin", date3);
    static ApfsFile c = new ApfsFile(null, "c", 3, date1, "admin", date2);
    static ApfsFile d = new ApfsFile(null, "d", 4, date3, "admin", date3);
    static ApfsFile e = new ApfsFile(null, "e", 5, date1, "Alex", date2);
    static ApfsFile f = new ApfsFile(null, "f", 6, date3, "admin", date3);
    static ApfsLink x = new ApfsLink(null, "x", 0, date2, "admin", date3, code);
    static ApfsLink y = new ApfsLink(null, "y", 10, date3, "admin", date3, home);
    static ApfsCountingVisitor visitor1 = new ApfsCountingVisitor();
    static ApfsCountingVisitor visitor2 = new ApfsCountingVisitor();
    

    @BeforeAll
    public static void initalization(){
        root.appendChild(home);
        root.appendChild(app);
        app.appendChild(a);
        app.appendChild(b);
        home.appendChild(code);
        home.appendChild(c);
        home.appendChild(d);
        home.appendChild(x);
        code.appendChild(e);
        code.appendChild(f);
        code.appendChild(y);
        root.accept(visitor1);
        code.accept(visitor2);
    }

    @Test
    public void crawlingTest() {
    	assertTrue(visitor1 instanceof ApfsCountingVisitor);
		assertTrue(visitor2 instanceof ApfsCountingVisitor);	
    }

    @Test 
    public void visitor1Test() {
        int[] expected = {4, 6, 2};
		int[] actual = {visitor1.getDirNum(), visitor1.getFileNum(), visitor1.getLinkNum()};
        assertArrayEquals(expected, actual);
    }

    @Test 
    public void visitor2Test() {
        int[] expected = {1, 2, 1};
		int[] actual = {visitor2.getDirNum(), visitor2.getFileNum(), visitor2.getLinkNum()};
        assertArrayEquals(expected, actual);
    }
}
