package edu.umb.cs680.hw09.apfs;
import edu.umb.cs680.hw09.fs.FSElement;
import edu.umb.cs680.hw09.fs.FileSystem;
import java.time.LocalDateTime;
import java.util.LinkedList;


public class APFS extends FileSystem {
	//Constructor 
	private static APFS instance = null;
	private APFS(){};
	private LocalDateTime localTime = LocalDateTime.now();
	protected ApfsDirectory root; 


	public static APFS getAPFSSystem() {
        if (instance == null) {
			instance = new APFS();
		}
        return instance;
    }

	protected ApfsElement createDefaultRoot() {
		this.root = new ApfsDirectory(null, APFS.name, 0, localTime, "Alex", localTime);
		return this.root;
    }


	public ApfsDirectory getRootDir() {
        return this.root;
    }
	
}