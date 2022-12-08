package com.hw_2;

import java.util.ArrayList;
import java.util.List;

public class Research implements Research_interface {
    FamilyTree tree;
    List<String> result = new ArrayList<>();

    public Research(FamilyTree ft) {
        tree = ft;
    }

    @Override
    public void research(String name, Relationship re) {
        // TODO Auto-generated method stub
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

    /**
     * 
     */
    @Override
    public void printResult() {
        // TODO Auto-generated method stub
        System.out.print("[");
        for (String e : result) {
            System.out.print(e + ", ");
        }
        System.out.println("]");

    }
}
