package edu.umb.cs680.hw10.apfs;

public class ApfsCountingVisitor implements ApfsVisitor {
	
	private int dirNum = 0;
	private int linkNum = 0;
	private int fileNum = 0;
	
	public ApfsCountingVisitor() {}
	
	@Override
	public void visit(ApfsDirectory dir) {
		dirNum++;
		
	}
	
	@Override
	public void visit(ApfsFile file) {
		fileNum++;
		
	}

	@Override
	public void visit(ApfsLink link) {
		linkNum++;
		
	}
	
	public int getDirNum() {
		return this.dirNum;
		
	}
	
	public int getFileNum() {
		return this.fileNum;
		
	}
	
	public int getLinkNum() {
		return this.linkNum;
		
	}
}
