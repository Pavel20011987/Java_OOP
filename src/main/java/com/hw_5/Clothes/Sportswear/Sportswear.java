package com.hw_5.Clothes.Sportswear;

import java.util.ArrayList;

import com.hw_5.Clothes.Clothes;

/**
 * Спортивный одежда
 */
public abstract class Sportswear extends Clothes {

    public Sportswear(String name, char gender,
            int size, String color,
            String composition, int price) {
        super(name, gender, size, color, composition, price);
    }
}