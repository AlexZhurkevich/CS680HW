package edu.umb.cs680.hw07;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Directory extends FSElement {

	private LinkedList<FSElement> children =  new LinkedList<FSElement>();
	
	public Directory (Directory parent, String name, int size, LocalDateTime creationTime) {
        	super(parent, name, size, creationTime);
    }
    	
    public LinkedList<FSElement>getChildren() {
    	return this.children;
    }
    	
    public void appendChild(FSElement child) {
    this.children.add(child);
    	child.setParent(this);
    }

	public int countChildren() {
    	return this.children.size();
    }
    	
    public LinkedList<Directory> getSubDirectories() {
    	LinkedList<Directory> subDirectories = new LinkedList<Directory>();
    	for(FSElement fs: children) {
        		if(fs.isDirectory()) {
            		subDirectories.add((Directory) fs);
            	}
    	}
    	return subDirectories;
    }
    	
    public LinkedList<File> getFiles() {
    	LinkedList<File> files = new LinkedList<File>();
    	for(FSElement fs: children) {
    	    if(!fs.isDirectory()) {
				files.add((File) fs);
			}
    	}
    	return files;
	}

	public int getTotalSize() {
        int total = 0;
        for(FSElement fs: children) {
            if(!fs.isDirectory()) {
				total += fs.getSize();
            } else if(fs.isDirectory()) {
                total += ((Directory) fs).getTotalSize();
            }
        }
        return total;
	}
	
	public boolean isDirectory() {
        return true;
    }
}
