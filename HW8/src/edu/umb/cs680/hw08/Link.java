
package edu.umb.cs680.hw08;

import java.time.LocalDateTime;

public class Link extends FSElement {

    private FSElement target;

    public Link(Directory parent, String name, int size, LocalDateTime creationTime, FSElement target) {
        super(parent, name, size, creationTime);
        this.target = target;
    }

    public boolean isDirectory() {
        return false;
    }

    public FSElement getTarget(){
        return this.target;
    }

    public void setTarget(FSElement target){
        this.target = target;
    }

    public int getTargetSize(){
        int tarSize = 0;
        if (target.isDirectory()) {
			Directory temp = (Directory) target;
			tarSize = temp.getTotalSize();
		} else {
			tarSize = target.getSize();
        }
        return tarSize;
    }
}