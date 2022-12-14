package com.hw_5.Containers;

import java.util.ArrayList;

import com.hw_5.Clothes.Clothes;
import com.hw_5.Exception.EmptyContainer;
import com.hw_5.Exception.FullContainer;

/**
 * Хранилище
 */
public abstract class Container {
    private final int maxCount;
    private final ArrayList<Clothes> clothesList;

    {
        clothesList = new ArrayList<>();
    }

    public Container(int maxCount) {
        this.maxCount = maxCount;
    }

    public void setClothesList(Clothes clothes) throws FullContainer {
        if (clothesList.size() > this.maxCount)
            throw new FullContainer(String.format("Полный %s", this));
        this.clothesList.add(clothes);
    }

    public ArrayList<Clothes> getClothesList() {
        return clothesList;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public Clothes takeClothes(Clothes clothes) throws EmptyContainer {
        if (this.clothesList.isEmpty())
            throw new EmptyContainer(String.format("Пустой %s", this));
        else if (!this.clothesList.contains(clothes))
            throw new EmptyContainer(String.format("%s не содержит %s", this, clothes));

        int idx = clothesList.indexOf(clothes);

        return clothesList.remove(idx);
    }

    @Override
    public String toString() {
        return "Контейнер";
    }
}