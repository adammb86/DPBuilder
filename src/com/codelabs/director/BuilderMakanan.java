package com.codelabs.director;

import com.codelabs.product.Makanan;
import com.codelabs.realization.BurgerAyam;
import com.codelabs.realization.BurgerSayuran;
import com.codelabs.realization.TehBohay;
import com.codelabs.realization.TehSusu;


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

    public Makanan siapkanMakananCustom(String namaMakanan, int jumlahMakanan, String namaMinuman, int jumlahMinuman){
        Makanan makanan=new Makanan();

        if(namaMakanan.equalsIgnoreCase("burgerayam")) {
            for (int i = 1; i <= jumlahMakanan; i++)
                makanan.addItem(new BurgerAyam());
        }
        else if(namaMakanan.equalsIgnoreCase("burgersayuran")){
            for (int i = 1; i <= jumlahMakanan; i++)
                makanan.addItem(new BurgerSayuran());
        }

        if(namaMinuman.equalsIgnoreCase("tehbohay")){
            for (int i = 1; i <= jumlahMakanan; i++)
                makanan.addItem(new TehBohay());
        }
        else if(namaMinuman.equalsIgnoreCase("tehsusu")){
            for (int i = 1; i <= jumlahMakanan; i++)
                makanan.addItem(new TehSusu());
        }

        //untuk memeriksa apakah ada makanan atau minuman yang sesuai dengan pesanan
        if(makanan.jumlahItem()>0)
            return makanan;
        else
            return null;
    }
}
