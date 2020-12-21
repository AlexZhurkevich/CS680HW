package edu.umb.cs680.hw10.apfs;

import java.time.LocalDateTime;

public class ApfsFile extends ApfsElement {
    
    public ApfsFile (ApfsDirectory parent, 
                    String name, 
                    int size, 
                    LocalDateTime creationTime,
                    String ownerName, 
                    LocalDateTime lastModified) {
        super(parent, name, size, creationTime, ownerName, lastModified);                
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

    @Override
	public void accept(ApfsVisitor v) {
		v.visit(this);
	}
}
