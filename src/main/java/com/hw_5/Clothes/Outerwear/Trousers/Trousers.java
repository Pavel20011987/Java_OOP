package com.hw_5.Clothes.Outerwear.Trousers;

import java.util.ArrayList;

import com.hw_5.Clothes.Outerwear.Outerwear;

/**
 * Брюки
 */
public class Trousers extends Outerwear {

    public Trousers(String name, char gender,
            int size, String color,
            String composition,
            String season, int price) {
        super(name, gender, size, color, composition, season, price);
    }

    @Override
    public String toString() {
        return String.format("Джинсы: %s, размер: %d", this.getName(), this.getSize());
    }
}