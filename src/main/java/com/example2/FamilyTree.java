package com.example2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FamilyTree {
    Set<FamilyMember> familyMembers;
    Map<FamilyMember, List<Connection>> family;

    public FamilyTree() {
        familyMembers = new HashSet<>();
        family = new HashMap<>();
    }

    /**
     * @param name1
     * @param re
     * @param name2
     */
    public void addMember(String name1, Relationship re, String name2) {
        FamilyMember m1 = new FamilyMember(name1);
        FamilyMember m2 = new FamilyMember(name2);
        familyMembers.add(m1);
        familyMembers.add(m1);
        familyMembers.add(m2);
        familyMembers.add(m2);
        Connection connection = new Connection(m1, re, m2);
        Connection reverseConnection;
        if (re == Relationship.child) {
            reverseConnection = new Connection(m2, Relationship.parent, m1);
        } else if (re == Relationship.parent) {
            reverseConnection = new Connection(m2, Relationship.child, m1);
        } else {
            reverseConnection = connection;
        }
        if (!family.containsKey(m1)) {
            family.put(m1, null);
        }
        if (!family.containsKey(m2)) {
            family.put(m2, null);
        }
        family.get(m1).add(connection);
        family.get(m2).add(reverseConnection);
    }

    public List<Connection> getConnections(String name) {
        for (FamilyMember member : family.keySet()) {
            if (member.getName().equals(name)) {
                return family.get(member);
            }
        }
        return null;
    }

    public boolean contains(FamilyMember m) {
        return family.containsKey(m);
    }
}
