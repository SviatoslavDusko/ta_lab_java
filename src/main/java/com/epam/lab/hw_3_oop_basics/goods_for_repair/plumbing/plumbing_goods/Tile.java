package com.epam.lab.hw_3_oop_basics.goods_for_repair.plumbing.plumbing_goods;

import com.epam.lab.hw_3_oop_basics.goods_for_repair.plumbing.Plumbing;

public class Tile extends Plumbing {
    public Tile(float price, int height, int width, String material, String color) {
        super(price, "Tile", height, width, material, color);
    }

    @Override
    public String toString() {
        return "Goods: " +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", material=" + getMaterial() +
                ", color=" + getColor() +
                ", height=" + getHeight() +
                ", width=" + getWidth() +
                " ;";
    }
}
