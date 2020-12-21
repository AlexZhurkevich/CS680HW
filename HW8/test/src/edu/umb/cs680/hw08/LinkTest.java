package edu.umb.cs680.hw08;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.lang.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class LinkTest {

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
    private static Link x = new Link(home, "l1", 10, date1, null);
    private static Link y = new Link(code, "l2", 15, date3, code);
    private static Link z = new Link(null, "l3", 20, date3, c);

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
    }

    @Test
    public void xTest(){
        Directory expected = null;
        FSElement actual = x.getTarget();
        assertSame(expected, actual);
    }

    @Test
    public void yTest(){
        Directory expected = code;
        FSElement actual = y.getTarget();
        assertSame(expected, actual);
    }

    @Test
    public void zTest(){
        File expected = c;
        FSElement actual = z.getTarget();
        assertSame(expected, actual);
    }
}