package edu.umb.cs680.hw10.apfs;

public interface ApfsVisitor {
	public void visit(ApfsDirectory directory);
	public void visit(ApfsFile file);
	public void visit(ApfsLink link);
}
