package com.hw_5.Humans;

import com.hw_5.Actions.Get;
import com.hw_5.Actions.Put;
import com.hw_5.Actions.Wear;
import com.hw_5.Clothes.Clothes;
import com.hw_5.Containers.Container;

import com.hw_5.Exception.EmptyContainer;
import com.hw_5.Exception.FullContainer;

public class Woman extends Human implements Get, Put, Wear {

    public Woman(String name, char gender, int size) {
        super(name, gender, size);
    }

    @Override
    public Clothes get(Clothes clothes, Container container) {
        try {
            return container.takeClothes(clothes);
        } catch (EmptyContainer e) {
            System.out.println(e);
        }

        return null;
    }

    @Override
    public void put(Clothes clothes, Container container) {
        try {
            container.setClothesList(clothes);
        } catch (FullContainer fe) {
            System.out.println(fe);
        }
    }

    @Override
    public void wear(Clothes clothes) {
        if (clothes == null) {
            System.out.println("Такой вещи нет");
            return;
        }

        if (clothes.getSize() == this.getSize()) {
            if (clothes.getGender() == this.getGender())
                System.out.printf("%s как раз\n", clothes);
            else
                System.out.printf("%s - вещь мужская\n", clothes);
        } else if (clothes.getGender() != this.getGender())
            System.out.printf("%s - вещь мужская\n", clothes);
        else
            System.out.printf("%s не по размеру\n", clothes);
    }
}