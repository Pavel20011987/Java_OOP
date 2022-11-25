package com.example2;

import java.util.ArrayList;
import java.util.List;

public class Research {
    FamilyTree tree;
    List<String> result = new ArrayList<>();

    public Research(FamilyTree ft) {
        tree = ft;
    }

    public void research(String name, Relationship re) {
        List<Connection> connections = tree.getConnections(name);
        if (!connections.isEmpty()) {
            for (Connection connection : connections) {
                if (connection.getRelationship() == re) {
                    result.add(connection.getDestinationName());
                }
            }
        } else {
            System.out.println("There is no such member in the family");
        }
    }

    public void printResult() {
        System.out.print("[");
        for (String e : result) {
            System.out.print(e + ", ");
        }
        System.out.println("]");
    }
}
