package edu.umb.cs680.hw12.fs;

import java.time.LocalDateTime;

public abstract class FSElement {
    
    protected String name;
    protected int size;
    protected LocalDateTime creationTime;
    protected FSElement parent;

    public FSElement(FSElement parent, String name, int size, LocalDateTime creationTime){
        this.parent = parent;
        this.name= name;
        this.size = size;
        this.creationTime = creationTime;
    }

    public FSElement getParent() {
        return this.parent;
    }

    public void setParent(FSElement parent) {
        this.parent = parent;
    }

    public int getSize() {
		return this.size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreationTime() {
        return this.creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public abstract boolean isDirectory();

}
