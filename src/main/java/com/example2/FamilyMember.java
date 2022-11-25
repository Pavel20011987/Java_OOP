package com.example2;

public class FamilyMember {
    Person member;
    boolean wasVisited;

    public FamilyMember(String name) {
        member = new Person(name);
        wasVisited = false;
    }

    public String getName() {
        return member.getName();
    }

    @Override
    public int hashCode() {
        return member.getName().hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        FamilyMember person = (FamilyMember) other;
        return this.getName().equals(person.getName());
    }
}
