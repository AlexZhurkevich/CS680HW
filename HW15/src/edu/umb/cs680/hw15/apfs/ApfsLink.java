package edu.umb.cs680.hw15.apfs;

import java.time.LocalDateTime;

public class ApfsLink extends ApfsElement{
    
    private ApfsElement target;

    public ApfsLink(ApfsDirectory parent, 
                    String name, 
                    int size, 
                    LocalDateTime creationTime,
                    String ownerName, 
                    LocalDateTime lastModified, 
                    ApfsElement target) {
        super(parent, name, size, creationTime, ownerName, lastModified);
        this.target = target;
    }

    public int getTargetSize() {
		if (target.isDirectory()) {
			ApfsDirectory dir = (ApfsDirectory) target;
			return dir.getTotalSize();
		} else {
			return target.getSize();
		}
    }
    
    public ApfsElement getTarget() {
		return this.target;
	}

    public ApfsDirectory getParent() {
		return this.parent;
	}

    public String getName() {
		return this.name;
    }
    
    public int getSize() {
		return this.size;
	}

    public boolean isDirectory() {
        return false;
    }

    public boolean isFile() {
        return false;
    }
    
    public boolean isLink() {
        return true;
    }
}