package com.hw_5.Clothes.Headdresses;

import java.util.ArrayList;

import com.hw_5.Clothes.Clothes;

/**
 * Головной убор
 */
public abstract class Headdress extends Clothes {

    public Headdress(String name, char gender,
            int size, String color,
            String composition, int price) {
        super(name, gender, size, color, composition, price);
    }
}