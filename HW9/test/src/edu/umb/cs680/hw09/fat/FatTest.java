package edu.umb.cs680.hw09.fat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.lang.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class FatTest{

    private String[] systemToString(FAT sys){
        String[] dir = {sys.getRootDir().getName(),
                        //Integer.toString(sys.getID()),
                        Integer.toString(sys.getCapacity())
                        //Integer.toString(sys.getUsed()),
        };
        return dir;
    }

    static private LocalDateTime date1 = LocalDateTime.now();
    static private LocalDateTime date2 = LocalDateTime.now();
    static private LocalDateTime date3 = LocalDateTime.now();
    
    static {
        try {
            FatDirectory root = new FatDirectory(null, "root", 0, date1);
            FatDirectory home = new FatDirectory(null, "home", 0, date2);
            FatDirectory app = new FatDirectory(null, "app", 0, date1);
            FatDirectory code = new FatDirectory(null, "code", 0, date2);
            FatFile a = new FatFile(null, "a", 1, date3);
            FatFile b = new FatFile(null, "b", 2, date2);
            FatFile c = new FatFile(null, "c", 3, date1);
            FatFile d = new FatFile(null, "d", 4, date3);
            FatFile e = new FatFile(null, "e", 5, date1);
            FatFile f = new FatFile(null, "f", 6, date3);
            root.appendChild(home);
            root.appendChild(app);
            app.appendChild(a);
            app.appendChild(b);
            home.appendChild(code);
            home.appendChild(c);
            home.appendChild(d);
            code.appendChild(e);
            code.appendChild(f);
        } catch (Exception ex) {
            System.out.println("Hello");
        }
        

    }   

    @Test
    public void sameAPFSTest() {
        FAT FAT1 = FAT.getFATSystem();
        FAT FAT2 = FAT.getFATSystem();
        assertSame(FAT1, FAT2);
    }

}
