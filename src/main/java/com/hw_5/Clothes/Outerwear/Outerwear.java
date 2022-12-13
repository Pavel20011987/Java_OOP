package com.hw_5.Clothes.Outerwear;

import java.util.ArrayList;

import com.hw_5.Clothes.Clothes;

/**
 * Верхняя одежда
 */
public abstract class Outerwear extends Clothes {
    private String season;

    public Outerwear(String name, char gender,
            int size, String color,
            String composition,
            String season, int price) {
        super(name, gender, size, color, composition, price);
        this.season = season;
    }

    public String getSeason() {
        return season;
    }
}