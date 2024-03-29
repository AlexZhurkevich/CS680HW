package edu.umb.cs680.hw10.apfs;

import java.util.LinkedList;

public class ApfsFileCrawlingVisitor implements ApfsVisitor {

	LinkedList <ApfsFile> files = new LinkedList <ApfsFile>();
	public ApfsFileCrawlingVisitor() {}
	
	@Override
	public void visit(ApfsDirectory dir) {
		return;
	}
	
	@Override
	public void visit(ApfsFile file) {
		files.add(file);
		
	}

	@Override
	public void visit(ApfsLink link) {
		return;
		
	}
	
	public LinkedList<ApfsFile> getFiles(){
		return files;
	}
}
