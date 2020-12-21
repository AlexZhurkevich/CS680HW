package edu.umb.cs680.hw09.apfs;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class ApfsDirectory extends ApfsElement {

    private LinkedList<ApfsElement> children =  new LinkedList<ApfsElement>();
    public ApfsDirectory(ApfsDirectory parent, 
                        String name, 
                        int size, 
                        LocalDateTime creationTime,
                        String ownerName, 
                        LocalDateTime lastModified){
        super(parent, name, size, creationTime, ownerName, lastModified);
    }

    public LinkedList<ApfsElement> getChildren(){
        return this.children;
    }

    public void appendChild(ApfsElement child){
        children.add(child);
    }

    public LinkedList<ApfsDirectory> getSubDirectories() {
        LinkedList<ApfsDirectory> subDirectories = new LinkedList<ApfsDirectory>();
        for(ApfsElement apfs: children) {
            if(apfs.isDirectory())
                subDirectories.add((ApfsDirectory) apfs);
        }
        return subDirectories;
    }

    public LinkedList<ApfsFile> getFiles() {
        LinkedList<ApfsFile> files = new LinkedList<ApfsFile>();
        for(ApfsElement apfs: children) {
            if(apfs.isFile())
                files.add((ApfsFile) apfs);
        }
        return files;
    }

    public int getTotalSize() {
        int total = 0;
        for(ApfsElement apfs: children) {
            if(!apfs.isDirectory()) {
                total += apfs.getSize();
            } else {
                total += ((ApfsDirectory) apfs).getTotalSize();
            }
        }
        return total;
    }

    public int countChildren() {
        return this.children.size();
    }

    public boolean isDirectory() {
        return true;
    }

    public boolean isFile() {
        return false;
    }
    
    public boolean isLink() {
        return false;
    }
}