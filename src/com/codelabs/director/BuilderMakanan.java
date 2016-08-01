package com.codelabs.director;

import com.codelabs.product.Makanan;
import com.codelabs.realization.BurgerSayuran;
import com.codelabs.realization.TehBohay;

/**
 * Created by adammb on 7/28/16.
 */
public class BuilderMakanan {
    //persiapkan method sejumlah paket makanan yang ditawarkan
    //kalau mau custom makanan dan minuman kirim via parameter

    public Makanan siapkanMakananSayur(){
        Makanan makanan=new Makanan();
        makanan.addItem(new BurgerSayuran());
        makanan.addItem(new TehBohay());

        return makanan;
    }

    public Makanan siapkanMakananCustom(String namaMakanan, String namaMinuman){
        Makanan menu=new Makanan();
        if(namaMakanan.equalsIgnoreCase("burger sayuran"))
            menu.addItem(new BurgerSayuran());
        else if(namaMakanan.equalsIgnoreCase("burger ayam"))
            menu.addItem(new BurgerAyam());
        else
            return null;

        if(namaMakanan.equalsIgnoreCase("burger sayuran"))
            menu.addItem(new BurgerSayuran());
        else if(namaMakanan.equalsIgnoreCase("burger ayam"))
            menu.addItem(new BurgerAyam());
        else
            return null;
    }
}
