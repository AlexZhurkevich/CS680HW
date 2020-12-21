package edu.umb.cs680.hw15.apfs;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.*;
import java.time.LocalDateTime;
import java.util.LinkedList;
import org.junit.jupiter.api.BeforeAll;

public class ApfsElementTest {

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

    @Test
	public void elementChecker() {
        assertTrue(root instanceof ApfsElement);
        assertTrue(home instanceof ApfsElement);
        assertTrue(code instanceof ApfsElement);
        assertTrue(app instanceof ApfsElement);
		assertTrue(a instanceof ApfsElement);
		assertTrue(b instanceof ApfsElement);
		assertTrue(c instanceof ApfsElement);
		assertTrue(d instanceof ApfsElement);
		assertTrue(e instanceof ApfsElement);
        assertTrue(f instanceof ApfsElement);
        assertTrue(x instanceof ApfsElement);
		assertTrue(y instanceof ApfsElement);
	}
}
