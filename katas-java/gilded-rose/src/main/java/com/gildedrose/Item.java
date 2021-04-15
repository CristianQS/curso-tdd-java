package com.gildedrose;

public class Item extends BaseItem {

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public void updateQuality() {
        if (quality > 0) {
            if (sellIn >= 0) {
                this.decreaseQuality(1);
            } else {
                this.decreaseQuality(2);
            }
        }
    }

    @Override
    public void updateSellIn() {
        this.sellIn = this.sellIn - 1;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
