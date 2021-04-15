package com.gildedrose;

public class BackstagePass extends BaseItem{

    public BackstagePass(int sellIn, int quality) {
        this.name = GildedRose.BAKCSTAGE_PASS;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    void updateQuality() {
        if (sellIn <= 0) {
            this.quality = 0;
        } else if (sellIn < 6 ){
            this.quality += 3;
        }else if (sellIn < 11) {
            this.quality += 2;
        }else {
            this.quality += 1;
        }
    }

    @Override
    void updateSellIn() {
    }
}
