package com.codelabs.concretebuilderproduk;

import com.codelabs.builder.Item;
import com.codelabs.builder.Kemasan;
import com.codelabs.concretebuilderkemasan.MangkukPlastik;

/**
 * Created by adammb on 7/28/16.
 */
public abstract class Burger implements Item{
    //pertahankan override jika ada return value yang sama
    //kalau berbeda override akan dilakukan pada kelas realisasi

    /*
    @Override
    public String namaProduk() {
        return null;
    }

    @Override
    public int hargaProduk() {
        return 0;
    }

    @Override
    public Kemasan kemasanItem() {
        return null;
    }
    */

    @Override
    public Kemasan kemasanItem(){
        return new MangkukPlastik();
    }
}
