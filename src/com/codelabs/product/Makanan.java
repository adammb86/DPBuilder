package com.codelabs.product;

import com.codelabs.builder.Item;

import java.util.ArrayList;

/**
 * Created by adammb on 7/28/16.
 */
public class Makanan {
    ArrayList<Item> items=new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public int getHarga(){
        int total=0;
        for(Item item:items){
            total+=item.hargaProduk();
        }

        return total;
    }

    public void tampilItem(){
        for(Item item:items){
            System.out.println("Nama produk : "+item.namaProduk());
            System.out.println("Harga       : "+item.hargaProduk());
            System.out.println("Kemasan     : "+item.kemasanItem().kemasanProduk());
        }
    }
}
