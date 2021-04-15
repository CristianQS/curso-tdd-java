package com.gildedrose;

import static com.gildedrose.GildedRose.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GildedRoseTest {

  public static final String STANDART = "standart";

  @Test
  public void standart_object_decrease_SellIn_by_one_each_day() {
    int quality = 50;
    var item = new Item(STANDART, 5, quality);
    GildedRose app = new GildedRose(new Item[]{item});

    app.updateQuality();

    assertEquals(STANDART, item.name);
    assertEquals(4, item.sellIn );
  }

  @Test
  public void standart_object_decrease_quality_by_two_when_SellIn_has_expired() {
    int quality = 50;
    var item = new Item(STANDART, 0, quality);
    GildedRose app = new GildedRose(new Item[]{item});

    app.updateQuality();

    assertEquals(STANDART, item.name);
    assertEquals(quality - 2, item.quality);
  }

  @Test
  public void standart_object_decrease_quality_by_one_when_SellIn_has_not_expired() {
    int quality = 50;
    var item = new Item(STANDART, 10, quality);
    GildedRose app = new GildedRose(new Item[]{item});

    app.updateQuality();

    assertEquals(STANDART, item.name);
    assertEquals(item.quality, quality - 1);
  }

  @Test
  public void standart_object_can_not_decrease_quality_when_quality_is_zero() {
    int quality = 0;
    var item = new Item(STANDART, 10, quality);
    GildedRose app = new GildedRose(new Item[]{item});

    app.updateQuality();

    assertEquals(STANDART, item.name);
    assertEquals(0,item.quality);
  }

  @Test
  public void aged_brie_quality_must_increase_by_per_update() {
    int quality = 0;
    var item = new Item(AGED_BRIE, 10, quality);
    GildedRose app = new GildedRose(new Item[]{item});

    app.updateQuality();

    assertEquals(AGED_BRIE,item.name);
    assertEquals(quality + 1, item.quality);
  }

  @Test
  public void aged_brie_quality_must_increase_by_per_update_when_sell_in_is_negative() {
    int quality = 0;
    var item = new Item(AGED_BRIE, -1, quality);
    GildedRose app = new GildedRose(new Item[]{item});

    app.updateQuality();

    assertEquals(AGED_BRIE,item.name);
    assertEquals(quality + 2, item.quality);
  }

  @Test
  public void aged_brie_quality_not_increase_when_quality_is_already_50() {
    int quality = 50;
    var item = new Item(AGED_BRIE, 10, quality);
    GildedRose app = new GildedRose(new Item[]{item});

    app.updateQuality();

    assertEquals(AGED_BRIE,item.name);
    assertEquals(quality, item.quality);
  }

  @Test
  public void sulfuras_quality_must_not_be_decreased() {
    int quality = 30;
    var item = new Item(SULFURAS, 10, quality);
    GildedRose app = new GildedRose(new Item[]{item});

    app.updateQuality();

    assertEquals(SULFURAS, item.name);
    assertEquals(quality, item.quality);
  }

  @Test
  public void sulfuras_sell_in_must_not_decrease() {
    int quality = 30;
    int sellIn = 10;
    var item = new Item(SULFURAS, sellIn, quality);
    GildedRose app = new GildedRose(new Item[]{item});

    app.updateQuality();

    assertEquals(sellIn, item.sellIn);
  }

  @Test
  public void backstage_increase_quality_by_one_when_SellIn_is_bigger_than_10() {
    int quality = 30;
    var item = new Item(BAKCSTAGE_PASS, 20, quality);
    GildedRose app = new GildedRose(new Item[]{item});

    app.updateQuality();

    assertEquals(BAKCSTAGE_PASS, item.name);
    assertEquals(quality + 1, item.quality);
  }

  @Test
  public void backstage_increase_quality_by_two_when_SellIn_is_10() {
    int quality = 30;
    var item = new Item(BAKCSTAGE_PASS, 10, quality);
    GildedRose app = new GildedRose(new Item[]{item});

    app.updateQuality();

    assertEquals(BAKCSTAGE_PASS, item.name);
    assertEquals(quality + 2, item.quality);
  }

  @Test
  public void backstage_increase_quality_by_two_when_SellIn_is_between_10_and_5() {
    int quality = 30;
    var item = new Item(BAKCSTAGE_PASS, 7, quality);
    GildedRose app = new GildedRose(new Item[]{item});

    app.updateQuality();

    assertEquals(BAKCSTAGE_PASS, item.name);
    assertEquals(quality + 2, item.quality);
  }

  @Test
  public void backstage_increase_quality_by_three_when_SellIn_is_5() {
    int quality = 30;
    var item = new Item(BAKCSTAGE_PASS, 5, quality);
    GildedRose app = new GildedRose(new Item[]{item});

    app.updateQuality();

    assertEquals(BAKCSTAGE_PASS, item.name);
    assertEquals(quality + 3, item.quality);
  }

  @Test
  public void backstage_increase_quality_by_three_when_SellIn_is_between_5_and_0() {
    int quality = 30;
    var item = new Item(BAKCSTAGE_PASS, 2, quality);
    GildedRose app = new GildedRose(new Item[]{item});

    app.updateQuality();

    assertEquals(BAKCSTAGE_PASS, item.name);
    assertEquals(quality + 3, item.quality);
  }

  @Test
  public void backstage_quality_must_be_set_0_when_SellIn_is_0() {
    int quality = 30;
    var item = new Item(BAKCSTAGE_PASS, 0, quality);
    GildedRose app = new GildedRose(new Item[]{item});

    app.updateQuality();

    assertEquals(BAKCSTAGE_PASS, item.name);
    assertEquals(0, item.quality);
  }

  @Test
  public void backstage_quality_must_be_set_0_when_SellIn_is_negative_value() {
    int quality = 30;
    var item = new Item(BAKCSTAGE_PASS, -4, quality);
    GildedRose app = new GildedRose(new Item[]{item});

    app.updateQuality();

    assertEquals(BAKCSTAGE_PASS, item.name);
    assertEquals(0, item.quality);
  }

  private GildedRose initializeGildedRoseWithItem(String itemName,
                                                  int itemSellIn,
                                                  int itemQuality) {
    var item = new Item(itemName, itemSellIn, itemQuality);
    return new GildedRose(new Item[]{item});
  }
}
