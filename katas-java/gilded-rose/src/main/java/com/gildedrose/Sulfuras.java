package com.gildedrose;

public class Sulfuras extends BaseItem {

    public Sulfuras(int sellIn) {
        this.name = GildedRose.SULFURAS;
        this.sellIn = sellIn;
        this.quality = 80;
    }

    @Override
    public void updateQuality(){}

    @Override
    public void updateSellIn() {}
}
