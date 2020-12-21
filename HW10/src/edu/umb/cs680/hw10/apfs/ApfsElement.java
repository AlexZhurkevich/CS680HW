package edu.umb.cs680.hw10.apfs;
import edu.umb.cs680.hw10.fs.FSElement;
import java.time.LocalDateTime;

public abstract class ApfsElement extends FSElement {
    protected String ownerName;
    protected LocalDateTime lastModified;
    protected ApfsDirectory parent;

    public ApfsElement(ApfsDirectory parent, 
                        String name, 
                        int size, 
                        LocalDateTime creationTime,
                        String ownerName, 
                        LocalDateTime lastModified) {
        super(parent, name, size, creationTime);
        this.parent = parent;
        this.name = name;
        this.size = size;
        this.ownerName = ownerName;
        this.lastModified = lastModified;
    }

    public LocalDateTime getLastModified(){
        return this.lastModified;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public ApfsDirectory getParent() {
		return this.parent;
    }
    
    public void setParent(ApfsDirectory parent) {
		this.parent = parent;
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
        return false;
    }

    public void accept(ApfsVisitor v) {
        return;
    }
}
