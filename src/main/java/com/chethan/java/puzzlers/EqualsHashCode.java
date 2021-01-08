package com.chethan.java.puzzlers;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashCode {
    public static void main(String[] args) {
        Set<Name> nameSet = new HashSet<>();
        nameSet.add(new Name("Mickey","Mouse"));
        System.out.println(nameSet.contains(new Name("Mickey","Mouse")));
        // Equal objects should have equal hashcode
        // We need to implement hashCode as well for correct behavior
    }
}

class Name{
    private final String first, last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Name name = (Name) o;

        if (first != null ? !first.equals(name.first) : name.first != null) return false;
        return last != null ? last.equals(name.last) : name.last == null;
    }

    /*@Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }*/
}
