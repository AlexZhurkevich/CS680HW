package edu.umb.cs680.hw12.apfs;

import java.util.Comparator;

public class ElementKindComparator implements Comparator<ApfsElement> {
    public int compare(ApfsElement element1, ApfsElement element2) {
        return getIndex(element1) - getIndex(element2);
    }

    public int getIndex(ApfsElement element){
        int idx = 0;
        if (element instanceof ApfsDirectory) {
            idx = 1;
        } else if (element instanceof ApfsFile) {
            idx = 2;
        } else if (element instanceof ApfsLink) {
            idx = 3;
        }
        return idx;
    }
    
}