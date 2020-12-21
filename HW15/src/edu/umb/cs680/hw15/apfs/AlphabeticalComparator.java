package edu.umb.cs680.hw15.apfs;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<ApfsElement> {
    public int compare(ApfsElement element1, ApfsElement element2) {
        return element1.getName().compareTo(element2.getName());
    }
}