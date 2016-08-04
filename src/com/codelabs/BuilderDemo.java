package com.codelabs;

import com.codelabs.director.BuilderMakanan;
import com.codelabs.product.Makanan;
import java.util.Scanner;


public class BuilderDemo {

    public static void main(String[] args) {
	// write your code here
        String tambahLagi="null";
        String pilihanMakanan;
        String pilihanMinuman;
        int jumlahMakanan;
        int jumlahMinuman;

        Scanner ketik= new Scanner(System.in);


        BuilderMakanan builderMakanan=new BuilderMakanan();

        //coba paketan
        Makanan makanan=builderMakanan.siapkanMakananSayur();
        makanan.tampilItem();
        System.out.println("Harga paket : "+makanan.getHarga());

        do{
            System.out.print("Masukkan makanan yang dipesan   : ");
            pilihanMakanan=ketik.next();
            System.out.print("Masukkan jumlah makanan         : ");
            jumlahMakanan=ketik.nextInt();

            System.out.print("Masukkan minuman yang dipesan   : ");
            pilihanMinuman=ketik.next();
            System.out.print("Masukkan minuman yang dipesan   : ");
            jumlahMinuman=ketik.nextInt();

            makanan=builderMakanan.siapkanMakananCustom(pilihanMakanan,jumlahMakanan,pilihanMinuman,jumlahMinuman);
            makanan.tampilItem();
            System.out.println("Harga pesanan : "+makanan.getHarga());

            System.out.print("Ada pesanan lagi? [ya|tidak]: ");
            tambahLagi=ketik.next();
        }while(tambahLagi.equalsIgnoreCase("ya"));
    }
}
