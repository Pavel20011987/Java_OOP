package com.hw_2;

public enum Relationship implements Rel_interface {
    child(1), parent(2), sibling(3), spouce(4);

    private int code;

    Relationship(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        // TODO Auto-generated method stub
        return code;
    }

}
