package com.codelabs.realization;

import com.codelabs.concretebuilderproduk.Burger;

/**
 * Created by adammb on 7/28/16.
 */
class BurgerAyam extends Burger {
    @Override
    public String namaProduk() {
        return "Burger Ayam";
    }

    @Override
    public int hargaProduk() {
        return 12_000;
    }
}
