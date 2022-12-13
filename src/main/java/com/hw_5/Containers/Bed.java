package com.hw_5.Containers;

import java.util.ArrayList;

import com.hw_5.Clothes.Clothes;

//import com.hw_5.Clothes.Clothes;

/**
 * Кровать
 */
public class Bed extends Container {
    public Bed(int maxCount, ArrayList<Clothes> clothes) {
        super(maxCount);
    }

    @Override
    public String toString() {
        return "Кровать";
    }
}