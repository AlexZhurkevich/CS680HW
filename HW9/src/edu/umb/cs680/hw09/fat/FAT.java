package edu.umb.cs680.hw09.fat;
import edu.umb.cs680.hw09.fs.FSElement;
import edu.umb.cs680.hw09.fs.FileSystem;
import java.time.LocalDateTime;
import java.util.LinkedList;


public class FAT extends FileSystem {
	//Constructor 
	private static FAT instance = null;
	private FAT(){};
	private LocalDateTime localTime = LocalDateTime.now();
	protected FatDirectory root; 


	public static FAT getFATSystem() {
        if (instance == null) {
			instance = new FAT();
		}
        return instance;
    }

	public FSElement createDefaultRoot() throws Exception{
		this.root = new FatDirectory(null, FAT.name, 0, localTime);
		return this.root;
    }


	public FatDirectory getRootDir() {
        return this.root;
    }
	
}