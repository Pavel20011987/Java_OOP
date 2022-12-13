package com.hw_5.Actions;

import com.hw_5.Clothes.Clothes;
import com.hw_5.Containers.Container;

/**
 * Доставать вещи
 */
public interface Get {
    Clothes get(Clothes clothes, Container container);
}