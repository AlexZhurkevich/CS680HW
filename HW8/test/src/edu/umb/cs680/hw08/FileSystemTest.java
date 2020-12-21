package edu.umb.cs680.hw08;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class FileSystemTest {
    
    @Test
    public void FileSystemCheck() {
        FileSystem FS1 = FileSystem.getFileSystem();
        FileSystem FS2 = FileSystem.getFileSystem();
        assertSame(FS1, FS2);
    }
}


	
	
	
	
	
	
	
	
	
	
	
	

