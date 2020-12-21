package edu.umb.cs680.hw09.fat;
import edu.umb.cs680.hw09.fs.FSElement;
import java.time.LocalDateTime;

public abstract class FatFSElement extends FSElement{
    protected String ownerName;
    protected LocalDateTime lastModified;
    protected FatDirectory parent;

    public FatFSElement(FatDirectory parent, 
                        String name, 
                        int size, 
                        LocalDateTime creationTime) throws Exception {
        super(parent, name, size, creationTime);
        this.parent = parent;
        if(name.length() > 11) {
          throw new Exception("Name: up to 11 characters (8+3 format)");
        } else {
          this.name = name;
        }
    }

    public FatDirectory getParent() {
		    return this.parent;
    }
    
    public void setParent(FatDirectory parent) {
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
}