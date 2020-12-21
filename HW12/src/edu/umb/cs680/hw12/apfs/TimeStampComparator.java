package edu.umb.cs680.hw12.apfs;

import java.util.Comparator;

public class TimeStampComparator implements Comparator<ApfsElement> {
    public int compare(ApfsElement element1, ApfsElement element2) {
        return element1.getLastModified().compareTo(element2.getLastModified());
    }
}