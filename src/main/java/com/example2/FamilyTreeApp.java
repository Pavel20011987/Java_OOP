package com.example2;

public class FamilyTreeApp {
    public static void main(String[] args) {
        FamilyTree ft = new FamilyTree();

        ft.addMember("vasya", Relationship.child, "masha");
        ft.addMember("vasya", Relationship.child, "petya");
        ft.addMember("sveta", Relationship.child, "masha");
        ft.addMember("sveta", Relationship.child, "petya");

        Research research = new Research(ft);
        extracted(research);
        research.printResult();
    }

    private static void extracted(Research research) {
        research.research("vasya", Relationship.child);
    }
}