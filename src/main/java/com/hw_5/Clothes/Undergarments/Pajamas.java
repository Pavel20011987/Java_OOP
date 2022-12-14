package com.hw_5.Clothes.Undergarments;

import java.util.ArrayList;

/**
 * Пижама
 */
public class Pajamas extends Undergarments {

    public Pajamas(String name, char gender,
            int size, String color,
            String composition, int price) {
        super(name, gender, size, color, composition, price);
    }

    @Override
    public String toString() {
        return String.format("Пижама: %s, размер: %d;", this.getName(), this.getSize());
    }
}