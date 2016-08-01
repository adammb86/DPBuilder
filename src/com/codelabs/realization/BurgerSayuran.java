package com.codelabs.realization;

import com.codelabs.concretebuilderproduk.Burger;

/**
 * Created by adammb on 7/28/16.
 */
public class BurgerSayuran extends Burger{
    @Override
    public String namaProduk() {
        return "Burger Sayuran";
    }

    @Override
    public int hargaProduk() {
        return 8_000;
    }
}
