package com.example2;

public enum Relationship {
    child(1), parent(2), sibling(3), spouce(4);

    private int code;

    Relationship(int code) {
        this.code = code;
    }

    int getCode() {
        return code;
    }
}
