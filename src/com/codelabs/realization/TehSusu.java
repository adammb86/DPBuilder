package com.codelabs.realization;

import com.codelabs.concretebuilderproduk.MinumanDingin;

/**
 * Created by adammb on 7/28/16.
 */
public class TehSusu extends MinumanDingin{
    @Override
    public String namaProduk() {
        return "Teh Susu";
    }

    @Override
    public int hargaProduk() {
        return 8_000;
    }
}
