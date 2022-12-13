package com.hw_5.Containers;

/**
 * Шкаф
 */
public class Wardrobe extends Container {

    public Wardrobe(int maxCount) {
        super(maxCount);
    }

    @Override
    public String toString() {
        return "Шкаф";
    }
}