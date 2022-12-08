package com.example2;

public abstract class Connection {
    FamilyMember src;
    FamilyMember dest;
    Relationship relationship;

    public Connection(FamilyMember m1, Relationship re, FamilyMember m2) {
        src = m1;
        dest = m2;
        relationship = re;
    }

    public abstract Relationship getRelationship() {
        return relationship;
    }

    public String getSourceName() {
        return src.getName();
    }

    public String getDestinationName() {
        return dest.getName();
    }
}
