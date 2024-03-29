package edu.umb.cs680.hw09.fat;

import java.time.LocalDateTime;

public class FatFile extends FatFSElement {
    
    public FatFile (FatDirectory parent, 
                    String name, 
                    int size, 
                    LocalDateTime creationTime) throws Exception {
        super(parent, name, size, creationTime);                
    }

    public boolean isDirectory() {
        return false;
    }

    public boolean isFile() {
        return true;
    }
    
    public boolean isLink() {
        return false;
    }
}
