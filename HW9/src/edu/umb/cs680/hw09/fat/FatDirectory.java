package edu.umb.cs680.hw09.fat;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class FatDirectory extends FatFSElement {

    private LinkedList<FatFSElement> children =  new LinkedList<FatFSElement>();
    public FatDirectory(FatDirectory parent, 
                        String name, 
                        int size, 
                        LocalDateTime creationTime) throws Exception {
        super(parent, name, size, creationTime);
    }

    public LinkedList<FatFSElement> getChildren(){
        return this.children;
    }

    public void appendChild(FatFSElement child){
        children.add(child);
    }

    public LinkedList<FatDirectory> getSubDirectories() {
        LinkedList<FatDirectory> subDirectories = new LinkedList<FatDirectory>();
        for(FatFSElement apfs: children) {
            if(apfs.isDirectory())
                subDirectories.add((FatDirectory) apfs);
        }
        return subDirectories;
    }

    public LinkedList<FatFSElement> getFiles() {
        LinkedList<FatFSElement> files = new LinkedList<FatFSElement>();
        for(FatFSElement apfs: children) {
            if(apfs.isFile())
                files.add(apfs);
        }
        return files;
    }

    public int getTotalSize() {
        int total = 0;
        for(FatFSElement apfs: children) {
            if(!apfs.isDirectory()) {
                total += apfs.getSize();
            } else {
                total += ((FatDirectory) apfs).getTotalSize();
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