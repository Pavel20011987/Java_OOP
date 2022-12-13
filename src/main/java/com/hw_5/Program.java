package com.hw_5;

import java.util.Arrays;

import com.hw_5.Clothes.Clothes;
import com.hw_5.Clothes.Outerwear.Trousers.Jeans;
import com.hw_5.Clothes.Sportswear.Tracksuit;
import com.hw_5.Containers.Wardrobe;
import com.hw_5.Humans.Man;
import com.hw_5.Humans.Woman;

//import com.hw_5.Clothes.Outerwear.Trousers.Jeans;

/**
 * Lesson 6
 *
 */
public class Program {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe(3);
        Man pavel = new Man("Павел", 'М', 50);
        Woman marina = new Woman("Марина", 'Ж', 46);
        Jeans peserico = new Jeans("Peserico", 'М', 48, "белые", "Хлопок", "Лето", 4000);
        // Coat zarra = new Coat("zarra", 'Ж', 50, "черный", "Шерсть", "Осень", 15000);
        Tracksuit nike = new Tracksuit("nike", 'Ж', 44, "черный", "Шерсть", 15000);
        pavel.put(peserico, wardrobe);

        Clothes thing = pavel.get(peserico, wardrobe);
        pavel.wear(thing);
    }
}
