package edu.umb.cs680.hw10.apfs;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.lang.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class ApfsFileSearchVisitorTest {

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
    static ApfsFileSearchVisitor visitor1 = new ApfsFileSearchVisitor("a");
    static ApfsFileSearchVisitor visitor2 = new ApfsFileSearchVisitor("e");
    

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
    	assertTrue(visitor1 instanceof ApfsFileSearchVisitor);
		assertTrue(visitor2 instanceof ApfsFileSearchVisitor);	
    }

    @Test
    public void visitor1Test() {
        LinkedList<ApfsFile> file = visitor1.getFoundFiles();
        ApfsFile[] expected = {a};
        ApfsFile[] actual = file.toArray(new ApfsFile[file.size()]);
        assertArrayEquals(expected, actual);

    }

    @Test
    public void visitor2Test() {
        LinkedList<ApfsFile> file = visitor2.getFoundFiles();
        ApfsFile[] expected = {e};
        ApfsFile[] actual = file.toArray(new ApfsFile[file.size()]);
        assertArrayEquals(expected, actual);

    }
}
