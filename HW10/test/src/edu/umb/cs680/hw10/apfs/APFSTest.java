package edu.umb.cs680.hw10.apfs;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.lang.*;
import java.time.LocalDateTime;

	
public class APFSTest {

    private String[] apfsElementToArray(ApfsElement e) {
        
        String[] eInfo = {e.getName(), 
                            e.getOwnerName(), 
                            Integer.toString(e.getSize())};
        return eInfo;
    }
    
    @Test
    public void sameAPFSTest() {
        APFS APFS1 = APFS.getAPFSSystem();
        APFS APFS2 = APFS.getAPFSSystem();
        assertSame(APFS1, APFS2);
    }

    @Test
    public void getRootDirTest() {
        APFS APFS1 = APFS.getAPFSSystem();
        APFS1.initFileSystem("APFS_Mohave", 100);
        String[] actual = this.apfsElementToArray(APFS1.getRootDir());
        String[] expected = {"APFS_Mohave", "Alex", "0"};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void createDefaultRootTest() {
        APFS APFS1 = APFS.getAPFSSystem();
        ApfsDirectory root = APFS1.getRootDir();
        String[] actual = this.apfsElementToArray(APFS1.getRootDir());
        String[] expected = {"APFS_Mohave", "Alex", "0"};
        assertArrayEquals(actual, expected);
    }
}
	
	
	
	
	
	
	
	
	
	

