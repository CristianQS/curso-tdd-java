package com.gildedrose;

public abstract class BaseItem {

    public String name;
    public int sellIn;
    public int quality;

    abstract void updateQuality();
    abstract void updateSellIn();

    public void increaseQuality(int value) {
        this.quality = quality + value;
    }

    public void decreaseQuality(int value) {
        this.quality = quality - value;
    }
}
