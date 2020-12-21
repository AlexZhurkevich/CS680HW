package edu.umb.cs680.hw10.apfs;

import java.util.LinkedList;

public class ApfsFileSearchVisitor implements ApfsVisitor {
	
	protected String fileName;
	protected LinkedList<ApfsFile> searchedFiles = new LinkedList<ApfsFile>();
	public ApfsFileSearchVisitor() {}
	
	public ApfsFileSearchVisitor(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void visit(ApfsDirectory dir) {
		return;
	}
	
	@Override
	public void visit(ApfsFile file) {
		if(file.getName().equals(this.fileName)) {
			searchedFiles.add(file);
		}
	}
	
	@Override
	public void visit(ApfsLink link) {
		return;
	}
	
	protected LinkedList<ApfsFile> getFoundFiles() {
		return searchedFiles;
	}
	
	protected String getFileName() {
		return this.fileName;
	}
}
