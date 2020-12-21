package edu.umb.cs680.hw10.fs;

import java.util.LinkedList;

public abstract class FileSystem {

    protected static String name;
    protected static int capacity;
    protected static int id;
    
    protected LinkedList<FSElement> rootDir = new LinkedList<FSElement>();

    public FSElement initFileSystem(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        FSElement root = null;
        try {
            root = createDefaultRoot();
            if (root.isDirectory() && capacity >= root.getSize()){
                setRoot(root);
                this.id = root.hashCode();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return root;
    }

    abstract protected FSElement createDefaultRoot() throws Exception ;

    public void setRoot(FSElement root) {
		this.rootDir.add(root);
	}

    public int getCapacity() {
        return this.capacity;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

}
