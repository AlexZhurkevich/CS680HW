package edu.umb.cs680.hw07;

import java.util.LinkedList;

public class FileSystem {

    private LinkedList<Directory> rootDir = new LinkedList<Directory>();
    private static FileSystem fileSys = null;
    //constructor
    private FileSystem() {
    
    }

    public static FileSystem getFileSystem(){
        if(fileSys == null) {
            fileSys = new FileSystem();
        }
        return fileSys;
    }

    public LinkedList<Directory> getRootDirs(){
		return this.rootDir;
	}

    public void appendRootDir(Directory root) {
        this.rootDir.add(root);
    }

}