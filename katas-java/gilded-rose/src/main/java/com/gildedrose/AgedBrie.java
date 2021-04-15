package com.gildedrose;

public class AgedBrie extends BaseItem {

    public AgedBrie(int sellIn, int quality) {
        this.name = GildedRose.AGED_BRIE;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public void updateQuality() {
        if (sellIn < 0 && quality <= 48) {
            this.quality += 2;
        } else if (quality <= 49){
            this.quality += 1;
        }
    }

    @Override
    public void updateSellIn() {
        this.sellIn -= 1;
    }
}
