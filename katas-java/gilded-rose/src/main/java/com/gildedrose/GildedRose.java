package com.gildedrose;

class GildedRose {

    public static final String BAKCSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    public static final String AGED_BRIE = "Aged Brie";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    BaseItem[] items;

    public GildedRose(BaseItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (BaseItem item : items) {
            item.updateSellIn();
            item.updateQuality();
        }
    }

}
